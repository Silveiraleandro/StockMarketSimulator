package business;

import market.ObserverMarket;
import java.util.Random;

public class Investors {
    /*
        encapsulated attributes of the class
         */
    private String id;
    private int numberOfShares;
    private double budget;

    /*Defining a constructor that have the object builder bringing
       all the attributes that the Country has
        */
    private Investors(BuilderInvestors buildInv){

        this.id = buildInv.id;
        this.budget = buildInv.generateRandomBudget();

    }
    /*
        adding one to the number of shares for every time a share
        is bought and returning this number
         */
    public Boolean buyShares(Companies company) {

        if (budget <= company.getSharePrice() || company.getSharePrice() != 0) {
            budget = budget - company.getSharePrice();
            numberOfShares = numberOfShares + 1;
            company.sellShares();
            company.shareSold();
            ObserverMarket.transactionCompleted(company);
            return true;
        } else {
            return false;
        }
    }
    /*
   To String method to print the actual values in the terminal
    */

    @Override
    public String toString() {
        return "Investors{" +
                "id='" + id + '\'' +
                ", numberOfShares=" + numberOfShares +
                ", budget=" + budget +
                '}';
    }

    /*
            Getters and Setters
             */
    public String getId() {
        return id;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
    /*
   this method is the one in charge of creating all instances of the Country Class
    */
    public static class BuilderInvestors{
        private String id;
        private int numberOfShares;
        private double budget;
        /*
       creates the objects builder
        */
        public BuilderInvestors(String id, int numberOfShares){

            this.id = id;
            this.budget = generateRandomBudget();
            this.numberOfShares = numberOfShares;
        }

        /*
    setting and returning an instance of the class from the builder
     */
            /*
        generates random prices for shares
         */
        public double generateRandomBudget(){

            Random r = new Random();
            int low = 1000;
            int high = 10000;
            int budget = r.nextInt(high-low + 1) + low;

            return budget;
        }

        /*
             setting and returning an instance of the class from the builder
              */
        public Investors build(){
            return new Investors(this);
        }
    }
}
