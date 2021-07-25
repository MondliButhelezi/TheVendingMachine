package vending;

import vending.product.Chocolates;
import vending.product.Product;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;

public class Main {

    public static void main(String[] args) {
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(5,6,7);
        Product product = new Product();
        SoftDrinks softDrinks = new SoftDrinks();
        SaltySnacks saltySnacks = new SaltySnacks();
        Chocolates chocolates = new Chocolates();

        System.out.println("---------  You have Entered Vuyo's Vending Machine ---------- \n" +
                "---------- This is what is available in stock-------\n" +
                "-- 1. Salty snacks in stock: [" + overloadedVendingMachine.getStock(saltySnacks) + "] --\n" +
                "-- 2. Chocolates in stock: [" + overloadedVendingMachine.getStock(chocolates) + "] --\n" +
                "-- 3. Soft drinks in stock: [" + overloadedVendingMachine.getStock(softDrinks) + "] --\n" +
                "--------- " +  "Total Stock: [" + overloadedVendingMachine.getStock() + " ] ---------");

//        overloadedVendingMachine.promptEnterKey();
        overloadedVendingMachine.addStock(5,3,4);
        System.out.println("Stock has been updated \n" +
                "5 Soft drinks added \n" +
                "3 Chocolates added \n" +
                "4 Salty snacks added \n" +
                "Total stock: " + overloadedVendingMachine.getStock() + "\n" +
                "Goodbye...");

//        System.out.println(overloadedVendingMachine.getStock());
//        System.out.println(overloadedVendingMachine.getStock());

//        System.out.println(overloadedVendingMachine.chocolatesQty);
//        System.out.println(overloadedVendingMachine.saltySnacksQty);
//        System.out.println(overloadedVendingMachine.softDrinkQty);
    }

}
