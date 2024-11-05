package homework_15;

public class Teacher_Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Петров", "Иван", 3.8);
        teacher.corrupt();
        Teacher teacher1 = new Teacher("Василий", "Иванов", 4.7);
        teacher1.honest();
        Teacher teacher2 = new Teacher("Доцент",4.5,85);
        teacher2.systemic();
        Teacher teacher3 = new Teacher("Шишков","Василий",68,3.5);
        teacher3.bad();
    }

}
