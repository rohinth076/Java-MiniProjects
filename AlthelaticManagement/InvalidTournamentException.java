package com.itech;

public class InvalidTournamentException extends Throwable {
    public InvalidTournamentException() {
    }

    public InvalidTournamentException(String message) {
        super(message);
    }
}
