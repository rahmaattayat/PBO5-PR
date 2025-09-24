package Soal5Interface;

public class Book extends Goods {
    private String author;
    private String isbn;

    public Book(String name, double basePrice, int stock, String author, String isbn) {
        super(name, basePrice, stock);
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    @Override
    public double computeTax() {
        return 0.0;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", author='%s', isbn='%s'", author, isbn);
    }
}
