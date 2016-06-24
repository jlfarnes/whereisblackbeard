/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author jlfarnes
 */
public class Location implements Serializable {
    
    
    
    
/*
    public String getDescription() {
        return description;
    }

//    public void setDescription(String description) {
//        this.description = description;
//    }

    public Point getCoordinates() {
        return coordinates;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
*/

    @Override
    public String toString() {
        return "Location { description=" + description + ", coordinates=" + coordinates + '}';
    }

    void setColumn(int column) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** setColumn called");
    }

    void setRow(int row) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** setRow called");
    }

    void setVisited(boolean b) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** setVisited called");
    }
    
    
    
}
