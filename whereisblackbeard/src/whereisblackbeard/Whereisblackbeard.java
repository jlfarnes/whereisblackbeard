/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whereisblackbeard;

import byui.cit260.whereisblackbeard.model.Armory;
import byui.cit260.whereisblackbeard.model.Player;
import byui.cit260.whereisblackbeard.model.Scene;
import byui.cit260.whereisblackbeard.model.Character;
import byui.cit260.whereisblackbeard.model.DryDock;
import byui.cit260.whereisblackbeard.model.JobsBoard;
import byui.cit260.whereisblackbeard.model.Market;

/**
 *
 * @author 8440p
 */
public class Whereisblackbeard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Author: Joseph Clark
        Player playerOne = new Player();
        
        playerOne.setPlayerName("Player 1");
        playerOne.setPlayerChar("John");
        playerOne.setPlayerBonus(5);
        playerOne.setPlayerDiplomacy(5);
        playerOne.setPlayerCunning(5);
        playerOne.setPlayerStrength(5);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        // Author: Joseph Clark
        Scene sceneOne = new Scene();
        
        sceneOne.setLocType("Scene 1");
        sceneOne.setLocLockLevel(10);
        sceneOne.setPlayerUnlockLevel(10);
        sceneOne.setSceneType("Type");
        
        String sceneInfo = sceneOne.toString();
        System.out.println(playerInfo);
        
        
        // Author: Joseph Clark
        Character characterOne = new Character();
        
        characterOne.setPcType("Character 1");
        characterOne.setPcDiplo(5);
        characterOne.setPcCun(5);
        characterOne.setPcStr(5);
        characterOne.setPcBonus(5);
        
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
        
        
        // Author: Joseph Clark
        DryDock dryDockOne = new DryDock();
        
        dryDockOne.setRandShips(5);
        dryDockOne.setRepairShip(5);
        dryDockOne.setMakeSail(5);
        
        String dryDockInfo = dryDockOne.toString();
        System.out.println(dryDockInfo);
        
        
        // Author: Joseph Clark
        JobsBoard jobsBoardOne = new JobsBoard();
        
        jobsBoardOne.setRandJobs(5);
        jobsBoardOne.setGoToJobScene(5);
        
        String jobsBoardInfo = jobsBoardOne.toString();
        System.out.println(jobsBoardInfo);
        
        
        // Author: Joseph Clark
        Market marketOne = new Market();
        
        marketOne.setFoodForSale("Food");
        marketOne.setWaterForSale("Water");
        marketOne.setClothForSale("Cloth");
        marketOne.setAccessories("Accessories");
        
        String marketInfo = marketOne.toString();
        System.out.println(marketInfo);
        
        
        // Author: Joseph Clark
        Armory armoryOne = new Armory();
        
        armoryOne.setCannonBallsForSale(5);
        armoryOne.setHandWeaponsLevel(5);
        armoryOne.setHandWeaponsName("Weapons");
        
        String armoryInfo = armoryOne.toString();
        System.out.println(armoryInfo);
    }
        
}
