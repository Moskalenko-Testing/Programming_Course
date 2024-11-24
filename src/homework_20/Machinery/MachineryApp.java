package homework_20.Machinery;

public class MachineryApp {
    public static void main(String[] args) {

       Phone phone = new Phone("Iphone 16",2024,1100,"Camera 50MP");
       Laptop laptop = new Laptop("AsusNitro5",2022,3060);

        System.out.println(phone.checkToOriginal());
        System.out.println(phone.toString());
        System.out.println(laptop.toString());
    }
}
