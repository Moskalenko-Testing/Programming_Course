package homework_25.RepairTech;

public class Workshop {
    public void processRepair(Gadget gadget) {
        System.out.printf("Начало ремонта для устройства: %s, владелец: %s%n",
                gadget.model, gadget.ownerName);
        gadget.diagnose();
        gadget.repair();
        System.out.printf("Ремонт завершён. Стоимость ремонта: %.2f USD.%n",
                gadget.getRepairCost());
    }
}
