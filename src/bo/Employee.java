package bo;

/**
 * Created by steampilot on 24.03.15.
 */
public class Employee extends Person {
    private float salary;
    public Employee() {
    }
    public Employee(String firstName, String lastName, int salary) {
        this.setVorname(firstName);
        this.setName(lastName);
        this.setSalary(salary);
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
