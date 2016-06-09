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
public class GameMenuView {

    private String gameMenu;
    // private String promptMessage;
    
    public GameMenuView() {
        this.gameMenu = "\n"
                  + "\n----------------------------------------"
                  + "\n | Game Menu                          |"
                  + "\n----------------------------------------"
                  + "\nF - Food"
                  + "\nW - Water"
                  + "\nA - Weapons"
                  + "\nG - Gold"
                  + "\n----------------------------------------";
    }

    public void displayGameMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String gameMenuOption = this.getGameMenuOption();
            if (gameMenuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(gameMenuOption);
        } while (!done);
    }
    
    private String getGameMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.gameMenu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length()  < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            else if (value.length() > 0) {
                System.out.println("\nValid value");
                continue;
            }
            
            break; // end of loop
        }
            
        
        return value; 
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "F": // create and start a new game
                this.playerFood();
                break;
            case "W": // load and existing game
                this.playerWater();
                break;
            case "A": // display the help menu
                this.playerWeapons();
                break;
            case "G": // save the current game
                this.playerGold();
                break;
            default:
                System.out.println("\n*** Invalid selction ** Try again");
                break;
        }
        
        return false;
    }

    private void playerFood() {
        System.out.println("*** playerFood function called ***");
    }

    private void playerWater() {
        System.out.println("*** playerWater function called ***");
    }

    private void playerWeapons() {
        System.out.println("*** playerWeapons function called ***");
    }

    private void playerGold() {
        System.out.println("*** playerGold function called ***");
    }


    void displayGameMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
 
