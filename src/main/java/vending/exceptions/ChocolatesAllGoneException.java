package vending.exceptions;

public class ChocolatesAllGoneException extends ProductNotFoundException {
    public ChocolatesAllGoneException() {
        super("Chocolates all gone!");
    }
}
