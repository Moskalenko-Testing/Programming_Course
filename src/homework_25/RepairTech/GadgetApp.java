package homework_25.RepairTech;

public class GadgetApp {
    public static void main(String[] args) {
        Gadget smartphone = new Smartphone("Mike","Iphone 14 pro",500);
        Gadget laptop = new Laptop("Katy","Asus ROG Strix 15",250);

        Workshop workshop = new Workshop();

        workshop.processRepair(smartphone);


        System.out.println("\n==========================\n");


        workshop.processRepair(laptop);
    }
}
