package ru.mts.homework;

import java.time.LocalDate;

public class SearchServiceImpl implements SearchService {

    @Override
    public void checkLeapYearAnimal(Animal animal) throws InvalidAnimalBirthDateException{
        if (animal == null) {
            throw new InvalidAnimalException("На вход пришел некорректный объект животного. Текущее время: " + LocalDate.now());
        }

        LocalDate birthDate = animal.getBirthDate();
        if (birthDate == null) {
            throw new InvalidAnimalBirthDateException("У животного " + animal.getName() + " не указана дата его рождения! ");
        }

        int year = birthDate.getYear();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(animal.getName() + " был рожден в високосный год!");
        } else {
            System.out.println(animal.getName() + " не был рожден в високосный год!");
        }
    }
}