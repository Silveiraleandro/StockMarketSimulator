package business;

import java.util.Random;

public class Companies {
    /*
       encapsulated attributes of the class
        */
    private String id;
    private double share;
    private double sharePrice;
    private double allSoldShares = 0;

    /*Defining a constructor that have the object builder bringing
       all the attributes that the Country has
        */
    private Companies(BuilderCompany builderComp) {

        this.id = builderComp.id;
        this.share = builderComp.generateRandomShares();
        this.sharePrice = builderComp.generateRandomSharePrice();
        this.allSoldShares = builderComp.allSoldShares;
    }

    /*
      subtracting 1 every time a share is sold
     */
    public void sellShares() {

        share = share - 1;

    }

    /*
    increment the number of all shares already sold and reset the value after 10 shares were sold
     */
    public void shareSold() {
        allSoldShares = allSoldShares + 1;
        if (allSoldShares == 10) {
            this.sharePrice = sharePrice * 2;
            allSoldShares = 0;
        }
    }

    /*
    this method drops down the shares values for the companies which did not sell 10 shares
     */
    public void dropValue() {
        sharePrice = sharePrice * 0.98;
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
                ", allSoldShares=" + allSoldShares +
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
        private double allSoldShares;

        /*
      creates the objects builder
       */
        public BuilderCompany(String id) {

            this.id = id;
            this.share = generateRandomShares();
            this.sharePrice = generateRandomSharePrice();
            this.allSoldShares = allSoldShares;

        }

        /*
        generates random Shares
         */
        public double generateRandomShares() {
            Random r = new Random();
            int low = 500;
            int high = 1000;
            int shares = r.nextInt(high - low) + low;

            return shares;
        }

        /*
        generates random prices for shares
         */
        public double generateRandomSharePrice() {

            Random r = new Random();
            int low = 10;
            int high = 100;
            int sharePrices = r.nextInt(high - low) + low;

            return sharePrices;
        }

        /*
        setting and returning an instance of the class from the builder
         */
        public Companies build() {
            return new Companies(this);
        }
    }
}
