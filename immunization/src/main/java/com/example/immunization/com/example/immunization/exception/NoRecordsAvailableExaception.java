package com.example.immunization.com.example.immunization.exception;

public class NoRecordsAvailableExaception extends RuntimeException {
    public NoRecordsAvailableExaception(String no_recoord_found)
    {
        super(no_recoord_found);
    }
}
