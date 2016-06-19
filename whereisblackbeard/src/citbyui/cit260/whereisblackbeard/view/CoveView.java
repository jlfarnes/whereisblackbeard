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
public class CoveView extends View {
    
    public String coveMenu;
    public String coveName = "Starting Cove";
    
    public void displayCoveView() {
        // System.out.println("called displayCoveView");
        
        // Get cove name from elsewhere
        // coveName = inputCoveVarHere;
        
        //
        this.coveMenu = "\n"
                  + "\n----------------------------------------"
                  + "\n | " + coveName
                  + "\n----------------------------------------"
                  + "\nR - Current Resources"
                  + "\nN - Now What?"
                  + "\n"
                  + "\nG - Go somewhere else"
                  + "\n----------------------------------------";
        
         System.out.println(coveMenu);
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String coveOption = this.getCoveOption();
            if (coveOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(coveOption);
        } while (!done);
    }
    
    private String getCoveOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            
            //System.out.println("\n" + this.combatView);
            //
            // Print appropriate menu level
            
            
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
    public boolean doAction(String value) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("\nImplement CoveView");
        value = value.toUpperCase();
        switch (value) {
            case "R":
                this.displayInventory();
                break;
            case "N":
                this.displayTask();
                break;
            case "G":
                this.displayPortTravelMenu();
                break;
            default:
                System.out.println("\nInvalid selection, Try again...");
                break;
        }
        
        return true;
    }

    private void displayInventory() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        //System.out.println("*** displayInventory function called ***");
        InventoryMenuView invMenu = new InventoryMenuView();
        invMenu.displayInventoryMenuView();
    }
    
    private void displayTask() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        //System.out.println("*** displayTask function called ***");
        System.out.println("Go sail your skiff to a Port...");
    }
    
    private void displayPortTravelMenu() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        System.out.println("*** displayPortTravelMenu function called ***");
        //displayInventoryMenuView();
    }
    
}
