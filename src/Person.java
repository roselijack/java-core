public abstract class Person {
    private String name;
    public abstract void getDescription();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Person(String name)
    {
        this.name = name;
    }

    public static void main(String[] args)
    {
        Person[] person = new Person[2];
        person[0] = new Employee("ROSE",2000,1988,11,24);
        person[1] = new Students("Jack","network");
        for(Person p:person)
        {
            p.getDescription();
        }

    }
}

