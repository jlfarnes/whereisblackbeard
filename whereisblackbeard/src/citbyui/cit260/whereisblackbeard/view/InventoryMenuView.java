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
public class InventoryMenuView extends View {

    private String inventoryMenu;
    // private String promptMessage;
    
    public InventoryMenuView() {
        super("\n"
                  + "\n----------------------------------------"
                  + "\n | Viewing Inventory and Resources                           |"
                  + "\n----------------------------------------"
                  + "\nC - Current Gold"
                  + "\nF - Food"
                  + "\nW - Water"
                  + "\nA - Cannonballs"
                  + "\n----------------------------------------");
    }
/*
    public void displayInventoryMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String inventoryMenuOption = this.getInventoryMenuOption();
            if (inventoryMenuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(inventoryMenuOption);
        } while (!done);
    }
    
    private String getInventoryMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.inventoryMenu);
            
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
*/
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "C": // create and start a new game
                this.currentGold();
                break;
            case "F": // load and existing game
                this.currentFood();
                break;
            case "W": // display the help menu
                this.currentWater();
                break;
            case "A": // save the current game
                this.currentCannonballs();
                break;
            default:
                System.out.println("\n*** Invalid selction ** Try again");
                break;
        }
        
        return false;
    }

    private void currentGold() {
        System.out.println("*** currentGold function called ***");
    }

    private void currentFood() {
        System.out.println("*** currentFood function called ***");
    }

    private void currentWater() {
        System.out.println("*** currentWater function called ***");
    }

    private void currentCannonballs() {
        System.out.println("*** currentCannonballs function called ***");
    }

    private String getPortOption() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
 
