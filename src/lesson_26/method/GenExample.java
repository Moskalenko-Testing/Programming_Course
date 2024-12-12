package lesson_26.method;

public class GenExample<K, V> {
    private K key;
    private V value;

    public GenExample(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenExample{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
        GenExample<Integer, String> genExample = new GenExample<Integer, String>(100, "String");


        System.out.println(genExample);

        GenExample<String, String> stringGenExample =
                new GenExample<>("Java", "Hello");
    }
}
