/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.model;

//import static byui.cit260.whereisblackbeard.control.Scene.PortControls.location;
import java.io.Serializable;
//import java.util.Objects;

/**
 *
 * @author jlfarnes
 */
public class Map implements Serializable {
    
    private String locName;
    
    //private Location[][] location;
    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;

    public Map(int noOfRows, int noOfColumns) {
        
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
            for (int column = 0; column < noOfColumns; column++) {
                
                Location loc = new Location();
                loc.setColumn(column);
                loc.setRow(row);
                loc.setVisited(false);
                
                locations[row][column] = loc;
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
        return locations;
    }

    public void setLocation(Location[][] location) {
        this.locations = location;
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
    public String toString() {
        return "Map{" + "locName=" + locName + ", rows=" + noOfRows + ", cols=" + noOfColumns + '}';
    }
    
}
