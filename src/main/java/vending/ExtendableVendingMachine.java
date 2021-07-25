package vending;

import vending.product.Chocolates;
import vending.product.Product;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;

public class ExtendableVendingMachine {
    private int SoftDrinks, SaltySnacks,Chocolates, stockType = 0;

    public ExtendableVendingMachine(int SoftDrinks, int SaltySnacks, int Chocolates) {
        this.SoftDrinks = SoftDrinks;
        this.SaltySnacks = SaltySnacks;
        this.Chocolates = Chocolates;
    }
    public void buy(Product product) {
        if (product instanceof vending.product.SoftDrinks) {
            SoftDrinks = SoftDrinks-1;
        }
        if (product instanceof vending.product.SaltySnacks) {
            SaltySnacks = SaltySnacks-1;
        }
        if (product instanceof vending.product.Chocolates) {
            Chocolates = Chocolates-1;
        }
    }

    public void addStock(Product product) {
        if (product instanceof SoftDrinks) {
            SoftDrinks = SoftDrinks+3;
        }
        if (product instanceof SaltySnacks) {
            SaltySnacks = SaltySnacks+3;
        }
        if (product instanceof Chocolates) {
            Chocolates = Chocolates+3;
        }
    }

    public int getSoftDrinks() {
        System.out.println("stock level for SoftDrinks " + SoftDrinks);
        return SoftDrinks;
    }

    public int getChocolates() {
        System.out.println("stock level for Chocolates " + Chocolates);
        return Chocolates;
    }

    public int getSaltySnacks() {
        System.out.println("stock level for SaltySnacks " + SaltySnacks);
        return SaltySnacks;
    }

    public int getStock(Product product) {
        if (product instanceof SoftDrinks){
            stockType = stockType + SoftDrinks;
            System.out.println(stockType);
        }
        if (product instanceof SaltySnacks) {
            stockType = stockType + SaltySnacks;
        }
        if (product instanceof Chocolates) {
            stockType = stockType + Chocolates;
            System.out.println(stockType);
        }

        return stockType;
    }

    public void buy(Product product, int qty) {
        if (product instanceof Chocolates) {
            Chocolates = Chocolates - qty;
        }
        if (product instanceof SaltySnacks) {
            SaltySnacks = SaltySnacks - qty;
        }
        if (product instanceof SoftDrinks) {
            SoftDrinks = SoftDrinks - qty;
        }
    }

    public void addStock(Product product, int qty) {
        if (product instanceof Chocolates) {
            Chocolates = Chocolates + qty;
        }
        if (product instanceof SaltySnacks) {
            SaltySnacks = SaltySnacks + qty;
        }
        if (product instanceof SoftDrinks) {
            SoftDrinks = SoftDrinks + qty;
        }
    }
}
