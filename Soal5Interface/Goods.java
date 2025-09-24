package Soal5Interface;

public abstract class Goods implements Taxable {
    private String name;
    private double basePrice; // harga sebelum pajak
    private int stock;

    protected Goods(String name, double basePrice, int stock) {
        this.name = name;
        this.basePrice = basePrice;
        this.stock = stock;
    }

    // Enkapsulasi (getter/setter)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBasePrice() { return basePrice; }
    public void setBasePrice(double basePrice) {
        if (basePrice < 0) throw new IllegalArgumentException("Harga tidak boleh negatif");
        this.basePrice = basePrice;
    }

    public int getStock() { return stock; }
    public void setStock(int stock) {
        if (stock < 0) throw new IllegalArgumentException("Stok tidak boleh negatif");
        this.stock = stock;
    }

    // Harga final yang dibayar = base + pajak
    public double getFinalPrice() {
        return getBasePrice() + computeTax();
    }

    @Override
    public String toString() {
        return String.format("%s{name='%s', basePrice=%.2f, tax=%.2f, finalPrice=%.2f, stock=%d}",
                this.getClass().getSimpleName(), name, basePrice, computeTax(), getFinalPrice(), stock);
    }
}

