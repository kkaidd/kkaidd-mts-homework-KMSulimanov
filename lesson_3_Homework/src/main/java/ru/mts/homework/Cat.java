package ru.mts.homework;

import java.time.LocalDate;

public class Cat extends Pet {
    public Cat(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    @Override
    public void setName(String newName) {
        super.setName(newName);
        System.out.println(newName);
    }
}