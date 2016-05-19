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
public class DryDock implements Serializable {
    
    private int randShips;
    private int repairShip;
    private int makeSail;

    public DryDock() {
    }
    
    

    public int getRandShips() {
        return randShips;
    }

    public void setRandShips(int randShips) {
        this.randShips = randShips;
    }

    public int getRepairShip() {
        return repairShip;
    }

    public void setRepairShip(int repairShip) {
        this.repairShip = repairShip;
    }

    public int getMakeSail() {
        return makeSail;
    }

    public void setMakeSail(int makeSail) {
        this.makeSail = makeSail;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.randShips;
        hash = 79 * hash + this.repairShip;
        hash = 79 * hash + this.makeSail;
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
        final DryDock other = (DryDock) obj;
        if (this.randShips != other.randShips) {
            return false;
        }
        if (this.repairShip != other.repairShip) {
            return false;
        }
        if (this.makeSail != other.makeSail) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "DryDock{" + "randShips=" + randShips + ", repairShip=" + repairShip + ", makeSail=" + makeSail + '}';
    }
      
}
