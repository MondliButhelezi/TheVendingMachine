package vending;

import vending.product.Chocolates;
import vending.product.Product;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;

public class OverloadedVendingMachine {

    // Stock quantity for all products
    int softDrinkQty, saltySnacksQty, chocolatesQty;

    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
        // set the stockLevel instance variables for each product in the constructor
        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
    }

    //SECTION THAT HAS BUY METHODS
    void buy(SoftDrinks softdrink) {
        softDrinkQty = softDrinkQty - 1;
        System.out.println("buy 1 SoftDrink");
    }
    void buy(SaltySnacks saltySnack) {
        saltySnacksQty = saltySnacksQty - 1 ;
        System.out.println("buy 1 SaltySnack");
    }
    void buy(Chocolates chocolate) {
        chocolatesQty = chocolatesQty - 1;
        System.out.println("buy 1 Chocolate");
    }
    void buy(Product product) {
        System.out.println("buy 1 of each product");
    }

    //SECTION THAT HAS ADD STOCKS METHOD
    void addStock(SoftDrinks softdrink){
        System.out.println("add 1 SoftDrink");
    }
    void addStock(SaltySnacks saltySnack){
        System.out.println("add 1 SaltySnack");
    }
    void addStock(Chocolates chocolate){
        System.out.println("add 1 Chocolate");
    }
    void addStock(Product product){
        System.out.println("add 3 stock items for each Product type.");
    }

    //SECTION THAT HAS GET STOCKS METHOD
    int getStock(SoftDrinks softdrink){
        return softDrinkQty;
    }
    int getStock(SaltySnacks saltySnack){
        return saltySnacksQty;
    }
    int getStock(Chocolates chocolate){
        return chocolatesQty;
    }
    int getStock(){
        int totalStocks = saltySnacksQty + softDrinkQty + chocolatesQty;
        return totalStocks;
    }

}
