package homework_20.Machinery;

/*
Придумать и написать как минимум одну иерархию классов в которой будет один родительский клас и два наследника,
расширяющих его функционал

У родительского класса должен быть метод создающий строку с информацией об объекте (метод String toString())
 */
public class Machinery1 {
    private String name;
    private int productYear;

    public Machinery1(String name, int productYear) {
        this.name = name;
        this.productYear = productYear;
    }
    public String toString(){
        return name + ", год выпуска : " + productYear;
    }

}
