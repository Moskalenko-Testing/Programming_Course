package lesson_27;

public class AutoApp {
    public static void main(String[] args) {

        Color red = Color.BLUE;

        Auto auto = new Auto("Model1", Color.BLUE);
        System.out.println(auto);

        auto.setColor(red);
        System.out.println(auto);

        System.out.println("\n===============\n");

        // Возвращает массив значений
        Color[] colors = Color.values();

        for (Color currentColor : colors) {
            System.out.println(currentColor);
        }

        // Возвращает enum по строковому имени
        Color color1 = Color.valueOf("RED");
        System.out.println("color1: " + color1);

        // Получить имя константы (строку)
        String name = Color.GREEN.name();
        System.out.println("name: " + name.toLowerCase());

        // Получить порядковый номер константы (начиная с 0)
        int ordinal = Color.BLUE.ordinal();
        System.out.println("ordinal: " + ordinal);

        System.out.println("\n ============== \n");

        switch (auto.getColor()) {
            case RED:
                System.out.println("Цвет машины красный!");
                break;
            case BLUE:
                System.out.println("Цвет машины голубой");
                break;
            case GREEN:
                System.out.println("Цвет машины зеленый");
            default:
                System.out.println("Какой-то другой цвет");
        }

        System.out.println("\n================\n");
        // Enum, безопасно сравнивать на равенство оператором ==

        auto.setColor(Color.BLUE);
        if (auto.getColor() == Color.BLUE) {
            System.out.println("Цвет машины синий");
        } else {
            System.out.println("Не синий");
        }
    }
}
