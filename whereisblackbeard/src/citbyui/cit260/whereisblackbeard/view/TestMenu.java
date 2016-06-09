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
        
        
    /*    do {
            // prompt for and get players name
            String testOption = this.getTestOption();
            if (testOption.toUpperCase().equals("M")) // user wants to quit
                //return; // exit the game\
                //displayMainMenu();
            
            // do the requested action and display the next view
            done = this.doAction(testOption);
        } while (!done); */
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
    
    private void doAction(testOption) {
        //System.out.println("doing nothing for now");
        
        switch (choice) {
            case "S":
                System.out.println("\nStarting Cove View called");
                //displayStartingCove();
                break;
            case "P":
                System.out.println("\nPort View called");
                //PortView.displayPortView();
                break;
            case "C":
                System.out.println("\nCombat View called");
                //displayCombatView();
                break;
            case "M":
                System.out.println("\nMain Menu View called");
                //displayMainMenu();
                break;
            default:
                System.out.println("\nInvalid value");
                break;
        }
    }

    private static class testOption {

        public testOption() {
            System.out.println("\ntestOption called");
        }
    }
}
