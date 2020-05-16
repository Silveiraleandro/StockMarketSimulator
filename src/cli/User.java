package cli;

import business.Factories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {
    public User() {

        userMenu();
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
         Factories fac = new Factories();
        switch (option) {
            case 1:
                viewHighestCapital();
                break;
            case 2:
                searchCountryByCode();
                break;
            case 3:
                searchCountryByName();
                break;
            case 4:
                createCountry();
                break;
            case 5:
                System.out.println("Thank you for using the system");
                System.exit(0);
                //closing the connection with the database
                DbConnect.getInstance().close();
                break;
        }
        userMenu();
    }

    public void viewHighestCapital(){

    }
}
