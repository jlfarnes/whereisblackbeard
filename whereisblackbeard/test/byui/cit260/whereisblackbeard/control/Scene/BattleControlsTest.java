/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.control.Scene;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephclark
 */
public class BattleControlsTest {
    
    public BattleControlsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of tryDiplomacy method, of class BattleControls.
     */
    @Test
    public void testTryDiplomacy() {
        System.out.println("tryDiplomacy");
        
        /**************************
         * Test case #1
         */
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        int playerDiplomacy = 3;
        int playerCunning = 2;
        int enemyDiplomacy = 4;
        int enemyCunning = 2;
        
        boolean expResult = false; // expected output return value
        boolean result = BattleControls.tryDiplomacy(playerDiplomacy, playerCunning, enemyDiplomacy, enemyCunning);
        assertEquals(expResult, result);
    }

    /**
     * Test of takeAshot method, of class BattleControls.
     */
    @Test
    public void testTakeAshot() {
        System.out.println("takeAshot");
        
        /**************************
         * Test case #2
         */
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        int playerAccuracy = 5;
        int playerFirepower = 6;
        int enemySpeed = 7;
        int enemyDefense = 5;
        
        boolean expResult = false; // expected output return value
        boolean result = BattleControls.takeAshot(playerAccuracy, playerFirepower, enemySpeed, enemyDefense);
        assertEquals(expResult, result);
    }

    /**
     * Test of takeDamage method, of class BattleControls.
     */
    @Test
    public void testTakeDamage() {
        System.out.println("takeDamage");
                
        /**************************
         * Test case #3
         */
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        int enemyAccuracy = 3;
        int playerSpeed = 6;
        int enemyFirepower = 7;
        int playerDefense = 7;
        
        boolean expResult = false; // expected output return value        
        boolean result = BattleControls.takeDamage(enemyAccuracy, playerSpeed, enemyFirepower, playerDefense);
        assertEquals(expResult, result);
    }
    
}
