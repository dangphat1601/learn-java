package lab_07_01;

public class ContractEmployee extends Employee {
    private static int salary = 40000;

    public ContractEmployee(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
