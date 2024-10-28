package homework_03;

public class Homework_03 {
    public static void main(String[] args) {
        int myAge = 25;
        int costMilk = 30;
        String name = "Artur";
        System.out.printf("Age : %d, CostMilk : %d, Name: %s\n", myAge,costMilk,name);

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int res = (a + b + c + d) / 4;
        System.out.println(res);
        res = (a + b + c + d) % 4;
        System.out.println(res);


        double priceA = 1000;
        double priceB = 500;

        double discout = 10;
        double totalPrice = priceA + priceB;
        double discountAmount = totalPrice * (discout / 100) ;
        double discountPrice = totalPrice - discountAmount;
        System.out.println("discountAmount\t"  + discountAmount);
        System.out.println("discountPrice\t"  + discountPrice);

        double tempM = 26.7;
        double tempTue = 27.7;
        double tempW = 25.8;
        double tempThu = 24.0;
        double tempF = 22.3;
        double tempSat = 28.3;
        double tempSun = 29.5;

        double averageTemperature = (tempM + tempTue + tempW + tempThu + tempF + tempSat + tempSun) / 7;
        System.out.printf("averageTemperature %.2f" , averageTemperature);








    }
}
