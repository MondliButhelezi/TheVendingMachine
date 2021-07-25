package vending;

import vending.product.Chocolates;
import vending.product.Product;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;

import java.util.Scanner;

public class OverloadedVendingMachine {

    // STOCK LEVELS FOR ALL PRODUCTS
    private int softDrinkLevel, saltySnacksLevel, chocolatesLevel;

    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
        // set the stockLevel instance variables for each product in the constructor
        softDrinkLevel = softDrinkQty;
        saltySnacksLevel = saltySnacksQty;
        chocolatesLevel = chocolatesQty;
    }

    //SECTION THAT HAS BUY METHODS
    public void buy(SoftDrinks softDrink) {
        if (softDrinkLevel > 0) {
            softDrinkLevel = softDrinkLevel - 1;
            softDrink.description();
        }
    }
    public void buy(SaltySnacks saltySnack) {
        if (saltySnacksLevel > 0) {
            saltySnacksLevel = saltySnacksLevel -1;
            System.out.println();
            saltySnack.description();
        }
    }
    public void buy(Chocolates chocolate) {
        if (chocolatesLevel > 0) {
            chocolatesLevel = chocolatesLevel - 1;
            chocolate.description();
        }
    }
    public void buy(Product product) {
        softDrinkLevel = softDrinkLevel -1;
        saltySnacksLevel = saltySnacksLevel -1;
        chocolatesLevel = chocolatesLevel -1;
    }
    public void buy(int softDrinksItems , int chocolatesItems , int saltySnacksItems) {
        softDrinkLevel = softDrinkLevel - softDrinksItems;
        chocolatesLevel = chocolatesLevel - chocolatesItems;
        saltySnacksLevel = saltySnacksLevel - saltySnacksItems;
    }

    //SECTION THAT HAS ADD STOCKS METHOD
    public void addStock(SoftDrinks softdrink) {
        softDrinkLevel = softDrinkLevel + 1;
    }
    public void addStock(SaltySnacks saltySnack) {
        saltySnacksLevel = saltySnacksLevel +1;
    }
    public void addStock(Chocolates chocolate) {
        chocolatesLevel = chocolatesLevel + 1;
    }
    public void addStock(Product product) {
        saltySnacksLevel = saltySnacksLevel +1;
        chocolatesLevel = chocolatesLevel +1;
        softDrinkLevel = softDrinkLevel +1;
    }
    public void addStock(int softDrinkQty, int chocolateQty, int saltySnacksQty) {
        softDrinkLevel = softDrinkLevel + softDrinkQty;
        chocolatesLevel = chocolatesLevel + chocolateQty;
        saltySnacksLevel = saltySnacksLevel + saltySnacksQty;
    }

    //SECTION THAT HAS GET STOCKS METHOD
    public int getStockLevelForSoftDrinks() {
        return softDrinkLevel;
    }

    public int getStockLevelForSaltySnacks() {
        return saltySnacksLevel;
    }

    public int getStockLevelForChocolate() {
        return chocolatesLevel;
    }

    public int getStock(SoftDrinks softdrink) {
        return softDrinkLevel;
    }

    public int getStock(SaltySnacks saltySnack) {
        return saltySnacksLevel;
    }

    public int getStock(Chocolates chocolate) {
        return chocolatesLevel;
    }

    public int getStock() {
        return softDrinkLevel + saltySnacksLevel + chocolatesLevel;
    }

//    public void promptEnterKey() {
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
//    }

}
