/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;

/**
 *
 * @author jlfarnes
 */
public class CoveView extends View {
    
    public CoveView() {
        super("\n"
                  + "\n----------------------------------------"
                  + "\n | Starting Cove"
                  + "\n----------------------------------------"
                  + "\nR - Current Resources"
                  + "\nN - Now What?"
                  + "\n"
                  + "\nG - Go somewhere else"
                  + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //this.console.println("\nImplement CoveView");
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
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid selection, Try again...");
                break;
        }
        
        return true;
    }

    private void displayInventory() {
        //this.console.println("*** displayInventory function called ***");
        InventoryMenuView invMenu = new InventoryMenuView();
        invMenu.display();
    }
    
    private void displayTask() {
               
        //this.console.println("*** displayTask function called ***");
        this.console.println("Go sail your skiff to a Port...");
    }
    
    private void displayPortTravelMenu() {
                
        //this.console.println("*** displayPortTravelMenu function called ***");
        
        PortView port = new PortView();
        port.display();
    }
    
}
