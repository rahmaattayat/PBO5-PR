package Soal5Interface;

import java.time.LocalDate;

public class Food extends Goods {
    private LocalDate expiryDate;   

    public Food(String name, double basePrice, int stock, LocalDate expiryDate) {
        super(name, basePrice, stock);
        this.expiryDate = expiryDate;
    }

    public LocalDate getExpiryDate() { return expiryDate; }
    public void setExpiryDate(LocalDate expiryDate) { this.expiryDate = expiryDate; }

    // Contoh kebijakan: 5% dari basePrice
    @Override
    public double computeTax() {
        return 0.05 * getBasePrice();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", expiryDate=%s", expiryDate);
    }
}
