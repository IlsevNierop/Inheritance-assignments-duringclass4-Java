package nl.novi.javaprogrammeren.overerving;

public abstract class  Animal {

    private String name;
    private Character sex;

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
}
