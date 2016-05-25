/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.control.Port;

import java.util.Random;
/**
 *
 * @author josephclark
 */
public class JobsBoardControls {
    
    // Go to jobs board scene
    // Draw job board scene
    
    // Capture any key from keyboard
    
    // Randomly generate a job
    private void getRandJob() {
        
        int waitTime = calcWaitTime();
	int pay = calcPay();
        // 
	// wait(waitTime)
        
	// Print “Done for the Day”
	// Print “You were paid”, pay, “gold for your efforts”
	payPlayer(pay);
    }
    // int from job is equal to pay amount
    // Calc random wait time
    private int calcPay() {
        int minSec = 1;
        int maxSec = 9;
        int waitTime = calcRandNum(minSec,maxSec);
        return waitTime;
    }
      
    // Calc random wait time
    private int calcWaitTime() {
        int minSec = 15;
        int maxSec = 120;
        int waitTime = calcRandNum(minSec,maxSec);
        return waitTime;
    }
    
    // Pay player
    private void payPlayer(int pay) {
        byui.cit260.whereisblackbeard.model.PlayerInventory.goldCount = byui.cit260.whereisblackbeard.model.PlayerInventory.goldCount + pay;
    }
    
    // Exit to market/port scene
    
    // required functions
    public static int calcRandNum(int minNum, int maxNum) {
        
        int numRand = -1;
        Random rand = new Random();
        numRand = minNum + (int)(Math.random() * ((maxNum - minNum) + 1));
        
        return numRand;
    };
}
