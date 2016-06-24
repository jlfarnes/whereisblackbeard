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
public class Game implements Serializable {
    
    private boolean defeatBlackbeard = false;
    private double totalTime;
    private boolean locationVisited = false;
    
    private Ship ship;
    private Map map;
    private Player player;
            

    public boolean isDefeatBlackbeard() {
        return defeatBlackbeard;
    }

    public void setDefeatBlackbeard(boolean defeatBlackbeard) {
        this.defeatBlackbeard = defeatBlackbeard;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public boolean isLocationVisited() {
        return locationVisited;
    }

    public void setLocationVisited(boolean locationVisited) {
        this.locationVisited = locationVisited;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    
}
