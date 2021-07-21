package server.exceptions;

public class AlreadyDoneAction extends Exception {
    public AlreadyDoneAction(String action) {
        super("You have already " + action + " on this turn");
    }
}
