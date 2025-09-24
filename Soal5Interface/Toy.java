package Soal5Interface;

public class Toy extends Goods {
    private int minAge;  

    public Toy(String name, double basePrice, int stock, int minAge) {
        super(name, basePrice, stock);
        if (minAge < 0) throw new IllegalArgumentException("Usia minimal tidak valid");
        this.minAge = minAge;
    }

    public int getMinAge() { return minAge; }
    public void setMinAge(int minAge) {
        if (minAge < 0) throw new IllegalArgumentException("Usia minimal tidak valid");
        this.minAge = minAge;
    }

    @Override
    public double computeTax() {
        return 0.10 * getBasePrice();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", minAge=%d", minAge);
    }
}