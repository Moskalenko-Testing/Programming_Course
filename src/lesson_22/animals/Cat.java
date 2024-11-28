package lesson_22.animals;

public class Cat extends Animal{

    @Override
    public void voice() {
        System.out.println("Cat say Meow !!! ");
    }

    public void eat() {
        System.out.println("Cat is eating");
    }

    public void eat(String food) {
        System.out.println("Cat is eating" + food);
    }


}
