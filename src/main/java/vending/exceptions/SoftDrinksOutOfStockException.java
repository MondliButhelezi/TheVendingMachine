package vending.exceptions;

public class SoftDrinksOutOfStockException extends ProductNotFoundException {
    public SoftDrinksOutOfStockException() {
        super("Soft drinks out of stock!");
    }
}
