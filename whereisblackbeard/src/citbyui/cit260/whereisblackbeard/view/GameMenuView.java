/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;

import java.util.Scanner;
import byui.cit260.whereisblackbeard.model.Map;

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
                this.displayMap(); //map.getLocName(), map.getNoOfRows(), map.getNoOfColumns());
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
    
    private void displayMap() /* String locName, int locRow, int locCol) */ {
        System.out.println("*** displayMap function called ***");
        /*
        System.out.println("\n|-----------------------|")
                        + ("\n| Location Name") // + locName + " |")
                        + ("\n|-----------------------|")
                        + ("\n| | 1 | 2 | 3 | 4 | 5 | |")
                        + ("\n|1|")
                        + ("\n|2|")
                        + ("\n|3|")
                        + ("\n|4|")
                        + ("\n|5|")
                        + ("\n|-----------------------------|")
                        + ("\n You are at X,Y") // + locRow " , " + locCol)
                        + ("\n Where would you like to go?")
                        + ("\n Enter the row of the location you would like to go to.")
                        + ("\n Row? : ");
        */    
        
        /*
        //Display Title
        System.out.println("\n|--------- MAP ---------|");
        System.out.println("\n|-----------------------|");
        //Display Row numbers
        
        for (int i = 0; i <= noOfRows; i++ ) {
            System.out.println("\n| " + i + " | ");
            for (int icol = 0; i <= noOfColumns; icol++) {
                //System.out.print(icol);
                System.out.print(" | ");
                location = locations[row][column];
                if (locVisited = 1) {
                    System.out.print(" X ");
                }
                else {
                    System.out.print(" ? ");
                }
                //System.out.print(" | ");
            }
            System.out.print(" |");
        }
        System.out.print(" |");
        */
        
        // public void displayMap() {
            String leftIndicator;
            String rightIndicator;

            Game game = whereisblackbeard.getCurrentGame(); // retreive the game
            Map map = game.getMap(); // retreive the map from game
            Location[][] locations = map.getLocations(); // retreive the locations from map
            try {
              this.console.print(" |");
              for( int column = 0; column < locations[0].length; column++){
                this.console.print(" " + column + " |"); // print col numbers to side of map
              }
              this.console.println();
              for( int row = 0; row < locations.length; row++){
                this.console.print(row + " "); // print row numbers to side of map
                for( int column = 0; column < locations[row].length; column++){
                  leftIndicator = " ";
                  rightIndicator = " ";
                  if(locations[row][column] == map.getCurrentLocation()){
                    leftIndicator = "*"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "*"; // same as above
                  }
                  else if(locations[row][column].isVisited()){
                     leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                     rightIndicator = "<"; // same as above
                  }
                  this.console.print("|"); // start map with a |
                  if(locations[row][column].getScene() == null)
                    this.console.print(leftIndicator + "??" + rightIndicator);
                  else
                    this.console.print(leftIndicator + locations[row][column].getScene().getMapSymbol() + rightIndicator);
                }
                this.console.println("|");
              }
            }catch (Exception e) {
              System.out.println("Error");
            }
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
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        TestMenu testMenu = new TestMenu();
        testMenu.display();
    }
    
}