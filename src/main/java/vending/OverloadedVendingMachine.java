package vending;

public class OverloadedVendingMachine {

    int softDrinkQty, saltySnacksQty, chocolatesQty;

    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
        // set the stockLevel instance variables for each product in the constructor
        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
    }

    //SECTION THAT HAS BUY METHODS
//    void buy(SoftDrink softdrink) {
//        System.out.println("buy 1 SoftDrink");
//    }
//    void buy(SaltySnack saltySnack) {
//        System.out.println("buy 1 SaltySnack");
//    }
//    void buy(Chocolate chocolate) {
//        System.out.println("buy 1 Chocolate");
//    }
//    void buy(Product product) {
//        System.out.println("buy 1 of each product");
//    }


}
