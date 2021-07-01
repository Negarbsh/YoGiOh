package com.mygdx.game.java.view.exceptions;

public class InvalidDeck extends Exception {
    public InvalidDeck(String username) {
        super(username + "’s deck is invalid");
    }
}
