/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;

import byui.cit260.whereisblackbeard.control.GameControls;
import byui.cit260.whereisblackbeard.model.Player;
import whereisblackbeard.Whereisblackbeard;

/**
 *
 * @author josephclark
 */
public class GameMenuView {

    void displayMenu() {
        System.out.println("\n*** displayMenu stub function called ***");
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
        this.displayHelpMenu();
        
        return true;
    }
/*
    private void displayHelpMenu(Player player) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\ndisplayHelpMenu called"
    }
*/
    private void displayHelpMenu() {
        
        // display the help menue
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }
    
    private void displayPort() {
        
        // display the help menue
        PortView port = new PortView();
        port.displayPortView();
    }
    
}
