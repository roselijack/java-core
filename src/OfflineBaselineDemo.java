import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

public class OfflineBaselineDemo {
    private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void writeResult (Object[][]  result, String file) throws Exception
    {

        FileWriter writer = new FileWriter(file, false);
        for(int i = 0; i < result.length; i++) {
            if(i > 0) { writer.write("\n"); }
            for(int j = 0; j < result[i].length; j++) {
                if(j > 0) { writer.write(","); }
                if(j == 0) {
                    writer.write(formatter.format(new Date((long)result[i][j])));
                } else {
                    writer.write(String.valueOf(result[i][j]));
                }
            }
        }
        writer.close();
    }

    public static void main(String[] args) throws Exception {

        System.out.println(System.getProperty("user.home"));
        FileReader reader = new FileReader("/Users/rose/Downloads/sensor/old_baseline/offlinebaseline_data.csv");
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        List<Object[]> rows = new ArrayList<>();
        int length = 0;
        while ((line = buffer.readLine()) != null) {
            length++;
            if(length == 1) {
                continue;
            }
            String[] columns = line.split(",");
            Object[] row = new Object[2];
            row[0] = formatter.parse(columns[0]).getTime();
            row[1] = Double.parseDouble(columns[1]);
            rows.add(row);
        }
        length = rows.size();
        Object[][] data = new Object[length][2];
        for(int i = 0; i < length; i++) {
            data[i][0] = rows.get(i)[0];
            data[i][1] = rows.get(i)[1];
        }
        Map<String, Object> params = new HashMap<>();
        params.put("granularity", 60);
        params.put("smooth_bound_scope", 0.05d);
        params.put("bound_generate_method", "low_volatility");
        params.put("bound_wave_coefficient", 3);
        params.put("upper_Bound_enlarge_coefficient", 3);
        params.put("lower_Bound_enlarge_coefficient", 2);
        params.put("global_enlarge_bound_coefficient", 3);
        params.put("bound_window_width", 10);
        params.put("smooth_bound_window_width", 30);
        params.put("upper_detection", true);
        params.put("lower_detection", true);
        params.put("predict_rule", "avg");
        params.put("predict_granularity", 300);


        Object[][] result= com.eoi.algox.core.Algorithm.offlinebaseline_predict(data, params);
        Object[][] result_detect = com.eoi.algox.core.Algorithm.offlinebaseline_detect(data, params);

        writeResult(result,"offlinebaseline_predict.csv");
        writeResult(result_detect,"offlinebaseline_detect.csv");

    }
}
