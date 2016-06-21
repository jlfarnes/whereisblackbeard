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
 * @author 8440p
 */
public enum Location implements Serializable {
    
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
    
    
    // private int visited;
    // private int challengeSolved;
    // private int attribute;
    private final String description;
    private final Point coordinates;

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
    
    

    public String getDescription() {
        return description;
    }

//    public void setDescription(String description) {
//        this.description = description;
//    }

    public Point getCoordinates() {
        return coordinates;
    }

//    public void setCoordinates(Point coordinates) {
//        this.coordinates = coordinates;
//    }
//    public int getVisited() {
//        return visited;
//    }
//
//    public void setVisited(int visited) {
//        this.visited = visited;
//    }

//    public int getChallengeSolved() {
//        return challengeSolved;
//    }

//    public void setChallengeSolved(int challengeSolved) {
//        this.challengeSolved = challengeSolved;
//    }

//    public int getAttribute() {
//        return attribute;
//    }
//
//    public void setAttribute(int attribute) {
//        this.attribute = attribute;
//    }

//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 37 * hash + this.visited;
//        hash = 37 * hash + this.description;
//        hash = 37 * hash + this.coordinates;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Location other = (Location) obj;
//        if (this.visited != other.visited) {
//            return false;
//        }
//        if (this.challengeSolved != other.challengeSolved) {
//            return false;
//        }
//        if (this.attribute != other.attribute) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return "Location { description=" + description + ", coordinates=" + coordinates + '}';
    }
    
    
    
}
