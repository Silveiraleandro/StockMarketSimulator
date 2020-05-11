package cli;

import business.Companies;
import random.id.RandomIdFacade;

public class Main {
    public static void main(String[] args){
        Companies c = new Companies.BuilderCompany(RandomIdFacade.generateId(RandomIdFacade.IdFacade.COMPANY),10, 20).build();
        System.out.println(c);
    }
}
