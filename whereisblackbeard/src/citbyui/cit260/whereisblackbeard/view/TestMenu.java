/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;

import java.util.Scanner;

/**
 *
 * @author jlfarnes
 */
public class TestMenu {
    
    private String menus;
    private String choice;
    private String testOption;
    boolean done = false; // set flag to not done
    
    public void loadTestMenuText() {
        this.menus = "\n"
                + "\nTest Menu"
                + "\n========="
                + "\nS - Starting Cove View"
                + "\nP - Port View"
                + "\nC - Combat View"
                + "\n"
                + "\n============="
                + "\nM - Main Menu";
    }
    
    public void displayTestMenu() {
        this.loadTestMenuText();
        System.out.println(menus);
        
    /*    do {
            // prompt for and get players name
            String testOption = this.getTestOption();
            if (testOption.toUpperCase().equals("M")) // user wants to quit
                //return; // exit the game\
                //displayMainMenu();
            
            // do the requested action and display the next view
            done = this.doAction(testOption);
        } while (!done); */
        this.getTestOption();
        this.doAction(choice);
    
    }
    
    public String getTestOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.choice);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length()  < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; // end of loop
        }
            
        
        return value; 
    }
    
    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "S":
                this.startingCove();
                break;
            case "P":
                this.portView();
                break;
            case "C":
                this.combatView();
                break;
            case "M":
                this.mainMenuView();
                break;
            default:
                System.out.println("\n*** Invalid selction ** Try again");
                break;
        }
        
        return false;
    }

    private void startingCove() {
        System.out.println("*** startingCove function called ***");
    }

    private void portView() {
        System.out.println("*** portView function called ***");
    }

    private void combatView() {
        System.out.println("*** combatView function called ***");
    }

    private void mainMenuView() {
        System.out.println("*** mainMenuView function called ***");
    }
    

    
}
