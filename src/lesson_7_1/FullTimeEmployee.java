package lesson_7_1;
public class FullTimeEmployee extends Employee {
    private static int salary = 50000;

    public FullTimeEmployee(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return salary;
    }

}
