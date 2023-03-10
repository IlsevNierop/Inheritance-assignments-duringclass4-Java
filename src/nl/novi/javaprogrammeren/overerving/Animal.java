package nl.novi.javaprogrammeren.overerving;

public abstract class  Animal {

    private String name;
    private Character sex;

    private double distanceMoved = 0.25;

    private int hoursSleep = 8;

    public Animal(String name, Character sex){
        this.name = name;
        this.sex = sex;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public Character getSex(){
        return sex;
    }

    public void setSex(Character sex){
        this.sex = sex;
    }

    public double getDistanceMoved(){
        return distanceMoved;
    }
    public int getHoursSleep(){
        return hoursSleep;
    }
    public void move(double distanceMoved){
        System.out.println(this.getName() + " moved " + this.getDistanceMoved() + " meters.");
    }

    abstract void makeSound();

    public void sleep(){
        System.out.println(this.getName() + " is sleeping for " + this.getHoursSleep() + " hours.");
    }

    public void eat(String food){
        System.out.println(this.getName() + " is eating " + food + ".");
    }



}
