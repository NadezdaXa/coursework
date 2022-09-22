public class Employee {
    private static int counter =0;
    private Integer id;
    private String name;
    private String LastName;
    private String middlename;
    private int department;
    private int salary;

    public Employee (String name,String lastName,String middlename,int department,int salary){
        this.name = name;
        this.LastName = lastName;
        this.middlename = middlename;
        this.department = department;
        this.salary = salary;
        this.id = counter++;

    }

    public static int getCounter() {
        return counter;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int setSalary() {
        this.salary = salary;
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", middlename='" + middlename + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}

