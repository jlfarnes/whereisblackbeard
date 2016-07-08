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
public class StartProgramView extends View {
    
    // private String promptMessage;
    
    public StartProgramView() {
          super("\n**************************************************"
              + "\n*                                                *"
              + "\n* Enter banner lore here                         *"
              + "\n*                                                *"
              + "\n**************************************************"
              + "\nPlease enter your name: "
                );
        
        //this.promptMessage = ;
    //display the banner when view is created
    //this.display();
}
/*
    public void displayStartProgramView() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        //this.console.println("\n*** displayStartProgram() function called ***");
        
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
        
        // this.console.println("\n*** getPlayersName() called ***");
        // return "Joe";
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            this.console.println("\n" + this.promptMessage);
            
            value = this.keyboard.readLine();
            value = value.trim();
            
            if (value.length()  < 1) {
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; // end of loop
        }
            
        
        return value; 
    }
*/
    @Override
    public boolean doAction(String playersName) {
        
        if (playersName.length() < 2) {
            ErrorView.display(this.getClass().getName(),
                    "\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
    }
        
    // call createPlayer() control function
        Player player = GameControls.createPlayer(playersName);
        
        if (player == null) {
            ErrorView.display(this.getClass().getName(),
                    "\nError creating the player.");
            return false;
        }

        // display next view
        this.displayNextView(player);
        
        return true;
    }

    private void displayNextView(Player player) {
        // display a custom welcome message
        this.console.println("\n============================================="
                          + "\n Welcome to the game, " + player.playerName
                          + "\n We hope you have a lot of fun!"
                          + "\n============================================="
                          );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.display();
    }
    
}