package homework_26;

public class PairApp {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("Hello", "World");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        pair.swap();
        System.out.println("\n================\n");

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
