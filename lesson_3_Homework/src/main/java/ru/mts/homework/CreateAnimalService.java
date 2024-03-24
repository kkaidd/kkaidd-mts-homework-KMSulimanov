package ru.mts.homework;


public interface CreateAnimalService {
    default void createTenAnimals() {
        int count = 0;
        while (count < 10) {
            createAnimal();
            count++;
        }
    }

    void createAnimal();
}