package main.java.view.exceptions;

public class CantAttackDirectlyException extends Exception {
    public CantAttackDirectlyException() {
        super("you can’t attack the opponent directly");
    }
}
