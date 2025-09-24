public class ManagerTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // Naikkan gaji 5% (Manager akan mendapat tambahan bonus masa kerja)
        for (int i = 0; i < staff.length; i++) {
            staff[i].raiseSalary(5);
        }

        System.out.println("== After raiseSalary ==");
        for (int i = 0; i < staff.length; i++) {
            staff[i].print();
        }
    }
}
