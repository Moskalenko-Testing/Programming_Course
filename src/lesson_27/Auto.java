package lesson_27;

public class Auto {

    private String model;

    private Color color;

    public Auto(String model, Color color1) {
        this.model = model;
        this.color = color1;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public Color getColor() {

        return color;
    }

    public void setColor(Color color) {

        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", color=" + color +
                '}';
    }

}
