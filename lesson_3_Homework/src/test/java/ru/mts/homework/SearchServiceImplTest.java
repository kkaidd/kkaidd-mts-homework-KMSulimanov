package ru.mts.homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SearchServiceImplTest {
// экземпляр SearchService для тестирования
    private final SearchService searchService = new SearchServiceImpl();

    // Метод, который предоставляет различных животных для тестирования
    static Stream<Animal> animalProvider() {
        return Stream.of(
                // можно добавить любое количество тестовых данных, пока ток два:
                // 1. new Cat - кошка без указанной даты рождения
                // 2. new Dog - собака с указанной датой рождения
                new Cat("SomeBreed", "Barsik", 100.0, "Friendly", null)
                //new Dog("SomeBreed", "Tuzik", 110.0, "Angry", LocalDate.of(2010, 2, 2))
        );
    }

    // Тестируемый метод, проверяет родилось ли животное в високосный год
    @DisplayName("Проверка на високосный год")
    // @ParameterizedTest - один и тот же тестовый метод может быть выполнен с разными наборами входных данных
    // Указываем описание для теста и параметризуемый тест (╮°-°)╮┳━━┳ ( ╯°□°)╯ ┻━━┻
    @ParameterizedTest(name = "Животное: кот")
    @MethodSource("animalProvider") // Указываем источник данных для параметризации
    void testCheckLeapYearAnimal(Animal animal) throws InvalidAnimalBirthDateException {
        if (animal.getBirthDate() == null) {
            // Если дата рождения не указана, ожидаем InvalidAnimalBirthDateException
            InvalidAnimalBirthDateException exception = assertThrows(InvalidAnimalBirthDateException.class,
                    // Вызываем метод checkLeapYearAnimal с тестируемым животным
                    () -> searchService.checkLeapYearAnimal(animal));
            System.out.println(exception.getMessage()); // Выводим сообщение об ошибке
        } else {
            // Если дата рождения указана, выполняем метод checkLeapYearAnimal без исключений
            searchService.checkLeapYearAnimal(animal);
        }
    }
}