package ru.mts.homework;

import java.time.LocalDate;

public interface Animal {
    void setBirthDate(LocalDate birthDate);
    LocalDate getBirthDate();
    String getBreed();
    String getName();

    double getCost();

    String getCharacter();
}
