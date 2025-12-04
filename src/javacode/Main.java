package javacode;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Bob", "Smith", 30);

        Book book = new Book("The Monster", 1999, author, 450);

        System.out.println("Является ли книга большой? Ответ: " + book.isBig());

        System.out.println("Есть ли данное слово 'Bob' в названии книги, имени или фамилии автора? Ответ: " + book.matches("Bob"));

        System.out.println("Есть ли данное слово 'Monster' в названии книги, имени или фамилии автора? Ответ: " + book.matches("Monster"));

        System.out.println("Есть ли данное слово 'monster' в названии книги, имени или фамилии автора? Ответ: " + book.matches("monster"));

        System.out.println("Оценка стоимости книги = " + book.estimatePrice());

    }
}
