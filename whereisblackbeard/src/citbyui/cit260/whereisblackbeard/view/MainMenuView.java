/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;

import byui.cit260.whereisblackbeard.control.GameControls;
import byui.cit260.whereisblackbeard.exceptions.GameControlsExceptions;
import byui.cit260.whereisblackbeard.exceptions.MapControlExceptions;
import byui.cit260.whereisblackbeard.model.Game;
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
                  + "\nR - Return to current game"
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
            case "R": // display the game menu
                Game game = Whereisblackbeard.getCurrentGame();
                if (game != null)
                    this.displayGameMenu();
                else
                    ErrorView.display("Main Menu View",
                        "\n*** There is no game loaded ** Try again");
                break;
            default:
                ErrorView.display("Main Menu View",
                        "\n*** Invalid selction ** Try again");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
        // create a new game
        try {
            GameControls.createNewGame(Whereisblackbeard.getPlayer());
        
            // display the game menue
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
        } catch(MapControlExceptions ex) {
            ErrorView.display("GameControls", ex.getMessage());
        }
    }

    private void startExistingGame() {
        
        this.console.println("\nEnter the file path where the game "
                           + "is saved");
        
        String filePath = this.getInput();
        
        try {
    
            GameControls.getExistingGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        // this.console.println("*** startExistingGame function called ***");
        //
        // display the help menue
        HelpMenuView helpMenu = new HelpMenuView();
        // helpMenu.displayHelpMenuView();
        helpMenu.display();        
    }

    private void saveGame() {
        this.console.println("\nEnter the file path where the game "
                           + "is to be saved");
        String filePath = this.getInput();
        
        try {
    
            GameControls.saveGame(Whereisblackbeard.getCurrentGame(), filePath);
        } catch (GameControlsExceptions ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void displayGameMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    
}
