/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.control.Port;

/**
 *
 * @author josephclark
 */
public class MarketControls {
    
    // Go to market scene
    // Draw market scene
    
    // Ask player for desired upgrade
    // Food, water, ammo and accessories
    
    // Have player select amount desired
    
    // Check gold
    
    // Remove gold if player has enough
    // Send player to job board scene if not enough gold
    
    // Give player upgrade (item)
    
    // Exit
    
    // jlfarnes:
    // Yeah... we're going to skip all that and just put the algorithms in here to be called from the Market view
    
    public int setFoodUnit(int invFood, int marketFood) {
        // this.console.println("\n*** setFoodUnit called");
        
        int total = (invFood + marketFood);
        return total;
    }
    
    public int setWaterGallons(int invWater, int marketWater) {
        // this.console.println("\n*** setWaterGallons called");
        
        int total = (invWater + marketWater);
        return total;
    }
    
    public void setAccesories(int itemNumber) {
        System.out.println("\n*** setAccessories called");
        
        
    }
}
