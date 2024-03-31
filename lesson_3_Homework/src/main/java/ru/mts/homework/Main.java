package ru.mts.homework;

public class Main {
    public static void main(String[] args) {

        CreateAnimalServiceImpl defaultAnimals = new CreateAnimalServiceImpl();
        defaultAnimals.callDefaultMethod(); // вызов метода, который внутри вызывает дефолтный метод интерфейса =_=

        CreateAnimalServiceImpl createAnimalServiceImpl = new CreateAnimalServiceImpl();
        createAnimalServiceImpl.createAnimal(2); //перегруженный

        CreateAnimalService createAnimalServiceI = new CreateAnimalServiceImpl();
        createAnimalServiceI.createTenAnimals(); //переопределенный

    }
}