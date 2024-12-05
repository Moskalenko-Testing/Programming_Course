package homework_24.task1;
/*
Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */

public class Triathlete implements Swimmer,Runner {

    @Override
    public void run() {
        System.out.println("Я бегу! ");
    }

    @Override
    public void swim() {
        System.out.println("Я плыву!");

    }
}
