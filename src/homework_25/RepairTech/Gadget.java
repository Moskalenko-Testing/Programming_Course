package homework_25.RepairTech;

/*
ownerName — имя владельца гаджета.
model — модель устройства.
repairCost — стоимость ремонта.
Конструктор для инициализации этих полей.
Реализацию метода getRepairCost(), который возвращает значение поля repairCost.
Реализуйте два класса:

Smartphone (подкласс Gadget):
Реализуйте метод diagnose() (например, проверка экрана и батареи).
метод repair() с учетом особенностей ремонта смартфона (например, "Замена экрана завершена").
Laptop (подкласс Gadget):
Реализуйте метод diagnose() (например, проверка состояния жесткого диска и системы охлаждения).
Дополните метод repair() с учетом ремонта ноутбука (например, "Замена кулера завершена").
Создайте класс Workshop, который выполняет:

Метод processRepair(Gadget gadget), который:
Проводит диагностику устройства.
Ремонтирует устройство.
Выводит информацию о завершении ремонта и его стоимости.
 */
public abstract class Gadget implements Repairable {
    protected String ownerName;
    public String model;
    protected double repairCost;

    public Gadget(String ownerName, String model, double repairCost) {
        this.ownerName = ownerName;
        this.model = model;
        this.repairCost = repairCost;
    }

    @Override
    public double getRepairCost() {
        return repairCost;
    }
}

