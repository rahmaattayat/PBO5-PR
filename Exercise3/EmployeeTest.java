public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // Naikkan gaji 5%
        for (int i = 0; i < staff.length; i++) {
            staff[i].raiseSalary(5);
        }

        System.out.println("== Before sort ==");
        for (Employee e : staff) e.print();

        // Sort berdasarkan salary (menaik) menggunakan Shell Sort di Sortable
        Sortable.shell_sort(staff); // covariant array → Employee[] bisa diperlakukan sebagai Sortable[]

        System.out.println("== After sort (by salary ascending) ==");
        for (Employee e : staff) e.print();
    }
}
