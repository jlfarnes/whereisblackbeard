/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;

import byui.cit260.whereisblackbeard.model.GroceryItem;
import java.util.ArrayList;

/**
 *
 * @author jlfarnes
 */
public class FoodView extends View {
    
    
    
    public FoodView() {
            super("\n"
                  + "\n----------------------------------------"
                  + "\n | How much Food?                            |"
                  + "\n----------------------------------------"
                  + "\nS - 1 Single ration"
                  + "\nB - a Box of 5 rations"
                  + "\nC - a Crate of 20 rations"
                  + "\n----------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "S": // create and start a new game
                this.singleRat();
                break;
            case "B": // load and existing game
                this.boxRat();
                break;
            case "C": // display the help menu
                this.crateRat();
                break;
            default:
                System.out.println("\n*** Invalid selction ** Try again");
                break;
        }
        
        return false;
    }
    
    private ArrayList<GroceryItem> saleArray() {
        ArrayList<GroceryItem> groceryItems = new ArrayList<>();
        groceryItems.add(new GroceryItem("Single","One Ration",1));
        groceryItems.add(new GroceryItem("Box","Five Rations in a Box",5));
        groceryItems.add(new GroceryItem("Crate","Twenty Rations in a Crate",20));
        
        return groceryItems;
    }
    
    private void sellAmount(ArrayList<GroceryItem> gList, int type, int amt) {
        System.out.println("\n*** sellAmount called");
        
        int i = 0;
        int listLength = gList.size();
        
        for (GroceryItem item : gList ) {
            
            boolean test = (type = gList[i]);
            
            if (test = true) {
                int invFood = amt;
                
            }
            i++;
        }
    }
    
    private void singleRat() {
        System.out.println("\n*** singleRat called");
    }
    
    private void boxRat() {
        System.out.println("\n*** boxRat called");
    }
    
    private void crateRat() {
        System.out.println("\n*** crateRat called");
    }
}
