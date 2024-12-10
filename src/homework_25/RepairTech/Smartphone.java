package homework_25.RepairTech;

/*
Реализуйте метод diagnose() (например, проверка экрана и батареи).
метод repair() с учетом особенностей ремонта смартфона (например, "Замена экрана завершена").
 */
public class Smartphone extends Gadget{

    public Smartphone(String ownerName, String model, double repairCost) {
        super(ownerName, model, repairCost);
    }

    @Override
    public void diagnose() {
        System.out.println("Диагностика смартфона: проверка экрана и батареи");
    }

    @Override
    public void repair() {
        System.out.println("Ремонт смартфона: замена экрана завершена");
    }




}
