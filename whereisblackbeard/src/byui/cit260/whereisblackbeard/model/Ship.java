/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.model;

import java.util.Objects;

/**
 *
 * @author 8440p
 */
public class Ship {
    
    private String description;
    private int hullHealth;
    private int sailSize;
    private int crewCapacity;
    private int shipSize;

    public Ship(String description, int hullHealth, int sailSize, int crewCapacity, int shipSize) {
        this.description = description;
        this.hullHealth = hullHealth;
        this.sailSize = sailSize;
        this.crewCapacity = crewCapacity;
        this.shipSize = shipSize;
    }

    public Ship() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHullHealth() {
        return hullHealth;
    }

    public void setHullHealth(int hullHealth) {
        this.hullHealth = hullHealth;
    }

    public int getSailSize() {
        return sailSize;
    }

    public void setSailSize(int sailSize) {
        this.sailSize = sailSize;
    }

    public int getCrewCapacity() {
        return crewCapacity;
    }

    public void setCrewCapacity(int crewCapacity) {
        this.crewCapacity = crewCapacity;
    }

    public int getShipSize() {
        return shipSize;
    }

    public void setShipSize(int shipSize) {
        this.shipSize = shipSize;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + this.hullHealth;
        hash = 97 * hash + this.sailSize;
        hash = 97 * hash + this.crewCapacity;
        hash = 97 * hash + this.shipSize;
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
        final Ship other = (Ship) obj;
        if (this.hullHealth != other.hullHealth) {
            return false;
        }
        if (this.sailSize != other.sailSize) {
            return false;
        }
        if (this.crewCapacity != other.crewCapacity) {
            return false;
        }
        if (this.shipSize != other.shipSize) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ship{" + "description=" + description + ", hullHealth=" + hullHealth + ", sailSize=" + sailSize + ", crewCapacity=" + crewCapacity + ", shipSize=" + shipSize + '}';
    }
    
    
    
}
