package homework_24.task2_1;

public abstract class VusaMember {

    private final String currency;

    private double courseBTC;
    protected String title;
    protected double balance;

    public String getTitle() {
        return title;
    }

    public String getCurrency() {
        return currency;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public VusaMember(String title, double balance, String currency) {
        this.title = title;
        this.balance = balance;
        this.currency = currency;
        setActualBTCCourse(currency);

    }
    public void setActualBTCCourse(String currency){
        this.courseBTC = 101_400;
    }


}
