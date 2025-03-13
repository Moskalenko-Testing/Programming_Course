package lesson_44.cats;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatsWriterReader {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>(List.of(
                new Cat("Cat",9,true),
                new Cat("John",2,true),
                new Cat("Maria",7,false),
                new Cat("Boris",4,true),
                new Cat("Catty",2,false),
                new Cat("Hanna",6,false),
                new Cat("Sebastian Junior",1,true)
        ));

        File path = new File("src/lesson_44/cats/files");
        path.mkdirs();

        File file = new File(path,"cats.txt");

        writeCatsToFile(cats,file);

        List<Cat> newCats = readCatsFromFile(file);

        newCats.forEach(System.out::println);
    }

    private static List<Cat> readCatsFromFile(File file) {

        List<Cat> cats = new ArrayList<>();

        try (BufferedReader bReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bReader.readLine()) != null) {
                Cat cat = parseCatFromLine(line);
                cats.add(cat);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cats;
    }

    private static Cat parseCatFromLine(String line) {
        System.out.println( "line = " + line);

        String[] parts = line.split("\\|");
        // System.out.println("arraysElements : " + Arrays.toString(parts));

        return new Cat(parts[0],Integer.parseInt(parts[1]),Boolean.valueOf(parts[2]));
    }

    private static void writeCatsToFile(List<Cat> cats, File file) {

        if (file.exists()) file.delete();

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Cat cat : cats) {
            try (BufferedWriter bWriter = new BufferedWriter(new FileWriter(file,true))) {

                    String toWrite = cat.getName() + "|" + cat.getAge() + "|" + cat.isMale();
                    bWriter.write(toWrite);
                    bWriter.newLine();


                } catch(IOException e){
                    throw new RuntimeException(e);
                }
            }

            System.out.println("Запись в файл завершена");
        }
    }

