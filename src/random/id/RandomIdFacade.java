package random.id;

import business.Companies;
import business.Investors;

public class RandomIdFacade {

    public static enum RandomId {
        COMPANY_ID, INVESTORS_ID;
    }

    public static void generateID(RandomId com, RandomId inv) {

        IdGenerator compId = new IdGenerator();
        switch (com) {
            case COMPANY_ID:
                Companies.BuilderCompany company = compId.uniqueCompId();
                switch (inv) {
                    case INVESTORS_ID:
                        Investors.BuilderInvestors investor = compId.uniqueInvId();
                        break;
                }
        }


    }


}
