package ru.mts.homework;

import java.time.LocalDate;

public abstract class AbstractAnimal implements Animal {
    protected String breed; //порода
    protected String name; // имя
    protected Double cost; //ценавмагазине
    protected String character; //характер
    protected LocalDate birthDate; // День рождения животного


    public AbstractAnimal(String breed, String name, double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }
    @Override
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    // Реализация методов интерфейса Animal
    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }

}
