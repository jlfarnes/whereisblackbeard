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
public class CombatView extends View {
    
    private String combatView;
    private String commView;
    private String attackView;
    private String runAwayView;
    private String runToPortView;
    private String combatOption;
    private int choiceLevel = 2;
    // private String promptMessage;
    
    public CombatView() {
        // this.combatView = 
                super("\n"
                  + "\n----------------------------------------"
                  + "\n | In Combat                           |"
                  + "\n----------------------------------------"
                  + "\nH - Hail the other ship"
                  + "\nF - Fire"
                  + "\nR - Run Away"
                  + "\n----------------------------------------");
        
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
                  + "\nD - Cancel"
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
    
    private String getCombatOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            
            //System.out.println("\n" + this.combatView);
            //
            // Print appropriate menu level
            switch (choiceLevel) {
                case 2: // Combat Menu text
                    System.out.println("\n" + this.combatView);
                    break;
                case 3: // Hail
                    System.out.println("\n" + this.commView);
                    break;
                case 4: // Fire
                    System.out.println("\n" + this.attackView);
                    break;
                case 5: // Runaway
                    System.out.println("\n" + this.runAwayView);
                    break;
                case 6:
                    System.out.println("\n" + this.runToPortView);
                    break;
            }
            
            
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
        System.out.println("Choice level is" + choiceLevel);
        
        if (this.choiceLevel == 2) {
            
            switch (choice) {
                case "H":
                    choiceLevel = 3;
                    this.commView();
                    break;
                case "F":
                    choiceLevel = 4;
                    this.attackView();
                    break;
                case "R":
                    choiceLevel = 5;
                    this.runAwayView();
                    break;
                default:
                    System.out.println("\nInvalid selection, Try again...");
                    break;
            }
        }
        else if (this.choiceLevel == 3) { // communication Menu
            switch (choice) {
                case "D":
                    System.out.println("\nDiplomacy called, returning to Combat menu");
                    choiceLevel = 2;
                    this.display();
                    // this.commView();
                    break;
                case "L":
                    System.out.println("\nDeception called, returning to Combat menu");
                    choiceLevel = 2;
                    this.display();
                    // this.attackView();
                    break;
                case "T":
                    System.out.println("\nTrade&Barter called, returning to Combat menu");
                    choiceLevel = 2;
                    this.display();
                    // this.runAwayView();
                    break;
                default:
                    System.out.println("\nInvalid selection, Try again...");
                    break;
            }
        }
        else if (this.choiceLevel == 4) { // attack Menu
            switch (choice) {
                case "S":
                    System.out.println("\nSingle Shot called, returning to Combat menu");
                    choiceLevel = 2;
                    this.display();
                    break;
                case "F":
                    System.out.println("\nFire At Will called, returning to Combat menu");
                    choiceLevel = 2;
                    this.display();
                    //this.attackView();
                    break;
                case "B":
                    System.out.println("\nBroadside called, returning to Combat menu");
                    choiceLevel = 2;
                    this.display();
                    //this.runAwayView();
                    break;
                default:
                    System.out.println("\nInvalid selection, Try again...");
                    break;
            }
        }
        else if (this.choiceLevel == 5) { // runaway Menu
            switch (choice) {
                case "C":
                    choiceLevel = 2;
                    this.CoveView();
                    break;
                case "P":
                    choiceLevel = 6;
                    this.attackView();
                    break;
                case "D":
                    System.out.println("\nDon't Run Away called, returning to Combat menu");
                    choiceLevel = 2;
                    this.display();
                    break;
                default:
                    System.out.println("\nInvalid selection, Try again...");
                    break;
            }
        }
        else if (this.choiceLevel == 6) { // runToPort Menu
            switch (choice) {
                case "L":
                    choiceLevel = 2;
                    this.CoveView();
                    break;
                case "P":
                    choiceLevel = 2;
                    this.attackView();
                    break;
                case "D":
                    System.out.println("\nDon't Run Away called, returning to Combat menu");
                    choiceLevel = 2;
                    this.display();
                    break;
                default:
                    System.out.println("\nInvalid selection, dropping to main combat menu");
                    choiceLevel = 2;
                    break;
            }
        }
        else {
            System.out.println("\nInvalid selection, Try again..."
                    + "\nNot supposed to be here");
            choiceLevel = 2;
        }
            
        return false;
    }

    private void commView() {
        System.out.println("*** commView function called ***");
    }

    private void attackView() {
        System.out.println("*** attackView function called ***");
    }

    private void runAwayView() {
        System.out.println("*** runAwayView function called ***");
    }
    
    private void CoveView() {
        System.out.println("*** CoveView function called ***");
    }

    private void runToPortView() {
        System.out.println("*** runToPortView function called ***");
    }
}
