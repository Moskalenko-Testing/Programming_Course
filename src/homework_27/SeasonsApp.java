package homework_27;

import lesson_27.Day;

public class SeasonsApp {
    public static void main(String[] args) {
        for (Seasons seasons : Seasons.values()){
            System.out.println("seasons - " + seasons);
            System.out.println("SeasonName - " + seasons.getSeasonName());
            System.out.println("SeasonTemperature - " + seasons.getAverageTemperature());
            System.out.println(seasons.testMethod());
            System.out.println("\n========================\n");


    }
}
}
