package market;

import business.Companies;
import business.Factories;
import business.Investors;

import java.util.ArrayList;
import java.util.List;


public class ObserverMarket {
    double totalSoldShare = 0;

/*
this method increments 1 to the totalSoldShares every time a investor
buys a share from a company and returns the totalSoldShares figure
 */

    public double transactionCompleted(Investors investor,Companies company){
        if (investor.buyShares(company) == true) {
            totalSoldShare = totalSoldShare + 1;
            if (totalSoldShare == 10){
                updateCompanyShares(???? , company);
            }
        }
        return totalSoldShare;
    }
    /*
    this method increments in 10 X the price of the shares of the companies that have sold
    10 or more shares in total
     */

    public Companies updateCompanyShares(Factories fac, Companies company) {
        double doubleSharePrice = company.getSharePrice() * 2;
        for (company:fac.factoryOf100Companies()) {
            company.setSharePrice(doubleSharePrice);
        }
        if(company.getShare()==0){
            double reducedShareValue = company.getSharePrice() * 0.98;
            company.setShare(reducedShareValue);
        }
        totalSoldShare = 0;

        return  company;
    }

}
