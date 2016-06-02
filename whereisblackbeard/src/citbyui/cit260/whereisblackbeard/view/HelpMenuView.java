/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;

import java.util.Scanner;

/**
 *
 * @author josephclark
 */
public class HelpMenuView {

    private String helpMenu;
    private String promptMessage;
    
    public HelpMenuView() {
        this.helpMenu = "\n"
                  + "\n----------------------------------------"
                  + "\n | Help Menu                           |"
                  + "\n----------------------------------------"
                  + "\nG - What is the goal of the game?"
                  + "\nM - How to move"
                  + "\nR - What resources are available?"
                  + "\nU - Using resources"
                  + "\nT - Tips"
                  + "\nQ - Quit"
                  + "\n----------------------------------------";
    }

    public void displayHelpMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String helpMenuOption = this.getHelpMenuOption();
            if (helpMenuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(helpMenuOption);
        } while (!done);
    }
    
    private String getHelpMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
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
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "G": // create and start a new game
                this.goalOfGame();
                break;
            case "M": // load and existing game
                this.moveInGame();
                break;
            case "R": // display the help menu
                this.resourcesAvailable();
                break;
            case "U": // save the current game
                this.usingResources();
                break;
            case "T": // tips for the game
                this.gameTips();
                break;
            default:
                System.out.println("\n*** Invalid selction ** Try again");
                break;
        }
        
        return false;
    }

    private void goalOfGame() {
        System.out.println("*** goalOfGame function called ***");    }

    private void moveInGame() {
        System.out.println("*** moveInGame function called ***");    }

    private void resourcesAvailable() {
        System.out.println("*** resourcesAvailable function called ***");    }

    private void usingResources() {
        System.out.println("*** usingResources function called ***");    }
    
    private void gameTips() {
        System.out.println("*** gameTips function called ***");    }

    void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
 
