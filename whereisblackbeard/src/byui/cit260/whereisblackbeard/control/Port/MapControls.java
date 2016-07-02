///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package byui.cit260.whereisblackbeard.control.Port;
////import byui.cit260.whereisblackbeard.exceptions.MapControlExceptions;
//
//import byui.cit260.whereisblackbeard.model.Map;
//
//
///**
// *
// * @author josephclark
// */
//public class MapControls {
//    
//    // Check map rows and columns
//    // If not then return the marker to 3-3
//    
//    // Draw map in scene window
//    // Draw the cursor position
//    // Draw the name of the location
//    // Calculate how long and how many resources are needed
//    // Display trip time and resources needed to make journey
//    
//    // Ask player if they want to make the journey to cursor location
//    // If no then ask player for location input then go to draw map
//    
//    // Call go to map position operation
//    
//   /* public static void moveActorsToStartingLocation(Map map) {
//        Actor[] actors = Actor.values();
//        
//        for (Actor actor : actors) {
//            Point coordinates = actor.getCoordinates();
//            MapControls.moveActorToLocation(actor, coordinates);
//        }
//    }
//    public static void moveActorToLocation(Actor actor, Point coordinates) throws MapControlException {
//        Map map = Whereisblackbeard.getCurrentGame().getMap();
//        int newRow = coordinates.x-1;
//        int newColumn = coordinates.y-1;
//        
//        if (newRow < 0 || newRow >= map.getNoOfRows() || newColumn < 0 || newColumn >= map.getNoOfColumns() ) {
//            throw new MapControlException("Can not move actor to location " 
//                                        + coordinates.x + ", " + coordinates.y 
//                                        + " because that location is outside the bounds of the map.");
//        }
//    } */
//    
//    public static void movePlayerToStartingLocation(Map map) {
//        // movePlayer(map, 2, 2);
//        movePlayer(map, 0, 0);
//    }
//
//    public static void movePlayer(Map map, int row, int column) {
//        map.setCurrentLocation(map.getLocations()[row][column]);
//        map.getCurrentLocation().setVisited(true);
//
//        map.setCurrentRow(row);
//        map.setCurrentColumn(column);
//
//    }
//    
//    @Override
//    public boolean doAction(String choice) {
//        Actor actor = null;
//        
//        try {
//        MapControl.moveActorToLocation(actor, coordinates);
//        } catch (MapControlException me) {
//            System.out.println(me.getMessage());
//        }
//        return false;
//    }
//    
//    
//    
//}
