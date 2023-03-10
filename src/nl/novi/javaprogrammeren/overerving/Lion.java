package nl.novi.javaprogrammeren.overerving;

public class Lion extends ZooAnimals{

    private int numberChildren;


    public Lion(int numberChildren, String nameKennel, String weekdayLastFed, String countryOrigin, String name, Character sex) {
        super(nameKennel, weekdayLastFed, countryOrigin, name, sex);
        this.numberChildren = numberChildren;

    }

    public int getNumberChildren(){
        return numberChildren;
    }

    public void setNumberChildren(int numberChildren){
        this.numberChildren = numberChildren;
    }

    @Override
    void makeSound() {
        System.out.println("Prrr prrrr");
    }
}
