/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.model;

import static byui.cit260.whereisblackbeard.control.Scene.PortControls.location;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author 8440p
 */
public class Map implements Serializable {
    
    private String locName;
    
    private Location[][] location;
    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;

    public Map(String locName, int rows, int cols) {
        this.locName = locName;
    }

    public Map() {
    }

    public Map(int noOfRows, int noOfColumns) {
        
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        this.location = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
            for (int column = 0; column < noOfColumns; column++) {
                
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                locations[row][column] = location;
            }
        }
    }
    
    

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public Location[][] getLocation() {
        return location;
    }

    public void setLocation(Location[][] location) {
        this.location = location;
    }

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.locName);
        hash = 97 * hash + this.noOfRows;
        hash = 97 * hash + this.noOfColumns;
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
        if (this.noOfRows != other.noOfRows) {
            return false;
        }
        if (this.noOfColumns != other.noOfColumns) {
            return false;
        }
        if (!Objects.equals(this.locName, other.locName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "locName=" + locName + ", rows=" + noOfRows + ", cols=" + noOfColumns + '}';
    }
    
    
    
}
