/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.control;

import byui.cit260.whereisblackbeard.model.Player;

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
        
        whereisblackbeard.Whereisblackbeard.setPlayer(player); //save the player
        
        return player;
    }
    
    // Draw Controls at bottom
    
}
