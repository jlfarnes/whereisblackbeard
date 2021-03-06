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
public class PortView extends View {

    // private String port;
    // private String promptMessage;
    
    public PortView() {
        //this.port = 
                super("\n"
                  + "\n----------------------------------------"
                  + "\n | Exploring a Port                    |"
                  + "\n----------------------------------------"
                  + "\nA - Armory"
                  + "\nD - Drydock"
                  + "\nJ - Jobs"
                  + "\nM - Market"
                  + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "A": // display the help menu
                this.armoryWeapons();
                break;
            case "D": // save the current game
                this.drydockRepair();
                break;
            case "J": // tips for the game
                this.jobsBoard();
                break;
            case "M":
                this.marketView();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selction ** Try again");
                break;
        }
        
        return false;
    }

    private void armoryWeapons() {
        // this.console.println("*** armoryWeapons function called ***");
        
        ArmoryView armory = new ArmoryView();
        armory.display();
    }

    private void drydockRepair() {
        this.console.println("*** drydockRepair function called ***");
    }

    private void jobsBoard() {
        this.console.println("*** jobsBoard function called ***");
    }

    private void marketView() {
        // this.console.println("*** marketView function called ***");
        
        MarketView market = new MarketView();
        market.display();
    }
}
 
