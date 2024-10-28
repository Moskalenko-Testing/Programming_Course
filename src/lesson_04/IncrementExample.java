package lesson_04;

public class IncrementExample {
    public static void main(String[] args) {
        int var = 5;
        var = var + 10;
        System.out.println("var: " + var);


        var += 2; // var + var + 2;
        System.out.println("var: " + var);


        var -=2; //var + var - 2;
        System.out.println("var - : " + var);

        var *=2; //var + var * 2;

        var /=2; //var + var / 2;

        var++;//дикремент
        var--;//инкремент

    }
}
