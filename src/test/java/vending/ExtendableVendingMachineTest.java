package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolates;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtendableVendingMachineTest {

    @Test
    public void addStockTest() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3,4,5);
        extendableVendingMachine.addStock(new Chocolates());
        extendableVendingMachine.addStock(new SaltySnacks());
        extendableVendingMachine.addStock(new SoftDrinks());
        extendableVendingMachine.addStock(new SoftDrinks());

        assertEquals(extendableVendingMachine.getChocolates(),8);
        assertEquals(extendableVendingMachine.getSoftDrinks(),9);
        assertEquals(extendableVendingMachine.getSaltySnacks(),7);

    }

    @Test
    public void buyTest() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3,4,5);
        extendableVendingMachine.buy(new SoftDrinks());
        extendableVendingMachine.buy(new Chocolates());
        extendableVendingMachine.buy(new SaltySnacks());

        assertEquals(extendableVendingMachine.getSoftDrinks(),2);
        assertEquals(extendableVendingMachine.getChocolates(),4);
        assertEquals(extendableVendingMachine.getSaltySnacks(),3);

    }

    @Test
    public void getSoftDrinksStockTest() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3,4,5);
        extendableVendingMachine.buy(new SoftDrinks());
        extendableVendingMachine.buy(new SoftDrinks());
        extendableVendingMachine.addStock(new SoftDrinks());
        extendableVendingMachine.addStock(new SoftDrinks());
        extendableVendingMachine.addStock(new SoftDrinks());

        assertEquals(extendableVendingMachine.getStock(new SoftDrinks()),10);

    }

    @Test
    public void shouldBuyWithinStockLimitTest() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3,4,5);
        extendableVendingMachine.buy(new Chocolates(),3);

        assertEquals(extendableVendingMachine.getStock(new Chocolates()),2);

    }

    @Test
    public void shouldAddStock() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3,4,5);
        extendableVendingMachine.addStock(new Chocolates(),6);

        assertEquals(extendableVendingMachine.getStock(new Chocolates()),11);

    }

    @Test
    public void getChocolateStockTest() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3,4,5);
        extendableVendingMachine.buy(new Chocolates());
        extendableVendingMachine.addStock(new Chocolates());
        extendableVendingMachine.addStock(new Chocolates());

        assertEquals(extendableVendingMachine.getStock(new Chocolates()),10);

    }

    @Test
    public void getSaltySnackStockTest() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(3,4,5);
        extendableVendingMachine.buy(new SaltySnacks());
        extendableVendingMachine.buy(new SaltySnacks());
        extendableVendingMachine.addStock(new SaltySnacks());

        assertEquals(extendableVendingMachine.getStock(new SaltySnacks()),5);

    }


}
