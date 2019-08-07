package com.example.immunization.com.example.immunization.exception;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(int id)
    {
        super("Book id is not Found: "+ id);
    }
}
