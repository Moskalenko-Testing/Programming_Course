package homework_20.Machinery;

public class Phone extends Machinery1 {
    private int price;
    private String setting;

    public Phone(String name, int productYear, int price, String setting) {
        super(name, productYear);
        this.price = price;
        this.setting = setting;
    }
    public boolean checkToOriginal(){
        if(price > 1000){
            System.out.println("Original Iphone");
        }
        return checkToOriginal();
    }
}
