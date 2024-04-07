package ru.mts.homework;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        CreateAnimalServiceImpl defaultAnimals = new CreateAnimalServiceImpl();
        defaultAnimals.callDefaultMethod(); // вызов метода, который внутри вызывает дефолтный метод интерфейса =_=

        CreateAnimalServiceImpl createAnimalServiceImpl = new CreateAnimalServiceImpl();
        createAnimalServiceImpl.createAnimal(2); //перегруженный

        CreateAnimalService createAnimalServiceI = new CreateAnimalServiceImpl();
        createAnimalServiceI.createTenAnimals(); //переопределенный


        Cat cat = new Cat("SomeBreed", "Barsik", 100.0, "Friendly", LocalDate.of(2016, 2, 2));
        Dog dog = new Dog("SomeBreed", "Tuzik", 110.0, "Angry", LocalDate.of(2010, 2, 2));

        SearchService searchService = new SearchServiceImpl();

        try {
            searchService.checkLeapYearAnimal(cat);
            ;
        } catch (InvalidAnimalBirthDateException e) {
            throw new InvalidAnimalException("Брат, работа метода завершилась ошибкой: " + e.getMessage());
        }
    }
}