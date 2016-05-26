/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.control.Scene;
// import java.io.Serializable;
// import byui.cit260.whereisblackbeard.model.PlayerInventory;
// import byui.cit260.whereisblackbeard.model.Market;

//vars


/**
 *
 * @author josephclark
 */
public class PortControls {
    
    // vars
    
    // Move to Map Controls where it belongs
    String locName = "broken";
    public static int location = 0;
    
    int goldRequired = 0;
    // int playerGold;
    static int playerGold = byui.cit260.whereisblackbeard.model.PlayerInventory.goldCount;
    
    
    // Draw town scene
    
    // Ask player if they want to go to the market, armory, jobs board or dry dock
    
    //
    // Needed functions
    //
    
    // getPortName
    public String getPortName(int location) {
        switch (location) {
            case 0: locName = "Starting Cove";
                break;
            case 1: locName = "Liverpool";
                break;
            case 2: locName = "London";
                break;
            case 3: locName = "Paris";
                break;
            case 4: locName = "Lisbon";
                break;
            case 5: locName = "Madrid";
                break;
                // Africa
            case 6: locName = "Monaco";
                break;
            case 7: locName = "Canary Islands";
                break;
            case 8: locName = "Ivory Coast";
                break;
            case 9: locName = "Gold Coast";
                break;
            case 10: locName = "Ivory Coast";
                break;
                // The Carribean
            case 11: locName = "The Bahamas";
                break;
            case 12: locName = "Nassau";
                break;
            case 13: locName = "Freeport";
                break;
            case 14: locName = "Antigua";
                break;
            case 15: locName = "Cayman Islands";
                break;
                // Latin America
            case 16: locName = "Cuba";
                break;
            case 17: locName = "Hati";
                break;
            case 18: locName = "Quixotle";
                break;
            case 19: locName = "Guadalahara";
                break;
            case 20: locName = "Florida Keys";
                break;
            default: 
                location = 0;
                locName = "Starting Cove";
                break;
        };
        return locName;
    };
    
    // getMinusGold
    public int getMinusGold(int playerGold, int goldRequired) {
        
        if ( ( (playerGold >= 0) == (playerGold <= 1000) ) == ( (goldRequired >= 0) == (goldRequired <= 100) ) ) {
        
            if (playerGold >= goldRequired) {
		playerGold  = playerGold - goldRequired;
		return playerGold;
                //System.out.println("Pleasure doing business with you!");
                //return 1;
            }
            else if (playerGold < goldRequired) {
                //System.out.println("Your word is no good here...");
		//return 0;
                return -1;
            }
            else {
                return -1;
            }
        }
        return -1;
    }
}

