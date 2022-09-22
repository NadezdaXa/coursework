import java.util.Arrays;

public class Main {
    private static Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        Employee emp1 = new Employee("Иван", "Иванов", "Иванович", 1, 5000);
        Employee emp2 = new Employee("Алексей", "Иванов", "Иванович", 1, 6000);
        employees[0] = emp1;
        employees[1] = emp2;
        Employee[] emp = Arrays.copyOf(employees, 11);

        Arrays.stream(emp).forEach(System.out::println);
        System.out.println(emp.length);
    }
    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.setSalary();
        }
        return sum;
    }
    public static Employee findEmpLoyeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].setSalary();
        for (Employee employee:employees){
            if (employee.setSalary()<minSalary){
                minSalary=employee.setSalary();
                result=employee;
            }
        }
        return result;
    }
    public static Employee findEmpLoyeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].setSalary();
        for (Employee employee : employees) {
            if (employee.setSalary() > maxSalary) {
                maxSalary = employee.setSalary();
                result = employee;
            }
        }
        return result;
    }
    public static float calculateAverageSalary(){
        return calculateTotalSalary()/(float) employees.length;
    }
    public static void printFullNames(){
        for (Employee employee:employees){
            System.out.println(employee.setSalary());
        }

    }

}