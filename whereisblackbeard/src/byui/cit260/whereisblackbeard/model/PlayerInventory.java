/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jlfarnes
 */
public class PlayerInventory implements Serializable {
    private int weaponLevel;
    private int goldCount;
    private String accessories;

    public PlayerInventory(int weaponLevel, int goldCount, String accessories) {
        this.weaponLevel = weaponLevel;
        this.goldCount = goldCount;
        this.accessories = accessories;
    }

    public PlayerInventory() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public int getWeaponLevel() {
        return weaponLevel;
    }

    public void setWeaponLevel(int weaponLevel) {
        this.weaponLevel = weaponLevel;
    }

    public int getGoldCount() {
        return goldCount;
    }

    public void setGoldCount(int goldCount) {
        this.goldCount = goldCount;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.weaponLevel;
        hash = 59 * hash + this.goldCount;
        hash = 59 * hash + Objects.hashCode(this.accessories);
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
        final PlayerInventory other = (PlayerInventory) obj;
        if (this.weaponLevel != other.weaponLevel) {
            return false;
        }
        if (this.goldCount != other.goldCount) {
            return false;
        }
        if (!Objects.equals(this.accessories, other.accessories)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PlayerInventory{" + "weaponLevel=" + weaponLevel + ", goldCount=" + goldCount + ", accessories=" + accessories + '}';
    }

    
    
}
