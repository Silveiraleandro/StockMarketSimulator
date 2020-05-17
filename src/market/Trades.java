package market;

import business.Companies;
import business.Factories;
import business.Investors;
import cli.User;

import java.util.List;
import java.util.Random;


public class Trades {

    private List<Companies> allCompanies;
    private List<Investors> allInvestors;
    private User user = new User();

    public Trades() {
        this.allInvestors = Factories.getAllInvestors();
        this.allCompanies = Factories.getAllCompanies();

    }

    /*
    this method grabs an investor out of an array of investors, grabs a random
    company out of a array of companies and puts the investor to buy shares
    from this random company
     */
    public void tradingDay() {

        Random randomGenerator = new Random();
        for (Investors inv : allInvestors) {
            Companies comp = allCompanies.get(randomGenerator.nextInt(100));
            inv.buyShares(comp);
            comp.sellShares();
            ObserverMarket.transactionCompleted(comp);

            user.userMenu();

        }

    }
}
