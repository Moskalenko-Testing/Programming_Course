package homework_36;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {
    public static void main(String[] args) {
        Sportsman[] sportsmen = new Sportsman[6];
        sportsmen[0] = new Sportsman("Ivan", 20, 1000);
        sportsmen[1] = new Sportsman("Petr", 21, 3000);
        sportsmen[2] = new Sportsman("Alex", 22, 2000);
        sportsmen[3] = new Sportsman("Alexey", 23, 6000);
        sportsmen[4] = new Sportsman("Nikolay", 24, 1800);
        sportsmen[5] = new Sportsman("Vitaliy", 25, 5300);

        Arrays.sort(sportsmen);
        System.out.println(Arrays.toString(sportsmen));

        System.out.println("\n===============================\n");

        Arrays.sort(sportsmen, new ComparatorSportsScore());
        System.out.println(Arrays.toString(sportsmen));

        System.out.println("\n===============================\n");

        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman sport1, Sportsman sport2) {
                return sport1.getAge() - (sport2.getAge());
            }
        });
                System.out.println(Arrays.toString(sportsmen));



            }
        }
