public class Students extends Person{
    private String major;
    private String name;
    public Students(String name,String major)
    {
        super(name);
        this.major = major;


    }
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }



    public void getDescription(){
        System.out.println("I am a students");
    }

}
