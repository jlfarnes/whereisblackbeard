/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whereisblackbeard;

import byui.cit260.whereisblackbeard.model.Player;

/**
 *
 * @author 8440p
 */
public class Whereisblackbeard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerOne = new Player();
        
        playerOne.setPlayerName("Player 1");
        playerOne.setPlayerChar("John");
        playerOne.setPlayerBonus(5);
        playerOne.setPlayerDiplomacy(5);
        playerOne.setPlayerCunning(5);
        playerOne.setPlayerStrength(5);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
