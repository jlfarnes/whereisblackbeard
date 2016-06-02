/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.control;

import byui.cit260.whereisblackbeard.model.Player;
import whereisblackbeard.Whereisblackbeard;

/**
 *
 * @author josephclark
 */
public class GameControls {

    public static Player createPlayer(String name) {
        //System.out.println("\n*** createPlayer() function called ***");
        //return new Player();
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        Whereisblackbeard.setPlayer(player); //save the player
        
        return player;
    }
    
    // Draw Controls at bottom

    public static void createNewGame(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
