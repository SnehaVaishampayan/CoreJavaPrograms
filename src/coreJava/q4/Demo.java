package src.coreJava.q4;

public class Demo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(1); e.setName("name1"); e.setSalary(100);
        System.out.println("Employee Id " + e.getId());
        System.out.println("Employee Id " + e.getName());
        System.out.println("Employee Id " + e.getSalary());
    }
}
