/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.control;

import byui.cit260.whereisblackbeard.model.Map;
import byui.cit260.whereisblackbeard.model.Scene;

/**
 *
 * @author josephclark
 */
public class MapControl {

    private static Scene createScenes;

    public static Map createMap() {
        Map map = new Map(20, 20);
        
        Scene scenes = createScenes;
        
        GameControls.assignScenesToLocation(map, scenes);
        
        return map;
    }

    public static void movePlayerToStartingLocation(Map map) {
        System.out.println("\n*** movePlayerToStartingLocation() called ***");
    }
    
}
