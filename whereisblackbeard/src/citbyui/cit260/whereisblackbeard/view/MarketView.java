/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;
//package byui.cit260.whereisblackbeard.control.Port.MarketControls;

/**
 *
 * @author josephclark
 */
public class MarketView extends View {
    
    public MarketView() {
                super("\n"
                  + "\n----------------------------------------"
                  + "\n | Market                           |"
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
        
        int invFood = 1;
        int marketFood = 2;
        
        //setFoodUnit(invFood,marketFood);
        int total = (invFood + marketFood);
        //return total;
        System.out.println("\n Food = " + total);
    }

    private void waterOptions() {
        System.out.println("*** waterOptions function called ***");
        
        int invWater= 2;
        int marketWater = 3;
        
        //setWaterGallons(invWater,marketWater);
        int total = (invWater + marketWater);
        //return total;
        System.out.println("\n Water = " + total);
    }

    private void accessoriesOptions() {
        System.out.println("*** accessoriesOptions function called ***");
    }
    
}
