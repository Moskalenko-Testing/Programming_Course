package lesson_24.interfaces;

public class PrinterApp {
    public static void main(String[] args) {

        Printale book = new Book("Философия Java","Б.Эккель");

        book.print();

        book.defaultMethod();

        Printale.staticMethod();

        System.out.println("\n============================\n");

        Printale journal = new Journal("Cosmopolitan",154);
        journal.print();
        journal.defaultMethod();


        System.out.println("\n============================\n");
        ColorPrintable colorPrintable = new Presentation("Inheritance","Noname","Inheritance in OOP",20);

        colorPrintable.colorPrint();
        colorPrintable.print();
        colorPrintable.defaultMethod();
    }
}
