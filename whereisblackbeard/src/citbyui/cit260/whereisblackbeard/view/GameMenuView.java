/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;

//import java.util.Scanner;

import byui.cit260.whereisblackbeard.control.MapControl;
import byui.cit260.whereisblackbeard.control.ScenePicture;
import byui.cit260.whereisblackbeard.model.Game;
import byui.cit260.whereisblackbeard.model.Location;
import byui.cit260.whereisblackbeard.model.Map;
import whereisblackbeard.Whereisblackbeard;
//import byui.cit260.whereisblackbeard.model.Scene;

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
                  + "\nP - Port"
                  + "\nT - Test Menu"
                  + "\nR - Report Menu"
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
            case "T": // display the test menu
                this.displayTestMenu();
                break;
            case "R": // display the report menu
                this.displayReportMenu();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selction ** Try again");
                break;
        }
        
        return false;
    }
    
    public void displayMap() {
        String leftIndicator;
        String rightIndicator;
        
        int visitedScenes = 0;

        Game game = Whereisblackbeard.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        //Scene scene = scene.getScene();
        try {
          this.console.print("  |");
          for( int column = 0; column < locations[0].length; column++){
            this.console.print("  " + column + " |"); // print col numbers to side of map
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
                 visitedScenes++;
              }
              this.console.print("|"); // start map with a |
              if(locations[row][column].getScene() == null)
                this.console.print(leftIndicator + "??" + rightIndicator);
              else
              {
                this.console.print(leftIndicator + locations[row][column].getScene().getMapSymbol() + rightIndicator);
              }
            }
            this.console.println("|");
          }
          int TotalScenes = ScenePicture.values().length;
          
          double percent = MapControl.calcPercentage(visitedScenes, TotalScenes);
          
          this.console.println("You have visited " + visitedScenes + " of " + TotalScenes + " locations or " + percent + "% of the map");
        }catch (Exception e) {
          ErrorView.display(this.getClass().getName(),
                  "Error");
        }

          
    }
    
    private void playerFood() {
        this.console.println("*** playerFood function called ***");
    }

    private void playerWater() {
        this.console.println("*** playerWater function called ***");
    }

    private void playerWeapons() {
        this.console.println("*** playerWeapons function called ***");
    }

    private void playerGold() {
        this.console.println("*** playerGold function called ***");
    }
    
    private void displayPort() {
        PortView port = new PortView();
        port.display();
    }
    
    private void displayTestMenu() {
        TestMenu testMenu = new TestMenu();
        testMenu.display();
    }

    private void displayReportMenu(String filepath) {
        this.console.println("\nEnter the file path where the report "
                           + "is to be printed");
        String filePath = this.getInput();
    }

    private void displayReportMenu() {
        ReportMenu reportMenu = new ReportMenu();
        reportMenu.display();
    }
    
}