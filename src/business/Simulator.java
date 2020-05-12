
package business;

import random.id.RandomIdFacade;

import java.util.ArrayList;
import java.util.List;


public class Simulator {

    private static List<Companies>allCompanies;
    private static List<Investors>allInvestors;

    public Simulator(){
        factoryOf100Companies();
        factoryOf100Investors();
    }
    /*
    creating 100 companies and saving them inside an array list applying the Factory design
     */
    public static List<Companies> factoryOf100Companies(){
        allCompanies = new ArrayList<>();
        for(int i = 0; i < 100; i ++){
            allCompanies.add(new Companies.BuilderCompany(RandomIdFacade.generateId(RandomIdFacade.IdFacade.COMPANY),10, 20).build());
        }
        for (Companies com : allCompanies){
            System.out.println(com);}
        return allCompanies;
    }
    /*
    creating 100 investors and saving them inside an array list applying the Factory design
     */
    public static List<Investors> factoryOf100Investors() {
            allInvestors = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                allInvestors.add(new Investors.BuilderInvestors(RandomIdFacade.generateId(RandomIdFacade.IdFacade.INVESTOR), 10, 20).build());
            }

            for (Investors inv : allInvestors) {
                System.out.println(inv);}
                return allInvestors;
            }

}
