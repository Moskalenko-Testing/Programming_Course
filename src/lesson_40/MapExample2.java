package lesson_40;

import java.util.*;

public class MapExample2 {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"red");
        map.put(4,"green");
        map.put(15,"yellow");
        map.put(16,"blue");
        map.put(0,"white");
        map.put(100,"black");
        map.put(17,"orange");
        map.put(7,"red");

        System.out.println(map);

        Collection<String> values = map.values();
        System.out.println("map.values() : " + values);

        Set<Integer> keys = map.keySet();
        System.out.println("map.keySet():" + keys);


        for (Integer key : keys) {
            System.out.print(map.get(key) + " ; ");
        }
        System.out.println();


        keys.remove(17);
        System.out.println("keys: " + keys);
        System.out.println("map : " + map);
        System.out.println("values : " + values);
        values.remove("green");
        map.remove(16);
        System.out.println("keys: " + keys);
        System.out.println("map : " + map);
        System.out.println("values.remove(green)" + values);
        System.out.println("=========\n");
        values.removeAll(List.of("red"));
        System.out.println("map : " + map);
        System.out.println("values : " + values);


//        System.out.println("=====================\n");
//        keys.add(200);
//        System.out.println("keys: " + keys);
//        System.out.println("map : " + map);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("entry : " + entry + " -> ");
            System.out.println("entry.getValue() : " + entry.getValue() + " | ");
            System.out.println("entry.getKey() : " + entry.getKey() + " | ");
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey().equals(100)) {
                entry.setValue("Java!");
            }

        }

        System.out.println();
        System.out.println("map : " + map);

        System.out.println("\n=========Put   vs    Replace================\n");
        System.out.println(map.put(11,"orange"));
        System.out.println(map.put(11,"green"));


        System.out.println(map.replace(200,"red"));
        System.out.println(map.replace(15,"red"));

        System.out.println("map : " + map);
        System.out.println("\n ============================== \n");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            // могу с ними что-то делать
        }

        // Перебор всех пар ключ-значение с возможностью применить к ним какую-то функцию
//        map.forEach((key, value) -> System.out.println("Key: " + key + " | Value: " + value));
        map.forEach((k,v) -> System.out.println(k + "=" + v));


        System.out.println("\n======== Option 2 - многострочное действие ==== ");

        map.forEach((key, value) -> {
            System.out.println("Iteration: ");
            System.out.println("Key: " + key + " | Value: " + value);
            System.out.println("====================\n");
        });





    }
}
