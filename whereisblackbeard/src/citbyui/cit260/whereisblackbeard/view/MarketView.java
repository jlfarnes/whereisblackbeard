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
                  + "\n | Market                               |"
                  + "\n----------------------------------------"
                  + "\nF - Food"
                  + "\nW - Water"
                  + "\nA - Accessories"
                  + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        //MarketControls mc = new MarketControls();
        int int1 = 2;
        int int2 = 3;
        
        switch (choice) {
            case "F": // create and start a new game
                this.foodOptions();
                //mc.setFoodUnit(int1,int2);
                break;
            case "W": // load and existing game
                this.waterOptions();
                //mc.setWaterGallons(int1,int2);
                break;
            case "A": // display the help menu
                this.accessoriesOptions();
                //mc.setAccesories();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selction ** Try again");
                break;
        }
        
        return false;
    }

    private void foodOptions() {
        // this.console.println("*** foodOptions function called ***");
        
        int invFood = 1;
        int marketFood = 2;
        
        //setFoodUnit(invFood,marketFood);
        //int total = (invFood + marketFood);
        //return total;
        //this.console.println("\n Food = " + total);
        
        FoodView fv = new FoodView();
        fv.display();
    }

    private void waterOptions() {
        // this.console.println("*** waterOptions function called ***");
        
        int invWater= 2;
        int marketWater = 3;
        
        //setWaterGallons(invWater,marketWater);
        //int total = (invWater + marketWater);
        //return total;
        //this.console.println("\n Water = " + total);
        
        WaterView wv = new WaterView();
        wv.display();
    }

    private void accessoriesOptions() {
        this.console.println("*** accessoriesOptions function called ***");
    }
    
}
