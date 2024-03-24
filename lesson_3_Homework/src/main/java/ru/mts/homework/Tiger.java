package ru.mts.homework;

public class Tiger extends Predator {
    public Tiger(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
    }

    @Override
    public String getName() {
        super.getName();
        System.out.println("Tiger");
        return name;
    }
}