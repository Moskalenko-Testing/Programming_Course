package homework_27;

public enum Seasons {
    Spring("Весна",8.4),
    Summer("Лето",17.1),
    Authumn("Осень",9.6),
    Winter("Зима",1.4);

    private String SeasonName;
    private double AverageTemperature;

    public String testMethod(){
        return String.format("%s - русский перевод: %s; средняя температура сезона: %.1f",this.name(),this.SeasonName,this.AverageTemperature);
    }

    Seasons(String seasonName, double averageTemperature) {
        SeasonName = seasonName;
        AverageTemperature = averageTemperature;
    }

    public String getSeasonName() {
        return SeasonName;
    }

    public void setSeasonName(String seasonName) {
        SeasonName = seasonName;
    }

    public double getAverageTemperature() {
        return AverageTemperature;
    }

    public void setAverageTemperature(double averageTemperature) {
        AverageTemperature = averageTemperature;
    }
}
