/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author jlfarnes
 */
public class Location implements Serializable {
    
/*    public enum LocationArray implements Serializable {
        Starting_Cove("(1-1) This is where the player will be when the game starts."),
        Liverpool("1-2"),
        London("1-3"),
        Paris("1-4"),
        Lisbon("1-5"),
        Madrid("2-1"),
        Monaco("2-2"),
        Canary_Islands("2-3"),
        Ivory_Coast("2-4"),
        Gold_Coast("2-5"),
        The_Bahamas("3-1"),
        Nassau("3-2"),
        Freeport("3-3"),
        Antigua("3-4"),
        Cayman_Islands("3-5"),
        Cuba("4-1"),
        Haiti("4-2"),
        Quixotle("4-3"),
        Guadalajara("4-4"),
        Florida_Keys("4-5"),
        New_York("5-1"),
        Alexandra("5-2"),
        Baltimore("5-3"),
        Columbus("5-4"),
        Plymouth("5-5"); 
    */
    
    
        // private int visited;
        // private int challengeSolved;
        // private int attribute;
        private final String description;
        private final Point coordinates;

        private Scene scene;

    //    public Location(int visited, int challengeSolved, int attribute) {
    //        this.visited = visited;
    //        this.challengeSolved = challengeSolved;
    //        this.attribute = attribute;
    //    }

    //    public Location() {
    //    }

    Location(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }
    //}

    Location() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** Location constructor called");
    }
    
    

    public String getDescription() {
        return description;
    }

//    public void setDescription(String description) {
//        this.description = description;
//    }

    public Point getCoordinates() {
        return coordinates;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }


    @Override
    public String toString() {
        return "Location { description=" + description + ", coordinates=" + coordinates + '}';
    }
    
    Location[][] getLocations() {
        Location location01= new Location();
        Location location02= new Location();
        Location location03= new Location();
        Location location04= new Location();
        Location location05= new Location();
        
        Location location06= new Location();
        Location location07= new Location();
        Location location08= new Location();
        Location location09= new Location();
        Location location10= new Location();
        
        Location location11= new Location();
        Location location12= new Location();
        Location location13= new Location();
        Location location14= new Location();
        Location location15= new Location();
        
        Location location16= new Location();
        Location location17= new Location();
        Location location18= new Location();
        Location location19= new Location();
        Location location20= new Location();
        
        Location location21= new Location();
        Location location22= new Location();
        Location location23= new Location();
        Location location24= new Location();
        Location location25= new Location();
        
        // Now name them
        Location[][] locations= new Location[5][5];
        
        locations[0][0]=location01;
        locations[0][1]=location02;
        locations[0][2]=location03;
        locations[0][3]=location04;
        locations[0][4]=location05;
        
        locations[1][0]=location06;
        locations[1][1]=location07;
        locations[1][2]=location08;
        locations[1][3]=location09;
        locations[1][4]=location10;
        
        locations[2][0]=location11;
        locations[2][1]=location12;
        locations[2][2]=location13;
        locations[2][3]=location14;
        locations[2][4]=location15;
        
        locations[3][0]=location16;
        locations[3][1]=location17;
        locations[3][2]=location18;
        locations[3][3]=location19;
        locations[3][4]=location20;
        
        locations[4][0]=location21;
        locations[4][1]=location22;
        locations[4][2]=location23;
        locations[4][3]=location24;
        locations[4][4]=location25;
        
        return locations;
    }

    void setColumn(int column) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** setColumn called");
    }

    void setRow(int row) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** setRow called");
    }

    void setVisited(boolean b) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** setVisited called");
    }
    
    
    
}
