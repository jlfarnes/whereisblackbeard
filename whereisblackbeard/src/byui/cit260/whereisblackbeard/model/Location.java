/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.model;

import java.io.Serializable;

/**
 *
 * @author 8440p
 */
public class Location implements Serializable {
    
    private int visited;
    private int challengeSolved;
    private int attribute;

    public Location(int visited, int challengeSolved, int attribute) {
        this.visited = visited;
        this.challengeSolved = challengeSolved;
        this.attribute = attribute;
    }

    public Location() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public int getVisited() {
        return visited;
    }

    public void setVisited(int visited) {
        this.visited = visited;
    }

    public int getChallengeSolved() {
        return challengeSolved;
    }

    public void setChallengeSolved(int challengeSolved) {
        this.challengeSolved = challengeSolved;
    }

    public int getAttribute() {
        return attribute;
    }

    public void setAttribute(int attribute) {
        this.attribute = attribute;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.visited;
        hash = 37 * hash + this.challengeSolved;
        hash = 37 * hash + this.attribute;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.visited != other.visited) {
            return false;
        }
        if (this.challengeSolved != other.challengeSolved) {
            return false;
        }
        if (this.attribute != other.attribute) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "visited=" + visited + ", challengeSolved=" + challengeSolved + ", attribute=" + attribute + '}';
    }
    
    
    
}
