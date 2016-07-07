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
public class HelpMenuView extends View {

    //private String helpMenu;
    // private String promptMessage;
    
    public HelpMenuView() {
    //    this.helpMenu = 
                    super("\n"
                  + "\n----------------------------------------"
                  + "\n | Help Menu                           |"
                  + "\n----------------------------------------"
                  + "\nG - What is the goal of the game?"
                  + "\nM - How to move"
                  + "\nR - What resources are available?"
                  + "\nU - Using resources"
                  + "\nT - Tips"
                  + "\nQ - Quit"
                  + "\n----------------------------------------");
    }
/*
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
            System.out.println("\n" + this.helpMenu);
            
            value = this.keyboard.readLine();
            value = value.trim();
            
            if (value.length()  < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; // end of loop
        }
            
        
        return value; 
    } */

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "G": // create and start a new game
                this.goalOfGame();
                break;
            case "M": // load and existing game
                this.moveInGame();
                break;
            case "R": // display the help menu
                this.displayInventoryMenu();
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
        // System.out.println("*** goalOfGame function called ***");
        System.out.println("\n You are a new pirate. Find Blackbeard to claim "
                + "\n\rthe title of the biggest, baddest pirate on the high seas.");
    }

    private void moveInGame() {
        System.out.println("*** You move in game by using the letter key and then pressing enter ***");    }

    private void resourcesAvailable() {
        System.out.println("*** The in-game window shows how many ammo, food, and water as well as gold ***");    }

    private void usingResources() {
        System.out.println("*** Resources are removed as you move places or spend gold ***");    }
    
    private void gameTips() {
        System.out.println("*** You need to upgrade or you will not be able to proceed ***");    }
    
    private void displayInventoryMenu() {
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.display();
    }

}
 
