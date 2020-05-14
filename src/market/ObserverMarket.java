package market;

import business.Companies;
import business.Investors;


public class ObserverMarket {



    public static void transactionCompleted(Investors investor, Companies company){
        double totalSoldShare = 0;

        if (investor.buyShares(company) == true) {
           investor.getBudget() = investor.getBudget() - company.getSharePrice();
          totalSoldShare = totalSoldShare + 1;

        }
    }
    public void changeQuantityOFShares(){

    }
    public void addToTotalSoldShares(){

    }
}
