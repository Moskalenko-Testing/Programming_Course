package homework_22.human;

/*
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи

У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;

Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых
после пробежки 15 минут, любитель 10, профи 5

В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */
public class Human {
    public void run() {
        System.out.println("Я бегу со скоростью 10 км/ч.");
        rest();
    }

    public void rest() {
        System.out.println("Мне нужно 15 минут на отдых.");
    }
}
