package nl.novi.javaprogrammeren.overerving;

public class Dog extends PetAnimals {


    public Dog(String name, Character sex, String favouriteFoodBrand, String nameOwner, String species) {
        super(name, sex, favouriteFoodBrand, nameOwner, species);

    }


    @Override
    void makeSound() {
        System.out.println("Woof woof");
    }
}
