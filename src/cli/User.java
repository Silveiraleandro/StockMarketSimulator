package cli;

import business.Companies;
import business.Factories;
import business.Investors;
import market.Trades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class User {
    private static List<Companies> allCompanies;
    private static List<Investors> allInvestors;

    public User() {
        this.allCompanies = Factories.getAllCompanies();
        this.allInvestors = Factories.getAllInvestors();

    }

    /*
    method to read input from the user
     */
    private String userReader() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = null;



        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

    /*
    method that displays the main menu that the user sees
     */
    public void userMenu() {

        System.out.println("Hello User........Menu Options to: \n");
        System.out.println("1. Company with the highest capital");
        System.out.println("2. Company with the lowest capital");
        System.out.println("3. Investor with the highest number of shares");
        System.out.println("4. Investor with the lowest number of shares");
        System.out.println("5. Exit the program");


        String input = userReader();

        if (!input.matches("[1-5]+")) {
            System.out.println("Select a number from 1-5 please try again\r\n");
            userMenu();
        } else {
            int in = Integer.parseInt(input);
            System.out.println("You have chosen to: ");
            internalMenu(in);
        }

    }

    /*
    this method displays the internalMenu
     */
    public void internalMenu(Integer option) {
        switch (option) {
            case 1:
                viewHighestCapitalCompany();
                break;
            case 2:
                viewLowestCapitalCompany();
                break;
            case 3:
                viewInvestorWithMoreShares();
                break;
            case 4:
                viewInvestorWithLessShares();
                break;
            case 5:
                System.out.println("Thank you for using the system");
                System.exit(0);
                break;
        }
        userMenu();
    }

    public void viewHighestCapitalCompany(){
       double companyHighestCap = 0;
        for(Companies company : allCompanies){
            companyHighestCap = company.getSharePrice();
            System.out.println(companyHighestCap);

        }
    }
    public void viewLowestCapitalCompany(){

    }
    public void viewInvestorWithMoreShares(){

    }
    public void viewInvestorWithLessShares(){

    }

}
