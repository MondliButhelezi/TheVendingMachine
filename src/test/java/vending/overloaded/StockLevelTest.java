package vending.overloaded;

import org.junit.jupiter.api.Test;
import vending.OverloadedVendingMachine;
import vending.product.Chocolates;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockLevelTest {

    @Test
    public void shouldShowChocolateStock() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3,4,5);
        Chocolates chocolate = new Chocolates();
        overloadedVendingMachine.getStock(chocolate);
        assertEquals(5,overloadedVendingMachine.getStockLevelForChocolate(),"Should return number of items in stock for Chocolates");
    }

    @Test
    public void shouldShowSoftDrinkStock() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3,4,5);
        SoftDrinks softDrink = new SoftDrinks();
        overloadedVendingMachine.getStock(softDrink);
        assertEquals(3,overloadedVendingMachine.getStockLevelForSoftDrinks(),"Should return number of items in stock for Soft drinks");
    }
    @Test
    public void shouldShowSaltySnackStock() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3,4,5);
        SaltySnacks saltySnack = new SaltySnacks();
        overloadedVendingMachine.getStock(saltySnack);
        assertEquals(4,overloadedVendingMachine.getStockLevelForSaltySnacks(),"Should return the of items in stock for Salty snacks");
    }

    @Test
    public void shouldShowOverallStock() {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3,4,5);
        assertEquals(12,overloadedVendingMachine.getStock(),"Should return number of items in stock for all stocks");
    }
}
