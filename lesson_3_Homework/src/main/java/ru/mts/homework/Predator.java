package ru.mts.homework;

public class Predator extends AbstractAnimal {
    public Predator(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
    }

    @Override
    public String getName() {
        System.out.println("Домашние животные");
        return name;
    }
    @Override
    public String getBreed() {
        System.out.println("Домашние животные");
        return breed;
    }
    @Override
    public double getCost() {
        System.out.println("Домашние животные");
        return cost;
    }
    @Override
    public String getCharacter() {
        System.out.println("Домашние животные");
        return character;
    }
}