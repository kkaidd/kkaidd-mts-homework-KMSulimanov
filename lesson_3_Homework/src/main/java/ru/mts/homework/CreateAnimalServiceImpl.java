package ru.mts.homework;

import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    @Override
    public void createAnimal() {
        // создание животного
        Random random = new Random();
        int breedIndex = random.nextInt(10); // случайный индекс от 0 до 9
        String breed;
        switch (breedIndex) { // породы животного в зависимости от индекса получаемого выше
            case 0:
                breed = "Lion";
                break;
            case 1:
                breed = "Tiger";
                break;
            case 2:
                breed = "Wolf";
                break;
            case 3:
                breed = "Leopard";
                break;
            case 4:
                breed = "Cat";
                break;
            case 5:
                breed = "Snake";
                break;
            case 6:
                breed = "Bear";
                break;
            default:
                breed = "Dog";
                break;
        }
        System.out.println("Создано новое животное: " + breed);
    }

    public void createAnimal(int count) { // Перегруженный метод?!
        for (int i = 0; i < count; i++) {
            createAnimal();
        }
    }
    @Override // Переопределенный метод, использующий цикл do-while
    public void createTenAnimals () {
        int count = 0;
        do {
            createAnimal();
            count++;
        } while (count < 3);
    }
    public void callDefaultMethod() {
        CreateAnimalService.super.createTenAnimals(); // вызов дефолтного метода через объект интерфейса
    }
}