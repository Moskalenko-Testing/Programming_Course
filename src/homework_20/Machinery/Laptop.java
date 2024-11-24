package homework_20.Machinery;

public class Laptop extends Machinery1 {
    private int gamingGPU;

    public Laptop(String name, int productYear, int gamingGPU) {
        super(name, productYear);
        this.gamingGPU = gamingGPU;
    }
}


