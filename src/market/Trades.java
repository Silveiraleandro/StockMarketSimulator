package market;

import business.Companies;
import business.Factories;
import business.Investors;
import random.id.RandomIdFacade;

public class Trades {


    public void tradingDay(){
        Companies company = new Companies.BuilderCompany(RandomIdFacade.generateId(RandomIdFacade.IdFacade.COMPANY)).build();
        for (inv:Factories.factoryOf100Investors()) {
            inv.buyShares(Factories.factoryOf100Companies());

        }
    }
}
