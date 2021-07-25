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
            assertEquals(7,overloadedVendingMachine.getStockLevelForSaltySnacks(),"Should return number of items in stock for Salty snacks");
        }

        @Test
        public void shouldAddStockToSoftDrinksProduct() {
            OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3,6,9);
            SoftDrinks softDrinks = new SoftDrinks();
            overloadedVendingMachine.addStock(softDrinks);
            assertEquals(4,overloadedVendingMachine.getStockLevelForSoftDrinks(),"Should return the number of items in stock for Soft drinks");
        }

        @Test
        public void shouldAddStockToChocolateProduct() {
            OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3,6,9);
            Chocolates chocolates = new Chocolates();
            overloadedVendingMachine.addStock(chocolates);
            assertEquals(10,overloadedVendingMachine.getStockLevelForChocolate(),"Should return the number of items in stock for chocolates");
        }

        @Test
        public void shouldAddStockToEverything() {
            OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3,6,9);
            Product product = new Product();
            overloadedVendingMachine.addStock(product);
            assertEquals(21,overloadedVendingMachine.getStock(),"Should return the number of items in stock for everything");
        }

        @Test
        public void shouldAddToStockAmountEntered() {
            OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3,6,9);
            overloadedVendingMachine.addStock(5,5,5);
            assertEquals(33,overloadedVendingMachine.getStock(),"Should return the number of items entered");
        }
}
