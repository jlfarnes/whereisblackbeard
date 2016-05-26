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
    public static int waitTime;
    public static int pay;
    // Go to jobs board scene
    // Draw job board scene
    
    // Capture any key from keyboard
    
    // Randomly generate a job
    public static int getRandJob(int maxPay) {
        
        waitTime = calcWaitTime();
	pay = calcPay(maxPay);
        // 
	// wait(waitTime)
        int waitTimeMilliSec = waitTime * 1000;
        // https://stackoverflow.com/questions/3342651/how-can-i-delay-a-java-program-for-a-few-seconds
        try {
            Thread.sleep(waitTimeMilliSec);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
	// Print “Done for the Day”
        
	// Print “You were paid”, pay, “gold for your efforts”
        
        // Actually pay the player
	// payPlayer(pay);
        return pay;
        
        // Return to Port scene
    }
    // int from job is equal to pay amount
    // Calc random wait time
    public static int calcPay(int maxPay) {
        int minSec = 1;
        int maxSec = maxPay;
        int randPay = calcRandNum(minSec,maxSec);
        return randPay;
    }
      
    // Calc random wait time
    public static int calcWaitTime() {
        int minSec = 15;
        int maxSec = 120;
        int waitTime = calcRandNum(minSec,maxSec);
        return waitTime;
    }
    
    // Pay player
    public static void payPlayer(int pay) {
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
