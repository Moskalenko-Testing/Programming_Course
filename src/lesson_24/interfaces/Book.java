package lesson_24.interfaces;

public class Book implements Printale{

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    @Override
    public void print() {
        System.out.printf("Book : %s - (%s)\n", title,author);
    }

}
