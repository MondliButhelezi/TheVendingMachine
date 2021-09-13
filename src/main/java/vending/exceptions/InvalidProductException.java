package vending.exceptions;

public class InvalidProductException extends RuntimeException {
    public InvalidProductException() {
        super("Invalid product exception!");
    }
}
