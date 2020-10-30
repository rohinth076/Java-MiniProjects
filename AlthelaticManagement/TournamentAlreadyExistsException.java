package com.itech;

public class TournamentAlreadyExistsException extends Exception {
    public TournamentAlreadyExistsException() {
    }

    public TournamentAlreadyExistsException(String message) {
        super(message);
    }
}
