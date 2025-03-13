package homework_44.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    private static final int LIMIT = 2000;
    private static final File PATH = new File("src/homework_44/task2");
    private static final String DATA_FILE = "data.txt";
    private static final String LESS_FILE = "less.txt";
    private static final String MORE_FILE = "more.txt";

    public static void main(String[] args) {

        List<String> records = readData();
        records.forEach(System.out::println);

        System.out.println("\n=================");

        Map<String, Integer> users = listToMap(records);
        System.out.println(users);

        writeFiles(users);

    }

    private static void writeFiles(Map<String, Integer> users) {
        try (BufferedWriter less = new BufferedWriter(new FileWriter(new File(PATH, LESS_FILE)));
             BufferedWriter more = new BufferedWriter(new FileWriter(new File(PATH, MORE_FILE)))
        ) {
            for (Map.Entry<String, Integer> entry : users.entrySet()) {

                String data = entry.getKey() + ":" + entry.getValue();

                BufferedWriter writer = entry.getValue() < LIMIT ? less : more;

                writer.write(data);
                writer.newLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Map<String, Integer> listToMap(List<String> records) {
        Map<String, Integer> users = new HashMap<>();

        for (String record : records) {
            // user1:2050
            String[] data = record.split(":");

            String name = data[0];
            Integer amount = Integer.valueOf(data[1]);
            // put(name, amount) : put(name, value + amount)
            users.compute(name, (key, value) -> value == null ? amount : value + amount);
        }

        return users;
    }

    private static List<String> readData() {
        List<String> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(new File(PATH, DATA_FILE)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
