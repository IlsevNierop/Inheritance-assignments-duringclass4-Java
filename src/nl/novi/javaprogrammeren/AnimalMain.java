package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AnimalMain {

    public static void main(String[] args) {

        Lion l1 = new Lion(5, "east", "Wednesday", "South-Africa", "Kees", 'm');
        l1.eat("Zebra");
        l1.move(l1.getDistanceMoved());
        l1.sleep();
        l1.setName("Kees2.0");
        l1.eat("hond");

        Dog d1 = new Dog("Piet", 'f', "pedigree", "Jan", "Labrador");

        Lion l2 = new Lion(5, "east2", "Tuesday", "South-Africa", "Jan", 'm');

        Tiger t1 = new Tiger(25, "west", "Monday", "Zimbabwe", "Tiger2", 'f');

        Wolf w1 = new Wolf("Woelfies", "Corner Kennel", "Sunday", "Belize", "Wolf2", 'm');

        Cat c1 = new Cat("Lola", 'f', "CatFood", "Simone", "black cats");

        d1.eat("Pedigree");
        d1.sleep();

        ArrayList<Animal> allAnimals = new ArrayList<>();
        allAnimals.add(l1);
        allAnimals.add(l2);
        allAnimals.add(t1);
        allAnimals.add(w1);
        allAnimals.add(d1);
        allAnimals.add(c1);

        ArrayList<Animal> zooAnimals = new ArrayList<>();

        Type supClassAnimal = null;
        for (int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i) instanceof ZooAnimals){
                zooAnimals.add(allAnimals.get(i));
            }
        }

        for (Animal b: allAnimals){
            System.out.println(b.getName() + " is an Animal.");
        }

        for (Animal a: zooAnimals){
            System.out.println(a.getName() + " is in the Zoo.");
        }

    }
}


    //Hieronder de uitleg
    /*
    Het is traditie om overerving uit te leggen met behulp van dieren. Hier ontkomen jullie dus ook niet aan.

    Opdracht
    Bekijk de beschrijving van onderstaande dieren. Bedenk wat je in de superklasse kan zetten. De subklassen moet je ook gaan maken.

    Van een Leeuw slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
    herkomst op en de hoeveelheid kinderen.

    Van een Tijger slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
    herkomst op. Ook willen we het aantal strepen weten.

    Van een Hond slaan we naam, naam van het baasje, favoriete voedselmerk, geslacht en soort op.
    Van een Kat slaan we de naam, naam van het baasje, favoriete voedsel merk, geslacht en soort op. Ook willen we weten
    of het een binnen of buitenkat is.

    Van een Wolf slaan we de naam, naam van het hok, geslacht, weekdag dat die voor het laatste gevoed is en land van
    herkomst op. Ook willen we de naam van de roedel weten.

    Alle dieren moeten kunnen bewegen. Dit moet als methode toegevoegd worden. Wanneer een dier beweegt print je in
    de console dat deze 0.25 meter is verplaatst.

    Alle dieren moeten ook een maak-geluid-methode hebben waarmee je het geluid van de dieren afdrukt naar de console.

    Alle dieren slapen 8 uur per dag. Maak een methode slapen en print dit uit wanneer de methode wordt aangeroepen.

    Alle dieren eten. Maak een methode die een String ontvangt en print dan uit wat het dier eet.

    Alles staat hier in het Nederlands beschreven. Schrijf je klassen-, variabele en methodenamen in het Engels.


    Bonus: zoo klasse - alleen dierentuin dieren aan toevoegen

     */


