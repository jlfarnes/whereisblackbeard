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

    private static Scene[] createScenes() {
    
    Scene[] scenes = new Scene[ScenePicture.values().length];
    
    Scene scene = new Scene();
    scene.setDescription("start scene");
    scene.setMapSymbol("SS");
    scenes[ScenePicture.start.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("cove scene");
    scene.setMapSymbol("CV");
    scenes[ScenePicture.cove.ordinal()] = scene;
        
    scene = new Scene();
    scene.setDescription("port scene");
    scene.setMapSymbol("PT");
    scenes[ScenePicture.port.ordinal()] = scene;
        
    scene = new Scene();
    scene.setDescription("store scene");
    scene.setMapSymbol("ST");
    scenes[ScenePicture.store.ordinal()] = scene;
        
    scene = new Scene();
    scene.setDescription("combat scene");
    scene.setMapSymbol("CB");
    scenes[ScenePicture.combat.ordinal()] = scene;
        
    scene = new Scene();
    scene.setDescription("ship scene");
    scene.setMapSymbol("SP");
    scenes[ScenePicture.ship.ordinal()] = scene;
        
    scene = new Scene();
    scene.setDescription("jobs scene");
    scene.setMapSymbol("JB");
    scenes[ScenePicture.jobs.ordinal()] = scene;
        
    scene = new Scene();
    scene.setDescription("finish scene");
    scene.setMapSymbol("FN");
    scenes[ScenePicture.finish.ordinal()] = scene;
    
    return scenes;
    
}

    public static Map createMap() {
        Map map = new Map(5, 5);
        
        Scene[] scenes = createScenes();
        
        GameControls.assignScenesToLocation(map, scenes);
        
        return map;
    }
    
    public static void movePlayerToStartingLocation(Map map) {
        movePlayer(map, 1, 1);
        movePlayer(map, 0, 0);
    }

    public static void movePlayer(Map map, int row, int column) {
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);

        map.setCurrentRow(row);
        map.setCurrentColumn(column);

    }
    
}
