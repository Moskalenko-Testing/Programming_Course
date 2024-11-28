package homework_22.human;

public class AmateurPro extends AmateurAthlete {
    @Override
    public void run() {
        System.out.println("Я бегу со скоростью 25 км/ч.");
        rest();
    }

    @Override
    public void rest() {
        System.out.println("Мне нужно 5 минут на отдых.");
    }
}

