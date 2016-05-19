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
 * @author 8440p
 */
public class Map implements Serializable {
    
    private String locName;
    private int rows;
    private int cols;

    public Map(String locName, int rows, int cols) {
        this.locName = locName;
        this.rows = rows;
        this.cols = cols;
    }

    public Map() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.locName);
        hash = 97 * hash + this.rows;
        hash = 97 * hash + this.cols;
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
        final Map other = (Map) obj;
        if (this.rows != other.rows) {
            return false;
        }
        if (this.cols != other.cols) {
            return false;
        }
        if (!Objects.equals(this.locName, other.locName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "locName=" + locName + ", rows=" + rows + ", cols=" + cols + '}';
    }
    
    
    
}
