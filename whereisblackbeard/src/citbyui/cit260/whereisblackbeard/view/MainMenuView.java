/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;

import byui.cit260.whereisblackbeard.control.GameControls;
import java.util.Scanner;
import whereisblackbeard.Whereisblackbeard;

/**
 *
 * @author josephclark
 */
public class MainMenuView {
    
    private String menu;
    // private String promptMessage;
    
    public MainMenuView() {
        this.menu = "\n"
                  + "\n----------------------------------------"
                  + "\n | Main Menu                           |"
                  + "\n----------------------------------------"
                  + "\nN - Begin a new game"
                  + "\nL - Load an existing game"
                  + "\nH - Get help with how to play the game"
                  + "\nS - Save game"
                  + "\nQ - Quit"
                  + "\n----------------------------------------";
    }

    public void displayMainMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
    }
    
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.menu);
            
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
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "L": // load and existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selction ** Try again");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
        // create a new game
        GameControls.createNewGame(Whereisblackbeard.getPlayer());
        
        // display the game menue
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");    }

    private void displayHelpMenu() {
        // System.out.println("*** startExistingGame function called ***");
        //
        // display the help menue
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");    }
    
}
