package vending;

import vending.exceptions.*;
import vending.product.Chocolates;
import vending.product.Product;
import vending.product.SaltySnacks;
import vending.product.SoftDrinks;

public class ExceptionalVendingMachine {
        private int softDrinksLevel = 0;
        private int chocolatesLevel = 0;
        private int saltySnacksLevel = 0;

        public ExceptionalVendingMachine(int softDrinksLevel, int chocolatesLevel, int saltySnacksLevel) {
            this.softDrinksLevel = softDrinksLevel;
            this.chocolatesLevel = chocolatesLevel;
            this.saltySnacksLevel = saltySnacksLevel;
        }

        public void buy(Product product, int qty) throws ProductNotFoundException {
            if (product instanceof SoftDrinks) {
                if (softDrinksLevel - qty > 0) {
                    softDrinksLevel -= qty;
                } else {
                    throw new SoftDrinksOutOfStockException();
                }
            }

            if (product instanceof Chocolates) {
                if (chocolatesLevel - qty > 0) {
                    chocolatesLevel -= qty;
                } else {
                    throw new ChocolatesAllGoneException();
                }
            }

            if (product instanceof SaltySnacks) {
                if (saltySnacksLevel - qty > 0) {
                    saltySnacksLevel -= qty;
                } else {
                    throw new SaltyCracksAllEatenException();
                }
            }

            if (product == null) {
                throw new InvalidProductException();
            }
        }

        public void addStock(Product product, int newStock) {
            if (product instanceof SoftDrinks) softDrinksLevel += newStock;
            if (product instanceof Chocolates) chocolatesLevel += newStock;
            if (product instanceof SaltySnacks) saltySnacksLevel += newStock;
        }

        public int getStock(Product product) {
            if (product instanceof SoftDrinks) return softDrinksLevel;
            if (product instanceof Chocolates) return chocolatesLevel;
            if (product instanceof SaltySnacks) return saltySnacksLevel;
            else return 0;
        }

        public int getSoftDrinksLevel() {
            return softDrinksLevel;
        }

        public int getChocolatesLevel() {
            return chocolatesLevel;
        }


        public int getSaltySnacksLevel() {
            return saltySnacksLevel;
        }
    }
