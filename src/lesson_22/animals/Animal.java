package lesson_22.animals;

public class Animal {

    public void voice(){
        System.out.println("Animal say something");
    }

    @Override
    public String toString(){
        return "Animal to String";
    }
}
