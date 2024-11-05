package homework_15;

public class Teacher {
    String name;
    String Position;
    int age;
    String surname;
    double rate;

    public Teacher (String teacher_name, String teacher_surname, double rate){
        name = teacher_name;
        surname = teacher_surname;
        System.out.printf("Фамилия : %s, имя: %s, рейтинг: %f\n", name, surname, rate);
    }
    public Teacher(String majorPosition,double rate,int teach_age){
        this.rate = rate;
        Position = majorPosition;
        age = teach_age;
        System.out.printf("Позиция: %s,Рейтинг: %f,Возраст: %d\n",majorPosition,rate,teach_age);
    }
    public Teacher(String surname,String name,int age,double rate){
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.rate = rate;
        System.out.printf("Фамилия: %s,Имя: %s,Возраст:%d,Рейтинг: %f\n",surname,name,age,rate);


    }
    public void cool(){
        System.out.println("Я добрый учитель!");
    }
    public void bad(){
        System.out.println("Я агрессивный препод ");
    }
    public void corrupt(){
        System.out.println("Я беру взятки");
    }
    public void honest(){
        System.out.println("Я никогда не беру взятки ");
    }
    public void systemic(){
        System.out.println("Я всегда прихожу пораньше");
    }


}
