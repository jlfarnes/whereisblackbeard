/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;

/**
 *
 * @author josephclark
 */
public class MarketView {
    
    public MarketView() {
                super("\n"
                  + "\n----------------------------------------"
                  + "\n | Exploring a Port                           |"
                  + "\n----------------------------------------"
                  + "\nF - Food"
                  + "\nW - Water"
                  + "\nA - Accessories"
                  + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "F": // create and start a new game
                this.foodOptions();
                break;
            case "W": // load and existing game
                this.waterOptions();
                break;
            case "A": // display the help menu
                this.accessoriesOptions();
                break;
            default:
                System.out.println("\n*** Invalid selction ** Try again");
                break;
        }
        
        return false;
    }

    private void foodOptions() {
        System.out.println("*** foodOptions function called ***");
    }

    private void waterOptions() {
        System.out.println("*** waterOptions function called ***");
    }

    private void accessoriesOptions() {
        System.out.println("*** accessoriesOptions function called ***");
    }
    
}
