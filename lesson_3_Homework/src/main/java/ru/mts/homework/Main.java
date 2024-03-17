package ru.mts.homework;

public class Main {
    public static void main(String[] args) {
        CreateAnimalService createAnimalService = new CreateAnimalServiceImpl();
        createAnimalService.createAnimal();

        CreateAnimalServiceImpl createAnimalServiceImpl = new CreateAnimalServiceImpl();
        createAnimalServiceImpl.createAnimalOverloaded(1);

        CreateAnimalService createAnimalServiceI = new CreateAnimalServiceImpl();
        createAnimalServiceI.createTenAnimals();
    }
}