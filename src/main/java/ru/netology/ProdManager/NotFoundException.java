package ru.netology.ProdManager;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String s) {
        super(s);
    }
}