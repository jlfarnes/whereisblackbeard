/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;

import byui.cit260.whereisblackbeard.control.GameControls;
import byui.cit260.whereisblackbeard.model.Player;
import java.util.Scanner;

/**
 *
 * @author josephclark
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
    this.promptMessage = "\nPlease enter your name: ";
    //display the banner when view is created
    this.displayBanner();
}

    public void displayBanner() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println(
                "\n**************************************************"
              + "\n*                                                *"
              + "\n* Enter banner lore here                         *"
              + "\n*                                                *"
              + "\n**************************************************"
                );
    }

    public void displayStartProgramView() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        System.out.println("\n*** displayStartProgram() function called ***");
        
        boolean done = false;
        do {
            // prompt for and get player name
            String playersName = this.getPlayersName(); // May need varible
            if (playersName.toUpperCase().equals("Q")) // User saying to quit
                return; //exit game
            
            // show next view
            done = this.doAction(playersName);
            
        } while (!done);
            
    }

    private String getPlayersName() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        // System.out.println("\n*** getPlayersName() called ***");
        // return "Joe";
        
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

    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
    }
        
    // call createPlayer() control function
        Player player = GameControls.createPlayer(playersName);
        
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }

        // display next view
        this.displayNextView(player);
        
        return true;
    }

    private void displayNextView(Player player) {
        // display a custom welcome message
        System.out.println("\n============================================="
                          + "\n Welcome to the game, " + player.getPlayerName()
                          + "\n We hope you have a lot of fun!"
                          + "\n============================================="
                          );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }
    
}