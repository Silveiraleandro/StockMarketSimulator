
package business;

import random.id.RandomIdFacade;

import java.util.List;

public class Simulator {

    private List<Companies>allCompanies;
    private List<Investors>allInvestors;

    public Simulator() {


    }
    /*
    creating 100 companies and saving them inside an array list
     */
        public void creatingAllCompanies(){
        Companies com = new Companies.BuilderCompany();
        allCompanies.add(com);
        }
    /*
    creating 100 investors and saving them inside an array list
     */
        public void creatingAllInvestors(){
        Investors inv = new Investors.BuilderInvestors();
        allInvestors.add(inv);

        }
}
