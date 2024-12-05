package lesson_24.interfaces;

public interface Printale {

    void print();

    default void defaultMethod(){
        System.out.println("defaultMethod from interface");
    }

    static void staticMethod(){
        System.out.println("Static method from interface");
    }


}
