package ru.mts.homework;

import java.time.LocalDate;

public class Tiger extends Predator {
    public Tiger(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    @Override
    public String getName() {
        super.getName();
        System.out.println("Tiger");
        return name;
    }
}