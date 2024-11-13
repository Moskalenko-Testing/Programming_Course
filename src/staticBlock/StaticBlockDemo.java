package staticBlock;

public class StaticBlockDemo {
    static int counter = 5;
    static String[] colors = new String[counter];
    private String title;
    private int capacity = 10;

    static {
        System.out.println("Second static block run");
        counter = 25;
    }
    //Статический блок инициализации
   //ВЫзывается этот блок только один раз, в момент загрузки класса JVM
    //Могут быть проинииализированы статические поля(присвоение начальных значений)
    static {
       System.out.println("Static block run!");
       colors = new String[3];
       colors[0]= "red";
       colors[1]= "yellow";
       colors[2]= "green";
       counter = 10;


    }



    {
        System.out.println("NON- static block run!");
        this.title="Block Title";
    }

    public StaticBlockDemo(){
        System.out.println("Empty Constructor run");
    }
    public StaticBlockDemo(String title){
        this.title = title;
        this.capacity = 50;

    }
    public String toString(){
        return String.format("Title : %s,capacity: %d, counter: %d"
                ,title,capacity,counter);
    }
}
