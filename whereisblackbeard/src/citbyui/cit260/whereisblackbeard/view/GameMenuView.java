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
                  + "\nM - Map"
                  + "\nF - Food"
                  + "\nW - Water"
                  + "\nA - Weapons"
                  + "\nG - Gold"
                  + "\nP - How to explore the port view"
                  + "\nT - Test Menu"
                  + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "M":
                this.displayMap();
                break;
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
            case "P": // display the port view
                this.displayPort();
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
    
    private void displayMap(String locName, int locRow, int locCol) {
        System.out.println("*** displayMap function called ***");
        /*
        System.out.println("\n|-----------------------|")
                        + ("\n| " + locName + " |")
                        + ("\n|-----------------------|")
                        + ("\n| | 1 | 2 | 3 | 4 | 5 | |")
                        + ("\n|1|")
                        + ("\n|2|")
                        + ("\n|3|")
                        + ("\n|4|")
                        + ("\n|5|")
                        + ("\n|-----------------------------|")
                        + ("\n You are at " + locRow " , " + locCol)
                        + ("\n Where would you like to go?")
                        + ("\n Enter the row of the location you would like to go to.")
                        + ("\n Row? : ");
                        */
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
    
    private void displayPort() {
        PortView port = new PortView();
        port.display();
    }
    
    private void displayTestMenu() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        TestMenu testMenu = new TestMenu();
        testMenu.display();
    }
    
}