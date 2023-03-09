package nl.novi.javaprogrammeren.overerving;

public abstract class PetAnimals extends Animal{

    private String favouriteFoodBrand;
    private String nameOwner;
    private String species;

    public PetAnimals(String name, Character sex, String favouriteFoodBrand, String nameOwner, String species) {
        super(name, sex);
        this.favouriteFoodBrand = favouriteFoodBrand;
        this.nameOwner = nameOwner;
        this.species = species;
    }


    public String getFavouriteFoodBrand() {
        return favouriteFoodBrand;
    }

    public void setFavouriteFoodBrand(String favouriteFoodBrand) {
        this.favouriteFoodBrand = favouriteFoodBrand;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
