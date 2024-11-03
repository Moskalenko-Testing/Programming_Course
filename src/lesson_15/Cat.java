package lesson_15;

public class Cat {
    //поля класса, описывающие совйста / характеристики
    String name;
    String color;
    int age;

    public Cat (String catName){
        name = catName;
    }
    public Cat(){

    }

    public void sleep(){
        System.out.println("Я сплю!");
    }
    public void run(){
        System.out.println("Я бегу!");
    }
    public void sayMeow(){
        System.out.println("Мяу!");

    }
}
