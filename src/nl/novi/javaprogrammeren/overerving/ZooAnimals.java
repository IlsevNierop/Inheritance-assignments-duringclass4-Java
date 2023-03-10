package nl.novi.javaprogrammeren.overerving;

public abstract class ZooAnimals extends Animal {

    private String nameKennel;

    private String weekdayLastFed;

    private String countryOrigin;

    public ZooAnimals (String nameKennel, String weekdayLastFed, String countryOrigin, String name, Character sex) {
        super(name, sex);
        this.nameKennel = nameKennel;
        this.weekdayLastFed = weekdayLastFed;
        this.countryOrigin = countryOrigin;


    }

    public String getNameKennel() {
        return nameKennel;
    }

    public void setNameKennel(String nameKennel) {
        this.nameKennel = nameKennel;
    }

    public String getWeekdayLastFed() {
        return weekdayLastFed;
    }

    public void setWeekdayLastFed(String weekdayLastFed) {
        this.weekdayLastFed = weekdayLastFed;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }
}
