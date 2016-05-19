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
public class Player implements Serializable {
    
    private String playerName ;
    private String playerChar;
    private int playerBonus;
    private int playerDiplomacy;
    private int playerCunning;
    private int playerStrength;

    public Player() {
    }
    
    

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerChar() {
        return playerChar;
    }

    public void setPlayerChar(String playerChar) {
        this.playerChar = playerChar;
    }

    public int getPlayerBonus() {
        return playerBonus;
    }

    public void setPlayerBonus(int playerBonus) {
        this.playerBonus = playerBonus;
    }

    public int getPlayerDiplomacy() {
        return playerDiplomacy;
    }

    public void setPlayerDiplomacy(int playerDiplomacy) {
        this.playerDiplomacy = playerDiplomacy;
    }

    public int getPlayerCunning() {
        return playerCunning;
    }

    public void setPlayerCunning(int playerCunning) {
        this.playerCunning = playerCunning;
    }

    public int getPlayerStrength() {
        return playerStrength;
    }

    public void setPlayerStrength(int playerStrength) {
        this.playerStrength = playerStrength;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.playerName);
        hash = 71 * hash + Objects.hashCode(this.playerChar);
        hash = 71 * hash + this.playerBonus;
        hash = 71 * hash + this.playerDiplomacy;
        hash = 71 * hash + this.playerCunning;
        hash = 71 * hash + this.playerStrength;
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
        final Player other = (Player) obj;
        if (this.playerBonus != other.playerBonus) {
            return false;
        }
        if (this.playerDiplomacy != other.playerDiplomacy) {
            return false;
        }
        if (this.playerCunning != other.playerCunning) {
            return false;
        }
        if (this.playerStrength != other.playerStrength) {
            return false;
        }
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        if (!Objects.equals(this.playerChar, other.playerChar)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "playerName=" + playerName + ", playerChar=" + playerChar + ", playerBonus=" + playerBonus + ", playerDiplomacy=" + playerDiplomacy + ", playerCunning=" + playerCunning + ", playerStrength=" + playerStrength + '}';
    }
    
}