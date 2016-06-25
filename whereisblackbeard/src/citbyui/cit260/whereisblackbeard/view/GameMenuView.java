/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;

//import java.util.Scanner;

import byui.cit260.whereisblackbeard.model.Game;
import byui.cit260.whereisblackbeard.model.Location;
import byui.cit260.whereisblackbeard.model.Map;
import byui.cit260.whereisblackbeard.model.Scene;

//import byui.cit260.whereisblackbeard.model.Map;

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
                // Map map = new Map();
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
    
    public void displayMap() {
        String leftIndicator;
        String rightIndicator;

        Game game = game.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        Scene scene = scene.getScene();
        try {
          System.out.print(" |");
          for( int column = 0; column < locations[0].length; column++){
            System.out.print(" " + column + " |"); // print col numbers to side of map
          }
          System.out.println();
          for( int row = 0; row < locations.length; row++){
            System.out.print(row + " "); // print row numbers to side of map
            for( int column = 0; column < locations[row].length; column++){
              leftIndicator = " ";
              rightIndicator = " ";
              if(locations[row][column] == map.getCurrentLocation()){
                leftIndicator = "*"; // can be stars or whatever these are indicators showing visited
                rightIndicator = "*"; // same as above
              }
            /*  else if(locations[row][column].isVisited()){
                 leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                 rightIndicator = "<"; // same as above
              } */
              System.out.print("|"); // start map with a |
              if(locations[row][column].getScene() == null)
                System.out.print(leftIndicator + "??" + rightIndicator);
              else
                System.out.print(leftIndicator + locations[row][column].getScene().getMapSymbol() + rightIndicator);
            }
            System.out.println("|");
          }
        }catch (Exception e) {
          System.out.println("Error");
        }
          
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
        TestMenu testMenu = new TestMenu();
        testMenu.display();
    }
    
}