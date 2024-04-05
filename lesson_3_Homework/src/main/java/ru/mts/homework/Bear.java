package ru.mts.homework;

import java.time.LocalDate;

public class Bear extends Predator {
    public Bear(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    @Override
    public String getName() {
        super.getName();
        System.out.println("Bear");
        return name;
    }
}