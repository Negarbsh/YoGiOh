package main.java.view.exceptions;

public class CardCantAttack extends Exception {
    public CardCantAttack() {
        super("you can’t attack with this card");
    }
}
