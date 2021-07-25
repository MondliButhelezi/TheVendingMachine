package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolates;
import vending.product.SaltySnacks;
import vending.product.Product;
import vending.product.SoftDrinks;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class AddToStocksTest {
        @Test
        public void shouldAddStockToSaltySnacksProduct() {
            OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3,6,9);
            SaltySnacks saltySnack = new SaltySnacks();
            overloadedVendingMachine.addStock(saltySnack);
            assertEquals(6,overloadedVendingMachine.getStockLevelForSaltySnacks(),"Should return number of items in stock for Salty snacks");
        }

        @Test
        public void shouldAddStockToSoftDrinksProduct() {
            OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3,6,9);
            SoftDrinks softDrinks = new SoftDrinks();
            overloadedVendingMachine.addStock(softDrinks);
            assertEquals(21,overloadedVendingMachine.getStockLevelForSoftDrinks(),"Should return the number of items in stock for Salty snacks");
        }

        @Test
        public void shouldAddStockToChocolateProduct() {
            OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3,6,9);
            Chocolates chocolates = new Chocolates();
            overloadedVendingMachine.addStock(chocolates);
            assertEquals(11,overloadedVendingMachine.getStockLevelForChocolate(),"Should be able to return the number of items in stock for Salty snacks");
        }

        @Test
        public void shouldAddStockToEverything() {
            OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3,6,9);
            Product product = new Product();
            overloadedVendingMachine.addStock(product);
            assertEquals(38,overloadedVendingMachine.getStock(),"Should be able to return the number of items in stock for Salty snacks");
        }

        @Test
        public void shouldAddToStockAmountEntered() {
            OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3,6,9);
            overloadedVendingMachine.addStock(5,5,5);
            assertEquals(50,overloadedVendingMachine.getStock(),"Should be able to return the number of items in stock for Salty snacks");
        }
}
