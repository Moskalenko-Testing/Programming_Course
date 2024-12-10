package lesson_25.generics;

public class GenericApp {
    public static void main(String[] args) {

        GenericBox<String> box = new GenericBox<>("Hello");

        String srtVal = box.getValue();

        System.out.println(srtVal.length());
        System.out.println(box.getValue().toUpperCase());

        box.setValue("Test");
        System.out.println(box);

        System.out.println("\n==========================\n");



    }
}
