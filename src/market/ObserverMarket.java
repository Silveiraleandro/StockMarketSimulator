package market;

import business.Companies;
import business.Factories;

import java.util.ArrayList;
import java.util.List;


public class ObserverMarket {

    private static double totalSoldShare = 0;
    private static List<Companies> companiesWithSoldShares;

    /*
    this method increments 1 to the totalSoldShares, populates an array with
    companies that have made transactions. call the method update to the companies
    that have performed more than 10 transactions and set the counter to 0
     */
    public static void transactionCompleted(Companies comp) {
        companiesWithSoldShares = new ArrayList<>();

        totalSoldShare = totalSoldShare + 1;
        companiesWithSoldShares.add(comp);
        if (totalSoldShare == 10) {
            totalSoldShare = 0;
            updateShareValue(comp);
        }
    }

    /*
    This method checks if there are companies which sold more than 10 shares inside the array of 100 companies
    and call the method that drops their value in 2%
     */
    public static Companies updateShareValue(Companies comp) {
        if (!Factories.getAllCompanies().contains(companiesWithSoldShares.contains(comp))) {

            comp.dropValue();
        }
        return comp;

    }

}
