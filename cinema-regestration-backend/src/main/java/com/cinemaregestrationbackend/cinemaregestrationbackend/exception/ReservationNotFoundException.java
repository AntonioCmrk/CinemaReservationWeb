package com.cinemaregestrationbackend.cinemaregestrationbackend.exception;

public class ReservationNotFoundException extends RuntimeException {
    public ReservationNotFoundException(Long id) {
        super("Could not found the reservation with id "+ id);
    }
}