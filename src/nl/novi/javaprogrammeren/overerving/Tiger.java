package nl.novi.javaprogrammeren.overerving;

public class Tiger extends ZooAnimals{

    private int numberStripes;


    public Tiger(int numberStripes, String nameKennel, String weekdayLastFed, String countryOrigin, String name, Character sex) {
        super(nameKennel, weekdayLastFed, countryOrigin, name, sex);
        this.numberStripes = numberStripes;

    }

    public int getNumberStripes(){
        return numberStripes;
    }

    public void setNumberStripes(int numberStripes){
        this.numberStripes = numberStripes;
    }

    @Override
    void makeSound() {
        System.out.println("Roarrrr");
    }
}
