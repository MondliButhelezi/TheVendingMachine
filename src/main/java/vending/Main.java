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
                "1. Soft Drink - R10.00\n" +
                "2. Salty Snacks - R12.00\n" +
                "3. Chocolate - R15.00");


        System.out.println(overloadedVendingMachine.getStock());
        System.out.println(overloadedVendingMachine.getStock());

//        System.out.println(overloadedVendingMachine.chocolatesQty);
//        System.out.println(overloadedVendingMachine.saltySnacksQty);
//        System.out.println(overloadedVendingMachine.softDrinkQty);
    }

}
