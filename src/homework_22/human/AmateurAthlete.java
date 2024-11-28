package homework_22.human;

public class AmateurAthlete extends Human{
    @Override
    public void run() {
        System.out.println("Я бегу со скоростью 15 км/ч.");
        rest();
    }

    @Override
    public void rest() {
        System.out.println("Мне нужно 10 минут на отдых.");
    }
}

