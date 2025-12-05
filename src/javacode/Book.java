package javacode;

public class Book {

    private static final int FIX_PRICE = 250;

    public String title;

    public int releaseYear;

    public Author author;

    public int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        return this.pages > 500;
    }

    public boolean matches(String word) {
        return title.contains(word) || this.author.name.contains(word) || this.author.surname.contains(word);
    }

    public int estimatePrice() {
        int priceRound = (int) Math.floor(((3 * pages) * Math.sqrt(this.author.rating)));
        return Math.min(priceRound, FIX_PRICE);
    }

}
