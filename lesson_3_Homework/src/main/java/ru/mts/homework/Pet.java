package ru.mts.homework;

import java.time.LocalDate;

public class Pet extends AbstractAnimal {
    public Pet(String breed, String name, double cost, String character, LocalDate birthDay) {
        super(breed, name, cost, character, birthDay);
    }

    @Override
    public void setBirthDate(LocalDate birthDate) {

    }

    @Override
    public void setName(String newName) {
        super.setName(newName);
        System.out.println(newName);
    }

    @Override
    public String getBreed() {
        System.out.println("getBreed животного");
        return breed;
    }

    @Override
    public double getCost() {
        System.out.println("getCost животного");
        return cost;
    }

    @Override
    public String getCharacter() {
        System.out.println("getCharacter животного");
        return character;
    }
}
