package cli;

import business.Companies;
import random.id.RandomIdFacade;

public class Main {
    public static void main(String[] args){
        RandomIdFacade facade = new RandomIdFacade();
        Companies c = new Companies.BuilderCompany(facade.),10, 20).build();
        System.out.println(c);
    }
}
