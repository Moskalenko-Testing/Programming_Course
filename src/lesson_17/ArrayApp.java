package lesson_17;

public class ArrayApp {
    public static void main(String[] args) {

        int[] ints = {10, 20, 50, -25, 35, 45, 100, -1, 50};

        MagicArray17 magicArray = new MagicArray17(ints);

        System.out.println(magicArray.toString());

        System.out.println(magicArray.indexOf(10));

        System.out.println(magicArray.removeByValue(20));

        System.out.println(magicArray.toString());

        System.out.println(magicArray.set(100,1000));

        System.out.println(magicArray.toString());

        System.out.println(magicArray.set(0,1000));

        System.out.println(magicArray.toString());
    }
}
