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

    private String port;
    // private String promptMessage;
    
    public PortView() {
        this.port = "\n"
                  + "\n----------------------------------------"
                  + "\n | Exploring a Port                           |"
                  + "\n----------------------------------------"
                  + "\nF - Food Stores"
                  + "\nW - Water Stores"
                  + "\nA - Armory"
                  + "\nD - Drydock"
                  + "\nJ - Jobs"
                  + "\n----------------------------------------";
    }

    public void displayPortView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String portOption = this.getPortOption();
            if (portOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(portOption);
        } while (!done);
    }
    
    private String getPortOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.port);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length()  < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; // end of loop
        }
            
        
        return value; 
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "F": // create and start a new game
                this.foodStores();
                break;
            case "W": // load and existing game
                this.waterStores();
                break;
            case "A": // display the help menu
                this.armoryWeapons();
                break;
            case "D": // save the current game
                this.drydockRepair();
                break;
            case "J": // tips for the game
                this.jobsBoard();
                break;
            default:
                System.out.println("\n*** Invalid selction ** Try again");
                break;
        }
        
        return false;
    }

    private void foodStores() {
        System.out.println("*** foodStores function called ***");
    }

    private void waterStores() {
        System.out.println("*** waterStores function called ***");
    }

    private void armoryWeapons() {
        System.out.println("*** armoryWeapons function called ***");
    }

    private void drydockRepair() {
        System.out.println("*** drydockRepair function called ***");
    }

    private void jobsBoard() {
        System.out.println("*** jobsBoard function called ***");
    }
}
 
