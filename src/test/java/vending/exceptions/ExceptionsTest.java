package vending.exceptions;

import org.junit.jupiter.api.Test;
import vending.ExceptionalVendingMachine;
import vending.product.Chocolates;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionsTest {
        @Test
        public void softDrinksOutOfStockExceptionTest() {
            Throwable thrown = assertThrows(SoftDrinksOutOfStockException.class, () -> {
                ExceptionalVendingMachine vendingMachine = new ExceptionalVendingMachine(6, 1, 9);
                vendingMachine.buy(new SoftDrinks(), 7);
            });
            assertEquals(thrown.getMessage(), "Soft drinks out of stock!");
        }

        @Test
        public void saltyCracksAllEatenExceptionTest() {
            Throwable thrown = assertThrows(SaltyCracksAllEatenException.class, () -> {
                ExceptionalVendingMachine vendingMachine = new ExceptionalVendingMachine(6, 1, 9);
                vendingMachine.buy(new SaltySnacks(), 10);
            });
            assertEquals(thrown.getMessage(), "Salty cracks all eaten!");
        }

        @Test
        public void chocolatesAllGoneExceptionTest() {
            Throwable thrown = assertThrows(ChocolatesAllGoneException.class, () -> {
                ExceptionalVendingMachine vendingMachine = new ExceptionalVendingMachine(6, 1, 9);
                vendingMachine.buy(new Chocolates(), 2);
            });
            assertEquals(thrown.getMessage(), "Chocolates all gone!");
        }

        @Test
        public void invalidProductExceptionTest() {
            Throwable thrown = assertThrows(InvalidProductException.class, () -> {
                ExceptionalVendingMachine vendingMachine = new ExceptionalVendingMachine(6, 1, 9);
                vendingMachine.buy(null, 5);
            });
            assertEquals(thrown.getMessage(), "Invalid product exception!");
        }
}
