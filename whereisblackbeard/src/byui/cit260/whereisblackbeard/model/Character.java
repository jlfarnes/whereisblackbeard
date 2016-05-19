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
public class Character implements Serializable {
    
    private String pcType;
    private int pcDiplo;
    private int pcCun;
    private int pcStr;
    private int pcBonus;

    public Character() {
    }
    

    public String getPcType() {
        return pcType;
    }

    public void setPcType(String pcType) {
        this.pcType = pcType;
    }

    public int getPcDiplo() {
        return pcDiplo;
    }

    public void setPcDiplo(int pcDiplo) {
        this.pcDiplo = pcDiplo;
    }

    public int getPcCun() {
        return pcCun;
    }

    public void setPcCun(int pcCun) {
        this.pcCun = pcCun;
    }

    public int getPcStr() {
        return pcStr;
    }

    public void setPcStr(int pcStr) {
        this.pcStr = pcStr;
    }

    public int getPcBonus() {
        return pcBonus;
    }

    public void setPcBonus(int pcBonus) {
        this.pcBonus = pcBonus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.pcType);
        hash = 67 * hash + this.pcDiplo;
        hash = 67 * hash + this.pcCun;
        hash = 67 * hash + this.pcStr;
        hash = 67 * hash + this.pcBonus;
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
        final Character other = (Character) obj;
        if (this.pcDiplo != other.pcDiplo) {
            return false;
        }
        if (this.pcCun != other.pcCun) {
            return false;
        }
        if (this.pcStr != other.pcStr) {
            return false;
        }
        if (this.pcBonus != other.pcBonus) {
            return false;
        }
        if (!Objects.equals(this.pcType, other.pcType)) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "Character{" + "pcType=" + pcType + ", pcDiplo=" + pcDiplo + ", pcCun=" + pcCun + ", pcStr=" + pcStr + ", pcBonus=" + pcBonus + '}';
    }
      
}
