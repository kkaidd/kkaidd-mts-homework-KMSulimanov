package ru.mts.homework;

public abstract class AbstractAnimal implements Animal {
    protected String breed; //порода
    protected String name; // имя
    protected Double cost; //ценавмагазине
    protected String character; //характер

    public AbstractAnimal(String breed, String name, double cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
    }

    // Реализация методов интерфейса Animal
    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }

}
