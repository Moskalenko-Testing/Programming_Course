package consultation_01.main;

import consultation_01.main.controller.BookController;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        BookController bookController = new BookController();
        bookController.run();
        bookController.run();
    }
}

