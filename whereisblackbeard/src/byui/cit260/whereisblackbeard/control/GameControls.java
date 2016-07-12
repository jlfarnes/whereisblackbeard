/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.control;

import byui.cit260.whereisblackbeard.exceptions.GameControlsExceptions;
import byui.cit260.whereisblackbeard.exceptions.MapControlExceptions;
import byui.cit260.whereisblackbeard.model.Game;
import byui.cit260.whereisblackbeard.model.Location;
import byui.cit260.whereisblackbeard.model.Map;
import byui.cit260.whereisblackbeard.model.Player;
import byui.cit260.whereisblackbeard.model.Scene;
import byui.cit260.whereisblackbeard.model.Ship;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import whereisblackbeard.Whereisblackbeard;

/**
 *
 * @author josephclark
 */
public class GameControls {

    public static Player createPlayer(String name) {
        //this.console.println("\n*** createPlayer() function called ***");
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

    public static void createNewGame(Player player) throws MapControlExceptions {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        // this.console.println("createNewGame called");
        Game game = new Game();
        Whereisblackbeard.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Ship ship = new Ship();
        game.setShip(ship);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.movePlayerToStartingLocation(map);
    }
    
    public static void saveGame(Game game, String filepath)
            throws GameControlsExceptions {
        
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        }
        catch(Exception e) {
            throw new GameControlsExceptions(e.getMessage());
        }
    }
    
    public static void getExistingGame(String filepath)
            throws GameControlsExceptions {
        
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }
        catch(Exception e) {
            throw new GameControlsExceptions(e.getMessage());
        }
        
        Whereisblackbeard.setCurrentGame(game);
    }

    static void assignScenesToLocation(Map map, Scene[] scenes) {
       Location[][] locations = map.getLocations();
       
       locations[0][0].setScene(scenes[ScenePicture.startingCove.ordinal()]);
       locations[0][1].setScene(scenes[ScenePicture.liverpool.ordinal()]);
       locations[0][2].setScene(scenes[ScenePicture.london.ordinal()]);
       locations[0][3].setScene(scenes[ScenePicture.paris.ordinal()]);
       locations[0][4].setScene(scenes[ScenePicture.lisbon.ordinal()]);
       
       locations[1][0].setScene(scenes[ScenePicture.madrid.ordinal()]);
       locations[1][1].setScene(scenes[ScenePicture.monaco.ordinal()]);
       locations[1][2].setScene(scenes[ScenePicture.canaryIslands.ordinal()]);
       locations[1][3].setScene(scenes[ScenePicture.ivoryCoast.ordinal()]);
       locations[1][4].setScene(scenes[ScenePicture.goldCoast.ordinal()]);
       
       locations[2][0].setScene(scenes[ScenePicture.bahamas.ordinal()]);
       locations[2][1].setScene(scenes[ScenePicture.nassau.ordinal()]);
       locations[2][2].setScene(scenes[ScenePicture.freeport.ordinal()]);
       locations[2][3].setScene(scenes[ScenePicture.antigua.ordinal()]);
       locations[2][4].setScene(scenes[ScenePicture.caymanIslands.ordinal()]);
       
       locations[3][0].setScene(scenes[ScenePicture.cuba.ordinal()]);
       locations[3][1].setScene(scenes[ScenePicture.haiti.ordinal()]);
       locations[3][2].setScene(scenes[ScenePicture.quixotle.ordinal()]);
       locations[3][3].setScene(scenes[ScenePicture.guadalajara.ordinal()]);
       locations[3][4].setScene(scenes[ScenePicture.floridaKeys.ordinal()]);
       
       locations[4][0].setScene(scenes[ScenePicture.newYork.ordinal()]);
       locations[4][1].setScene(scenes[ScenePicture.alexandra.ordinal()]);
       locations[4][2].setScene(scenes[ScenePicture.baltimore.ordinal()]);
       locations[4][3].setScene(scenes[ScenePicture.columbus.ordinal()]);
       locations[4][4].setScene(scenes[ScenePicture.plymouth.ordinal()]);
    }
}
