package nl.novi.javaprogrammeren.overerving;

public class Cat extends PetAnimals{

    private boolean indoorCat;
    public Cat(String name, Character sex, String favouriteFoodBrand, String nameOwner, String species) {
        super(name, sex, favouriteFoodBrand, nameOwner, species);

    }

    public boolean isIndoorCat() {
        return indoorCat;
    }

    public void setIndoorCat(boolean indoorCat) {
        this.indoorCat = indoorCat;
    }

    @Override
    void makeSound() {
        System.out.println("Miauw miauw");
    }
}
