package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheese;
    private int toppings;

    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){

        this.isVeg = isVeg;
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isTakeAwayAdded = false;
        this.isBillGenerated = false;
        this.bill = "";

        // your code goes here
        if (isVeg){
            this.price = 300;
            this.toppings = 70;
        }
        else {
            this.price = 400;
            this.toppings = 120;
        }
        this.cheese = 80;
        this.bill += "Base Price Of The Pizza: "+this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!isCheeseAdded){
            this.price += cheese;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            this.price += toppings;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!isTakeAwayAdded){
            this.price += 20;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            if(isCheeseAdded){
                this.bill += "Extra Cheese Added: " +this.cheese + "\n";
            }
            if(isToppingsAdded){
                this.bill += "Extra Toppings Added: " +this.toppings + "\n";
            }
            if(isTakeAwayAdded){
                this.bill += "Paperbag Added: " +"20" + "\n";
            }
            this.bill += "Total Price: " +this.price + "\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
