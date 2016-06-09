/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;

import java.util.Scanner;

/**
 *
 * @author jlfarnes
 */
public class CombatView {
    
    private String combatView;
    private String commView;
    private String attackView;
    private String runAwayView;
    private String runToPortView;
    private int choiceLevel = 2;
    // private String promptMessage;
    
    public CombatView() {
        this.combatView = "\n"
                  + "\n----------------------------------------"
                  + "\n | In Combat                           |"
                  + "\n----------------------------------------"
                  + "\nH - Hail the other ship"
                  + "\nF - Fire"
                  + "\nR - Run Away"
                  + "\n----------------------------------------";
        
        this.commView = "\n"
                  + "\n----------------------------------------"
                  + "\n | Hail The Enemy Ship                 |"
                  + "\n----------------------------------------"
                  + "\nD - Diplomacy"
                  + "\nL - Deception"
                  + "\nT - Trade"
                  + "\nC - Cancel"
                  + "\n----------------------------------------";
        
        this.attackView = "\n"
                  + "\n----------------------------------------"
                  + "\n | Attack Enemy Ship                   |"
                  + "\n----------------------------------------"
                  + "\nS - Hail the other ship"
                  + "\nF - Fire at Will"
                  + "\nB - Broadside"
                  + "\nC - Cancel"
                  + "\n----------------------------------------";
        
        this.runAwayView = "\n"
                  + "\n----------------------------------------"
                  + "\n | Run Away from the Enemy Ship        |"
                  + "\n----------------------------------------"
                  + "\nC - Run to Cove"
                  + "\nF - Run to Another Port"
                  + "\nC - Cancel"
                  + "\n----------------------------------------";
        
        this.runToPortView = "\n"
                  + "\n----------------------------------------"
                  + "\n | Run Away to a Port       |"
                  + "\n----------------------------------------"
                  + "\nL - London"
                  + "\nC - Canary Islands"
                  + "\nB - Bahamas"
                  + "\nG - Guadalajara"
                  + "\nF - Florida Keys"
                  + "\nC - Cancel"
                  + "\n----------------------------------------";
    }

    public void displayCombatView() {
        
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
            System.out.println("\n" + this.combatView);
            
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

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        if (this.choiceLevel == 2) {
            switch (choice) {
                case "H":
                    this.commView();
                    choiceLevel = 3;
                    break;
                case "F":
                    this.attackView();
                    choiceLevel = 4;
                    break;
                case "R":
                    this.runAwayView();
                    choiceLevel = 5;
                    break;
                default:
                    System.out.println("\nInvalid selection, Try again...");
                    break;
            }
        }
            
        return false;
    }

    private void commView() {
        System.out.println("*** foodStores function called ***");
    }

    private void attackView() {
        System.out.println("*** waterStores function called ***");
    }

    private void runAwayView() {
        System.out.println("*** armoryWeapons function called ***");
    }

    private void runToPortView() {
        System.out.println("*** drydockRepair function called ***");
    }
}
