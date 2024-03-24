package ru.mts.homework;

public class Cat extends Pet {
    public Cat(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
    }

    @Override
    public String getName() {
        super.getName();
        System.out.println("Cat");
        return name;
    }
}