package lesson_44.file_io;

import java.io.*;
import java.util.Arrays;

public class FileIoExample {
    public static void main(String[] args) throws InterruptedException {

        File pathDir = new File("files");

        System.out.println(pathDir.mkdir());

        File pathDir2 = new File("files/db/vr1");
        System.out.println(pathDir2.mkdir());

        pathDir = new File("src/lesson_44/file_io/files/example");
        System.out.println(pathDir.mkdirs());

        File lessonDir = new File("src/lesson_44/file_io");
        File pathDb = new File(lessonDir,"db/v01");
        System.out.println(pathDb.mkdirs());

        System.out.println(pathDir.delete());

        pathDb.deleteOnExit();

        Thread.sleep(5);
        System.out.println("Программа завершила работу!");

        File file = new File(lessonDir,"test.txt");

        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("file.exists() = " + file.exists() + " | " + lessonDir.exists());

        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.isDirectory() = " + file.isDirectory());

        System.out.println("file.length() : " + file.length());

        System.out.println(file.lastModified());

        System.out.println("file.getName() : " + file.getName());
        System.out.println("file.getPath() : " + file.getPath());


        String[] names = lessonDir.list();
        System.out.println("names: " + Arrays.toString(names));

        File[] files = lessonDir.listFiles();
        System.out.println("files: " + Arrays.toString(files));

        System.out.println("=======================================\n");

        try {
            FileWriter fileWriter = new FileWriter(file,false);
            fileWriter.write("Hello world!!!");
            fileWriter.write("\n");
            fileWriter.write("String 2");

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("=======================================\n");

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
         String line;
         line = bufferedReader.readLine();
            System.out.println("Чтение завершено : " + line);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
