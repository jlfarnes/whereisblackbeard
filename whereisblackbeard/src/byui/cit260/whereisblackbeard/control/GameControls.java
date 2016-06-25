/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.control;

import byui.cit260.whereisblackbeard.model.Game;
import byui.cit260.whereisblackbeard.model.Location;
import byui.cit260.whereisblackbeard.model.Map;
import byui.cit260.whereisblackbeard.model.Player;
import byui.cit260.whereisblackbeard.model.Scene;
import byui.cit260.whereisblackbeard.model.Ship;
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
        player.playerName = name;
        
        Whereisblackbeard.setPlayer(player); //save the player
        
        return player;
    }
    
    // Draw Controls at bottom

    public static void createNewGame(Player player) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        // System.out.println("createNewGame called");
        Game game = new Game();
        Whereisblackbeard.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Ship ship = new Ship();
        game.setShip(ship);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.movePlayerToStartingLocation(map);
    }

    static void assignScenesToLocation(Map map, Scene[] scenes) {
       Location[][] locations = map.getLocations();
       
       locations[0][0].setScene(scenes[ScenePicture.start.ordinal()]);
       locations[0][1].setScene(scenes[ScenePicture.cove.ordinal()]);
       locations[0][2].setScene(scenes[ScenePicture.port.ordinal()]);
       locations[0][3].setScene(scenes[ScenePicture.store.ordinal()]);
       locations[0][4].setScene(scenes[ScenePicture.combat.ordinal()]);
       
       locations[1][0].setScene(scenes[ScenePicture.ship.ordinal()]);
       locations[1][1].setScene(scenes[ScenePicture.jobs.ordinal()]);
       locations[1][2].setScene(scenes[ScenePicture.finish.ordinal()]);
    }
}
