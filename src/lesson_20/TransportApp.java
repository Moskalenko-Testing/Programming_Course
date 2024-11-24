package lesson_20;

public class TransportApp {
    public static void main(String[] args) {
        Bus bus = new Bus("Bus- X1", 2020,10);

        System.out.println(bus.toString());
        bus.start();
        bus.stop();

        System.out.println("bus.getModel() : " + bus.getModel());
        System.out.println("bus.getCapacity() : " + bus.getCapacity());

        System.out.println("\n==========================\n");

        Train train = new Train("Train-M1", 2024, 4, 15);
        System.out.println(train.toString());
        System.out.println("train.getCapacity() : " + train.getCapacity());
        train.setCountWagons(6);
        System.out.println("train.getCapacity() : " + train.getCapacity());

        System.out.println("\n==========================\n");
        Bus bus1 = new Bus("Bus-B2", 2024,3);
        System.out.println(bus1.takePassengers());
        System.out.println("count : " + bus1.getCountPassengers());
        System.out.println(bus1.takePassengers());
        System.out.println("2. ==========================");
        System.out.println(bus1.takePassengers());
        System.out.println("3. ==========================");
        System.out.println(bus1.takePassengers());
        System.out.println("4. ==========================");


        System.out.println("count : " + bus1.getCountPassengers());

        System.out.println("\n==========================\n");
        System.out.println(bus1.dropPassengers());

        InternationalBus internationalBus = new InternationalBus("Man-I1",2000,40,new String[]{"Italy","Spain","Monaco"});
        System.out.println(internationalBus.getYear());
        System.out.println(internationalBus.takePassengers());
        System.out.println(internationalBus.toString());
        System.out.println(internationalBus.getCapacity());
        internationalBus.gotoRoute();

    }
}
