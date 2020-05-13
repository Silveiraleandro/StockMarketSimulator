package business;

import random.id.RandomIdFacade;

import java.util.Random;

public class Companies {
    /*
       encapsulated attributes of the class
        */
    private String id;
    private double share;
    private double sharePrice;

    /*Defining a constructor that have the object builder bringing
       all the attributes that the Country has
        */
    private Companies(BuilderCompany builderComp){

        this.id = builderComp.id;
        this.share = builderComp.randomShares();
        this.sharePrice = builderComp.randomSharePrice();

    }
     /*
        To String method to print the actual values in the terminal
         */

    @Override
    public String toString() {
        return "Companies{" +
                "id='" + id + '\'' +
                ", share=" + share +
                ", sharePrice=" + sharePrice +
                '}';
    }

    /*
            Getters and setters
             */
    public String getId() {
        return id;
    }

    public double getShare() {
        return share;
    }

    public void setShare(double share) {
        this.share = share;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }
    /*
    this method is the one in charge of creating all instances of the Company Class
     */
    public static class BuilderCompany {

        private String id;
        private double share;
        private double sharePrice;

        /*
      creates the objects builder
       */
        public BuilderCompany(String id) {

            this.id = id;
            this.share = randomShares();
            this.sharePrice = randomSharePrice();

        }

        /*
        generates random Shares
         */
        public double randomShares(){
            Random r = new Random();
            int low = 500;
            int high = 1000;
            int shares = r.nextInt(high-low) + low;

            return shares;
        }
        /*
        generates random prices for shares
         */
        public double randomSharePrice(){

            Random r = new Random();
            int low = 500;
            int high = 1000;
            int sharePrices = r.nextInt(high-low) + low;

            return sharePrices;
        }
        /*
        double up the share price every time a share is sold
       */
        public void sellShares(int share, int sharePrice ){


        }


        /*
                                setting and returning an instance of the class from the builder
                                 */
        public Companies build() {
            return new Companies(this);
        }
    }
}
