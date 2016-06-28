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
    scene.setDescription("startingCove scene");
    scene.setMapSymbol("ST");
    scenes[ScenePicture.startingCove.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("liverpool scene");
    scene.setMapSymbol("LV");
    scenes[ScenePicture.liverpool.ordinal()] = scene;
        
    scene = new Scene();
    scene.setDescription("london scene");
    scene.setMapSymbol("LD");
    scenes[ScenePicture.london.ordinal()] = scene;
        
    scene = new Scene();
    scene.setDescription("paris scene");
    scene.setMapSymbol("PS");
    scenes[ScenePicture.paris.ordinal()] = scene;
        
    scene = new Scene();
    scene.setDescription("lisbon scene");
    scene.setMapSymbol("LS");
    scenes[ScenePicture.lisbon.ordinal()] = scene;
        
    scene = new Scene();
    scene.setDescription("madrid scene");
    scene.setMapSymbol("MD");
    scenes[ScenePicture.madrid.ordinal()] = scene;
        
    scene = new Scene();
    scene.setDescription("monaco scene");
    scene.setMapSymbol("MN");
    scenes[ScenePicture.monaco.ordinal()] = scene;
        
    scene = new Scene();
    scene.setDescription("canaryIslands scene");
    scene.setMapSymbol("CI");
    scenes[ScenePicture.canaryIslands.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("ivoryCoast scene");
    scene.setMapSymbol("IC");
    scenes[ScenePicture.ivoryCoast.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("goldCoast scene");
    scene.setMapSymbol("GC");
    scenes[ScenePicture.goldCoast.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("bahamas scene");
    scene.setMapSymbol("BM");
    scenes[ScenePicture.bahamas.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("nassau scene");
    scene.setMapSymbol("NS");
    scenes[ScenePicture.nassau.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("freeport scene");
    scene.setMapSymbol("FP");
    scenes[ScenePicture.freeport.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("antigua scene");
    scene.setMapSymbol("AG");
    scenes[ScenePicture.antigua.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("caymanIslands scene");
    scene.setMapSymbol("CY");
    scenes[ScenePicture.caymanIslands.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("cuba scene");
    scene.setMapSymbol("CB");
    scenes[ScenePicture.cuba.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("haiti scene");
    scene.setMapSymbol("HT");
    scenes[ScenePicture.haiti.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("quixotle scene");
    scene.setMapSymbol("QX");
    scenes[ScenePicture.quixotle.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("guadalajara scene");
    scene.setMapSymbol("GJ");
    scenes[ScenePicture.guadalajara.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("floridaKeys scene");
    scene.setMapSymbol("FK");
    scenes[ScenePicture.floridaKeys.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("newYork scene");
    scene.setMapSymbol("NY");
    scenes[ScenePicture.newYork.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("alexandra scene");
    scene.setMapSymbol("AX");
    scenes[ScenePicture.alexandra.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("baltimore scene");
    scene.setMapSymbol("BL");
    scenes[ScenePicture.baltimore.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("columbus scene");
    scene.setMapSymbol("CM");
    scenes[ScenePicture.columbus.ordinal()] = scene;
    
    scene = new Scene();
    scene.setDescription("plymouth scene");
    scene.setMapSymbol("PM");
    scenes[ScenePicture.plymouth.ordinal()] = scene;
    
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
        movePlayer(map, 3, 3);
    }

    public static void movePlayer(Map map, int row, int column) {
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);

        map.setCurrentRow(row);
        map.setCurrentColumn(column);

    }
    
    public static double calcPercentage(int sceneVisited, int totalScenes) {
        
        return ((float)sceneVisited / totalScenes) * 100;
    }
    
}
