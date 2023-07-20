import java.util.Objects;

public class Employee {
    String fullName;
    int office;
    int salary;

    static int COUNTER = 0;
    int id;

    public Employee(String fullName, int office, int salary) {
        this.fullName = fullName;
        this.office = office;
        this.salary = salary;
        this.id = COUNTER++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " ФИО: " + fullName + ", отдел: " + office + ", зарплата: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getOffice() == employee.getOffice() && getSalary() == employee.getSalary() && getId() == employee.getId() && Objects.equals(getFullName(), employee.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getOffice(), getSalary(), getId());
    }
}
