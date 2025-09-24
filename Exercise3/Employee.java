import java.util.Objects;

class Employee extends Sortable {
    private String name;
    protected double salary; // protected agar bisa diakses subclass (Manager)
    private int hireday;
    private int hiremonth;
    private int hireyear;

    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }

    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100.0;
    }

    public int hireYear() {
        return hireyear;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Implementasi kontrak Sortable: urutkan berdasarkan salary (menaik)
    @Override
    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (this.salary < eb.salary) return -1;
        if (this.salary > eb.salary) return +1;
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary +
               ", hireDate=" + hireday + "-" + hiremonth + "-" + hireyear + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee)) return false;
        Employee e = (Employee) o;
        return Objects.equals(name, e.name) &&
               Double.compare(salary, e.salary) == 0 &&
               hireday == e.hireday && hiremonth == e.hiremonth && hireyear == e.hireyear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireday, hiremonth, hireyear);
    }
}
