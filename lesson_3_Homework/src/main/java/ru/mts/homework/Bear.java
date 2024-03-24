package ru.mts.homework;

public class Bear extends Predator {
    public Bear(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
    }

    @Override
    public String getName() {
        super.getName();
        System.out.println("Bear");
        return name;
    }
}