package ru.mts.homework;

import java.time.LocalDate;

public class InvalidAnimalException extends RuntimeException {
    public InvalidAnimalException(String message) {
        super(message);
    }
}
