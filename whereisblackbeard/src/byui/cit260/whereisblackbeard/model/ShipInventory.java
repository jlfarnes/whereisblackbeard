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
public class ShipInventory implements Serializable {
    
    private int cannonBalls;
    private int waterGallons;
    private int foodUnits;

    public ShipInventory(int cannonBalls, int waterGallons, int foodUnits) {
        this.cannonBalls = cannonBalls;
        this.waterGallons = waterGallons;
        this.foodUnits = foodUnits;
    }

    public ShipInventory() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public int getCannonBalls() {
        return cannonBalls;
    }

    public void setCannonBalls(int cannonBalls) {
        this.cannonBalls = cannonBalls;
    }

    public int getWaterGallons() {
        return waterGallons;
    }

    public void setWaterGallons(int waterGallons) {
        this.waterGallons = waterGallons;
    }

    public int getFoodUnits() {
        return foodUnits;
    }

    public void setFoodUnits(int foodUnits) {
        this.foodUnits = foodUnits;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.cannonBalls;
        hash = 29 * hash + this.waterGallons;
        hash = 29 * hash + this.foodUnits;
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
        final ShipInventory other = (ShipInventory) obj;
        if (this.cannonBalls != other.cannonBalls) {
            return false;
        }
        if (this.waterGallons != other.waterGallons) {
            return false;
        }
        if (this.foodUnits != other.foodUnits) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ShipInventory{" + "cannonBalls=" + cannonBalls + ", waterGallons=" + waterGallons + ", foodUnits=" + foodUnits + '}';
    }
    
    
    
}
