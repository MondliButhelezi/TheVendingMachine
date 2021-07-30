[![Build Status](https://travis-ci.com/MondliButhelezi/TheVendingMachine.svg?branch=master)](https://travis-ci.com/github/MondliButhelezi/TheVendingMachine)


# Overloaded Vending Machine

Loyolo is running a local spaza shop, he is building a vending machine that he wants to install at a friends BraaiShop.

He wants you to write him some software for this vending machine project of his.

###### About method overloading

## Package to use
Create a `vending` package and create all your classes in there.

## The VendingMachine class
Write a Java class called `OverloadedVendingMachine` that have overloaded buy methods that takes in an instances of the various sub types of the `Product` class.

| methods	| description
| --- | --- |
| void buy(SoftDrink softdrink) |	buy 1 SoftDrink
| void buy(SaltySnack saltySnack) |	buy 1 SaltySnack
| void buy(Chocolate chocolate) |	buy 1 Chocolate
| void buy(Product product) |	buy 1 of each product |

Buying a product decrease the number of products in stock by one. The stock level for a product can’t be negative.

## Constructor
The `OverloadedVendingMachine` class should have a constructor that takes in the initial stock levels for `SoftDrinks`, `SaltySnacks` & `Chocolates`.

The class should store the stock level for each product in a private instance variable .

```
// add a constructor like this to you OverloadedVendingMachine class
OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
	// set the stockLevel instance variables for each product in the constructor
}
```
## Product classes
There are three products:

* SoftDrinks
* SaltySnacks
* Chocolates

> Create the Product classes in a the vending.product package.

Create a class for each product, each of these products is a sub class of the Product class which have a description method.

Class names should not be plural. Each class should have a `description` overriding the `description` method of `Product`.

The Product class looks like this:
```
class Product {
	public String description() {
		return "This is a product";
	}
}
```

## Adding stock
Overloaded `addStock` methods adds stock for a given product type.

Each time an `addStock` method is called new items should be added for the Product type in question.

It’s method signature are:

| method | description |
| --- | --- |
| void addStock(SoftDrink softdrink) |	add 1 SoftDrink to stock
| void addStock(SaltySnack saltySnack) |	add 1 SaltySnack to stock
| void addStock(Chocolate chocolate) |	add 1 Chocolate to stock
|void addStock(Product product) |	add 3 stock items for each Product type. |

## Getting the stock level
An overloaded getStock methods returns the Stock level for each Product type.

* int getStock(SoftDrink softdrink)
* int getStock(SaltySnack saltySnack)
* int getStock(Chocolate chocolate)
* int getStock() - return the total number of items in stock for all 3 different Product types.

## Note
* The OverloadedVendingMachine should keep track of the number of each product type it has in stock.
* Create a main method that takes your new OverloadedVendingMachine vending machine through it’s paces.
* Create JUnit tests that tests your Vending Machine.
* Commit your code the GitHub using a repository called TheVendingMachine & share with the mentors
* Commit the GitHub regularly.

## Do this next
* create a buy method that allows you to specify how many of a certain Product you want to buy
* create a addStock method that allows you to specify how many of a certain Product you want to add to stock.
