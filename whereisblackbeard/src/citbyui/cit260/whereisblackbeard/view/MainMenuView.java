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
public class MainMenuView extends View {
        
    public MainMenuView() {
              super("\n"
                  + "\n----------------------------------------"
                  + "\n | Main Menu                           |"
                  + "\n----------------------------------------"
                  + "\nN - Begin a new game"
                  + "\nL - Load an existing game"
                  + "\nH - Get help with how to play the game"
                  + "\nS - Save game"
                  + "\nP - How to explore the port view"
                  + "\nG - Go to game menu"
                  + "\nT - Test Menu"
                  + "\nQ - Quit"
                  + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
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
            case "P": // display the port view
                this.displayPort();
                break;
            case "G": // display the game menu
                this.displayGameMenu();
                break;
            case "T": // display the game menu
                this.displayTestMenu();
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
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");    }

    private void displayHelpMenu() {
        // System.out.println("*** startExistingGame function called ***");
        //
        // display the help menue
        HelpMenuView helpMenu = new HelpMenuView();
        // helpMenu.displayHelpMenuView();
        helpMenu.display();        
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");    }

    private void displayPort() {
        PortView port = new PortView();
        port.display();
    }

    private void displayGameMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayTestMenu() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        TestMenu testMenu = new TestMenu();
        testMenu.display();
    }
    
}
