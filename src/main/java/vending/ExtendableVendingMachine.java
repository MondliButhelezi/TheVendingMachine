package vending;

import vending.product.Chocolates;
import vending.product.Product;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;

public class ExtendableVendingMachine {
    private int softDrinks, saltySnacks, chocolates, stockType = 0;

    public ExtendableVendingMachine(int softDrinks, int saltySnacks, int chocolates) {
        this.softDrinks = softDrinks;
        this.saltySnacks = saltySnacks;
        this.chocolates = chocolates;
    }
    public void buy(Product product) {
        if (product instanceof vending.product.SoftDrinks) {
            softDrinks = softDrinks -1;
        }
        if (product instanceof vending.product.SaltySnacks) {
            saltySnacks = saltySnacks -1;
        }
        if (product instanceof vending.product.Chocolates) {
            chocolates = chocolates -1;
        }
    }

    public void addStock(Product product) {
        if (product instanceof SoftDrinks) {
            softDrinks = softDrinks +3;
        }
        if (product instanceof SaltySnacks) {
            saltySnacks = saltySnacks +3;
        }
        if (product instanceof Chocolates) {
            chocolates = chocolates +3;
        }
    }

    public int getSoftDrinks() {
        System.out.println("Stock level for SoftDrinks: [ " + softDrinks + " ]");
        return softDrinks;
    }

    public int getChocolates() {
        System.out.println("Stock level for Chocolates: [ " + chocolates + " ]");
        return chocolates;
    }

    public int getSaltySnacks() {
        System.out.println("stock level for SaltySnacks: [ " + saltySnacks + " ]");
        return saltySnacks;
    }

    public int getStock(Product product) {
        if (product instanceof SoftDrinks){
            stockType = stockType + softDrinks;
            System.out.println("SoftDrinks stock left is: [ " + stockType + " ]");
        }
        if (product instanceof SaltySnacks) {
            stockType = stockType + saltySnacks;
            System.out.println("Salty Snacks stock left is: [ " + stockType + " ]");
        }
        if (product instanceof Chocolates) {
            stockType = stockType + chocolates;
            System.out.println("Chocolates stock left is: [ " + stockType + " ]");
        }

        return stockType;
    }

    public void buy(Product product, int qty) {
        if (product instanceof Chocolates) {
            chocolates = chocolates - qty;
        }
        if (product instanceof SaltySnacks) {
            saltySnacks = saltySnacks - qty;
        }
        if (product instanceof SoftDrinks) {
            softDrinks = softDrinks - qty;
        }
    }

    public void addStock(Product product, int qty) {
        if (product instanceof Chocolates) {
            chocolates = chocolates + qty;
        }
        if (product instanceof SaltySnacks) {
            saltySnacks = saltySnacks + qty;
        }
        if (product instanceof SoftDrinks) {
            softDrinks = softDrinks + qty;
        }
    }
}
