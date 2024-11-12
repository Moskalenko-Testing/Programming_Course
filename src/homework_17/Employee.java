package homework_17;

/*Task 0
Написать класс Employee (Работник)

У него должны быть поля имя, возраст, зарплата

Инкапсулировать класс.

Написать метод info() выводящий информацию о работнике.

 */
public class Employee {
    private String name;
    private int age;
    private double salary;


    public void info() {
        System.out.printf("Меня зовут : %s, мой возраст: %d, моя зарплата : %f\n", name, age, salary);
    }
}