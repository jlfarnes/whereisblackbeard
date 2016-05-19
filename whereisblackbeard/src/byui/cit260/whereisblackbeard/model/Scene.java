/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.model;

//import java.io.Serializable;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author josephclark
 */
public class Scene implements Serializable {
    
    private String locType;
    private int locLockLevel;
    private int playerUnlockLevel;
    private String sceneType;

    public Scene() {
    }

    public String getLocType() {
        return locType;
    }

    public void setLocType(String locType) {
        this.locType = locType;
    }

    public int getLocLockLevel() {
        return locLockLevel;
    }

    public void setLocLockLevel(int locLockLevel) {
        this.locLockLevel = locLockLevel;
    }

    public int getPlayerUnlockLevel() {
        return playerUnlockLevel;
    }

    public void setPlayerUnlockLevel(int playerUnlockLevel) {
        this.playerUnlockLevel = playerUnlockLevel;
    }

    public String getSceneType() {
        return sceneType;
    }

    public void setSceneType(String sceneType) {
        this.sceneType = sceneType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.locType);
        hash = 97 * hash + this.locLockLevel;
        hash = 97 * hash + this.playerUnlockLevel;
        hash = 97 * hash + Objects.hashCode(this.sceneType);
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
        final Scene other = (Scene) obj;
        if (this.locLockLevel != other.locLockLevel) {
            return false;
        }
        if (this.playerUnlockLevel != other.playerUnlockLevel) {
            return false;
        }
        if (!Objects.equals(this.locType, other.locType)) {
            return false;
        }
        if (!Objects.equals(this.sceneType, other.sceneType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "locType=" + locType + ", locLockLevel=" + locLockLevel + ", playerUnlockLevel=" + playerUnlockLevel + ", sceneType=" + sceneType + '}';
    }
      
}
