package Soal5Interface;

import java.time.LocalDate;

public class MainTest {
    public static void main(String[] args) {
        Goods g1 = new Food("Roti Tawar", 20000, 50, LocalDate.now().plusDays(5));
        Goods g2 = new Toy("Action Figure", 150000, 10, 8);
        Goods g3 = new Book("Pemrograman Java", 120000, 5, "Rahma A. Tamimah", "978-602-XXXXXX");

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);

        g2.setBasePrice(175000);
        System.out.printf("Setelah update harga mainan: final=%.2f (pajak=%.2f)%n",
                g2.getFinalPrice(), g2.computeTax());
    }
}
