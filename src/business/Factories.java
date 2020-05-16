package business;

import random.id.RandomIdFacade;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Factories {

    private static List<Companies> allCompanies;
    private static List<Investors> allInvestors;


    public Factories() {
        this.allCompanies = factoryOf100Companies();
        this.allInvestors = factoryOf100Investors();
    }

    /*
    creating 100 companies and saving them inside an array list applying the Factory design
     */
    public static List<Companies> factoryOf100Companies() {
        allCompanies = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            allCompanies.add(new Companies.BuilderCompany(RandomIdFacade.generateId(RandomIdFacade.IdFacade.COMPANY)).build());
        }

        return allCompanies;
    }

    /*
    creating 100 investors and saving them inside an array list applying the Factory design
     */
    public static List<Investors> factoryOf100Investors() {
        allInvestors = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            allInvestors.add(new Investors.BuilderInvestors(RandomIdFacade.generateId(RandomIdFacade.IdFacade.INVESTOR), 0).build());
        }

        return allInvestors;
    }

    /*
    method that pics a random company in an array of companies
     */
    public static Companies picRandomCompany() {
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(factoryOf100Companies().size());

        return factoryOf100Companies().get(index);
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
