package business;

import random.id.RandomIdFacade;

import java.util.ArrayList;
import java.util.List;

public class Factories {

    private static List<Companies> allCompanies = factoryOf100Companies();
    private static List<Investors> allInvestors = factoryOf100Investors();

    /*
    creating 100 companies and saving them inside an array list applying the Factory design
     */
    public static List<Companies> factoryOf100Companies() {
        List<Companies> allCompanies = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            allCompanies.add(new Companies.BuilderCompany(RandomIdFacade.generateId(RandomIdFacade.IdFacade.COMPANY)).build());
        }

        return allCompanies;
    }

    /*
    creating 100 investors and saving them inside an array list applying the Factory design
     */
    public static List<Investors> factoryOf100Investors() {
        List<Investors> allInvestors = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            allInvestors.add(new Investors.BuilderInvestors(RandomIdFacade.generateId(RandomIdFacade.IdFacade.INVESTOR), 0).build());
        }
        return allInvestors;
    }

    /*
    GETTERS
     */
    public static List<Companies> getAllCompanies() {

        return allCompanies;
    }

    public static List<Investors> getAllInvestors() {

        return allInvestors;
    }
}
