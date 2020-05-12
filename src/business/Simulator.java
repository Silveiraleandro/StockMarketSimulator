
package business;

import random.id.RandomIdFacade;

import java.util.ArrayList;
import java.util.List;


public class Simulator {

    private static List<Companies>allCompanies;
    private static List<Investors>allInvestors;

    /*
    creating 100 companies and saving them inside an array list applying the Factory design
     */
    public static List<Companies> factoryOf100Instances(){
        allCompanies = new ArrayList<>();
        for(int i = 0; i < 100; i ++){
            allCompanies.add(new Companies.BuilderCompany(RandomIdFacade.generateId(COMPANY),10, 20).build());
        }
        return allCompanies;
    }
    /*
    creating 100 investors and saving them inside an array list applying the Factory design
     */
    public static List<Investors> factoryOf100Instances() {
        allInvestors = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            allInvestors.add(new Companies.BuilderCompany(RandomIdFacade.generateId(INVESTORS), 10, 20).build());
        }
        return allInvestors;
    }

}
