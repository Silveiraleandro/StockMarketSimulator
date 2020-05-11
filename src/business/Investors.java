package business;

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
        this.budget = buildInv.randomBudget();

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
        public BuilderInvestors(String id, double budget, int numberOfShares){

            this.id = id;
            this.budget = budget;
            this.numberOfShares = numberOfShares;
        }

        /*
    setting and returning an instance of the class from the builder
     */
            /*
        generates ramdon prices for shares
         */
        public double randomBudget(){

            Random r = new Random();
            int low = 500;
            int high = 1000;
            int budget = r.nextInt(high-low + 1) + low;

            return budget;
        }
        /*
        adding one to the number of shares for every time a share
        is bought and returning this number
         */
        public int buyShares(){
            numberOfShares = numberOfShares +1;
            return numberOfShares;
        }
        /*
               setting and returning an instance of the class from the builder
                */
        public Investors build(){
            return new Investors(this);
        }
    }
}
