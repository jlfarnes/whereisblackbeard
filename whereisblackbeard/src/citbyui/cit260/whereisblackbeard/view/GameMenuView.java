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
public class GameMenuView extends View {

    private String gameMenu;
    // private String promptMessage;
    
    public GameMenuView() {
        //this.gameMenu = 
                super("\n"
                  + "\n----------------------------------------"
                  + "\n | Game Menu                          |"
                  + "\n----------------------------------------"
                  + "\nF - Food"
                  + "\nW - Water"
                  + "\nA - Weapons"
                  + "\nG - Gold"
                  + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
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
    
}