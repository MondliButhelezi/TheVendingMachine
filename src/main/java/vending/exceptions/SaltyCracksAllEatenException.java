package vending.exceptions;

public class SaltyCracksAllEatenException extends ProductNotFoundException {
    public SaltyCracksAllEatenException() {
        super("Salty cracks all eaten!");
    }
}
