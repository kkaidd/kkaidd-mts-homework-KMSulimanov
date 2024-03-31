package ru.mts.homework;

public class Pet extends AbstractAnimal {
    public Pet(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
    }

    public String getName() {
        System.out.println("getName животного");
        return name;
    }

    public String getBreed() {
        System.out.println("getBreed животного");
        return breed;
    }

    public double getCost() {
        System.out.println("getCost животного");
        return cost;
    }

    public String getCharacter() {
        System.out.println("getCharacter животного");
        return character;
    }
}
