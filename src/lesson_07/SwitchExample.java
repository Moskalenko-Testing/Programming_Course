package lesson_07;

public class SwitchExample {
    public static void main(String[] args) {

        /*
        switch - позволяет сравнивать значение переменной с несколькими значениями
        switch(переменная для сравнения){
            case значение 1:
                //Блок кода 1
                case значение 2:
                //Блок кода 2
                case значение 3:
                //Блок кода N
                default:
                //Блок кода default
         */
        int x = 35;

        if(x == 5){
            System.out.println("if : х равен 5");
        }else if (x == 7){
            System.out.println("if : х равен 7");
        }else {
            System.out.println("if : что-то другое");
        }
        //Switch
        switch (x) {
            case 5:
                System.out.println("switch : х равен 5");
                break;
            case 7:
                System.out.println("switch : х равен 7");
                break;
            default:
                System.out.println("switch : что-то другое");

        }
    }

}
