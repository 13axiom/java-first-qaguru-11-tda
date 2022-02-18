package guru.qa;

public class Book {
    String author = "not_specified";
    String name;
    int countOfCopies = 0;
    float price;
    boolean newBook;

    void getInfoAboutTheBook() {
        System.out.println("название: \"" + name + "\", автор: \"" + author + "\".");
        System.out.println("Кол-во книг в магазине: " + countOfCopies);
        System.out.println("Цена книги: " + price + " руб.");
        System.out.println("Новинка?: " + newBook);
    }
}
