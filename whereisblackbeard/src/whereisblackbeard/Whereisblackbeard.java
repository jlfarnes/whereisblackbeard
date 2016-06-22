/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whereisblackbeard;

import byui.cit260.whereisblackbeard.model.Armory;          // Author: Joseph Clark
import byui.cit260.whereisblackbeard.model.Character;       // Author: Joseph Clark
import byui.cit260.whereisblackbeard.model.DryDock;         // Author: Joseph Clark
import byui.cit260.whereisblackbeard.model.JobsBoard;       // Author: Joseph Clark
import byui.cit260.whereisblackbeard.model.Location;        // Author: Jacob Farnes
import byui.cit260.whereisblackbeard.model.Map;             // Author: Jacob Farnes
import byui.cit260.whereisblackbeard.model.Market;          // Author: Joseph Clark
import byui.cit260.whereisblackbeard.model.Player;          // Author: Jacob Farnes & Joseph Clark
import byui.cit260.whereisblackbeard.model.PlayerInventory; // Author: Jacob Farnes
import byui.cit260.whereisblackbeard.model.Scene;           // Author: Jacob Farnes
import byui.cit260.whereisblackbeard.model.Ship;            // Author: Jacob Farnes
import byui.cit260.whereisblackbeard.model.ShipInventory;   // Author: Jacob Farnes
import citbyui.cit260.whereisblackbeard.view.StartProgramView;
import citbyui.cit260.whereisblackbeard.view.MainMenuView;
import citbyui.cit260.whereisblackbeard.view.GameMenuView;
import citbyui.cit260.whereisblackbeard.view.HelpMenuView;
import citbyui.cit260.whereisblackbeard.view.PortView;
import citbyui.cit260.whereisblackbeard.view.TestMenu;

/**
 *fred
 * 
 * @author 8440p
 */
public class Whereisblackbeard {

    /**
     * @param args the command line arguments
     */
    
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Whereisblackbeard.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Whereisblackbeard.player = player;
    }
    
    
    public static void main(String[] args) {
        
        // start the program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
        /*
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
        System.out.println(sceneInfo); // jlfarnes: fixed from playerInfo to sceneInfo
        
        
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
        
        
        // Author: Jacob Farnes
        Location locOne = new Location();
        
        locOne.setVisited(1);
        locOne.setChallengeSolved(2);
        locOne.setAttribute(9);
        
        String locInfo = locOne.toString();
        System.out.println(locInfo);
        
        // Author: Jacob Farnes
        Map mapOne = new Map();
        
        mapOne.setLocName("Deadman's Cove");
        mapOne.setRows(3);
        mapOne.setCols(3);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);

        // Author: Jacob Farnes
        PlayerInventory playerInvOne = new PlayerInventory();
        
        playerInvOne.setWeaponLevel(1);
        playerInvOne.setGoldCount(125);
        playerInvOne.setAccessories("none");
        
        String playerInvInfo = playerInvOne.toString();
        System.out.println(playerInvInfo);
        
        // Author: Jacob Farnes
        Ship shipOne = new Ship();
        
        shipOne.setDescription("Santa Maria");
        shipOne.setHullHealth(1000);
        shipOne.setSailSize(100);
        shipOne.setCrewCapacity(5);
        shipOne.setShipSize(500);
        
        String shipInfo = shipOne.toString();
        System.out.println(shipInfo);
        
        // Author: Jacob Farnes
        ShipInventory shipInvOne = new ShipInventory();
        
        shipInvOne.setCannonBalls(5);
        shipInvOne.setWaterGallons(12);
        shipInvOne.setFoodUnits(35);
        
        String shipInvInfo = shipInvOne.toString();
        System.out.println(shipInvInfo);
        */
    }
        
}
