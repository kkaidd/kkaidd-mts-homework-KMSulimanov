package ru.mts.homework;

public class Dog extends Pet {
    public Dog(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
    }

    @Override
    public String getName() {
        super.getName();
        System.out.println("Dog");
        return name;
    }
}