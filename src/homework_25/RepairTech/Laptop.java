package homework_25.RepairTech;

/*
Laptop (подкласс Gadget):
Реализуйте метод diagnose() (например, проверка состояния жесткого диска и системы охлаждения).
Дополните метод repair() с учетом ремонта ноутбука (например, "Замена кулера завершена").
Создайте класс Workshop, который выполняет:
 */
public class Laptop extends Gadget{

    public Laptop(String ownerName, String model, double repairCost) {
        super(ownerName, model, repairCost);
    }

    @Override
    public void diagnose() {
        System.out.println("Диагностика ноутбука: проверка состояния жесткого диска и системы охлаждения");
    }

    @Override
    public void repair() {
        System.out.println("Ремонт ноутбука: замена кулера завершена");
    }

}
