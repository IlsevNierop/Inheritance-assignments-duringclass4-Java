package nl.novi.javaprogrammeren.overerving;

public class Wolf extends ZooAnimals {

    private String namePack;


    public Wolf(String namePack, String nameKennel, String weekdayLastFed, String countryOrigin, String name, Character sex) {
        super(nameKennel, weekdayLastFed, countryOrigin, name, sex);
        this.namePack = namePack;

    }

    public String getNamePack() {
        return namePack;
    }

    public void setNamePack(String namePack){
        this.namePack = namePack;
    }

    @Override
    void makeSound() {
        System.out.println("Howwlll");
    }
}
