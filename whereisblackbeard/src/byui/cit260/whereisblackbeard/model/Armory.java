/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.model;

import java.util.Objects;

/**
 *
 * @author josephclark
 */
public class Armory {
    
    private int cannonBallsForSale;
    private int handWeaponsLevel;
    private String handWeaponsName;

    public Armory() {
    }
    

    public int getCannonBallsForSale() {
        return cannonBallsForSale;
    }

    public void setCannonBallsForSale(int cannonBallsForSale) {
        this.cannonBallsForSale = cannonBallsForSale;
    }

    public int getHandWeaponsLevel() {
        return handWeaponsLevel;
    }

    public void setHandWeaponsLevel(int handWeaponsLevel) {
        this.handWeaponsLevel = handWeaponsLevel;
    }

    public String getHandWeaponsName() {
        return handWeaponsName;
    }

    public void setHandWeaponsName(String handWeaponsName) {
        this.handWeaponsName = handWeaponsName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.cannonBallsForSale;
        hash = 97 * hash + this.handWeaponsLevel;
        hash = 97 * hash + Objects.hashCode(this.handWeaponsName);
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
        final Armory other = (Armory) obj;
        if (this.cannonBallsForSale != other.cannonBallsForSale) {
            return false;
        }
        if (this.handWeaponsLevel != other.handWeaponsLevel) {
            return false;
        }
        if (!Objects.equals(this.handWeaponsName, other.handWeaponsName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Armory{" + "cannonBallsForSale=" + cannonBallsForSale + ", handWeaponsLevel=" + handWeaponsLevel + ", handWeaponsName=" + handWeaponsName + '}';
    }
      
}
