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
        int playerCunning = 3;
        int enemyDiplomacy = 4;
        int enemyCunning = 2;
        
        int expResult = 1; // expected output return value
        int result = BattleControls.tryDiplomacy(playerDiplomacy, playerCunning, enemyDiplomacy, enemyCunning);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of tryDiplomacy method, of class BattleControls.
     */
    @Test
    public void test2TryDiplomacy() {
        System.out.println("tryDiplomacy");
        
        /**************************
         * Test case #2
         */
        System.out.println("\tTest case #2");
        
        // input values for test case 1
        int playerDiplomacy = -3;
        int playerCunning = 2;
        int enemyDiplomacy = 4;
        int enemyCunning = 2;
        
        int expResult = -1; // expected output return value
        int result = BattleControls.tryDiplomacy(playerDiplomacy, playerCunning, enemyDiplomacy, enemyCunning);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of tryDiplomacy method, of class BattleControls.
     */
    @Test
    public void test3TryDiplomacy() {
        System.out.println("tryDiplomacy");
        
        /**************************
         * Test case #3
         */
        System.out.println("\tTest case #3");
        
        // input values for test case 1
        int playerDiplomacy = 3;
        int playerCunning = -5;
        int enemyDiplomacy = 4;
        int enemyCunning = 2;
        
        int expResult = -1; // expected output return value
        int result = BattleControls.tryDiplomacy(playerDiplomacy, playerCunning, enemyDiplomacy, enemyCunning);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of tryDiplomacy method, of class BattleControls.
     */
    @Test
    public void test4TryDiplomacy() {
        System.out.println("tryDiplomacy");
        
        /**************************
         * Test case #4
         */
        System.out.println("\tTest case #4");
        
        // input values for test case 1
        int playerDiplomacy = 3;
        int playerCunning = 2;
        int enemyDiplomacy = 0;
        int enemyCunning = 4;
        
        int expResult = -1; // expected output return value
        int result = BattleControls.tryDiplomacy(playerDiplomacy, playerCunning, enemyDiplomacy, enemyCunning);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of tryDiplomacy method, of class BattleControls.
     */
    @Test
    public void test5TryDiplomacy() {
        System.out.println("tryDiplomacy");
        
        /**************************
         * Test case #5
         */
        System.out.println("\tTest case #5");
        
        // input values for test case 1
        int playerDiplomacy = 1;
        int playerCunning = 1;
        int enemyDiplomacy = 1;
        int enemyCunning = 1;
        
        int expResult = 1; // expected output return value
        int result = BattleControls.tryDiplomacy(playerDiplomacy, playerCunning, enemyDiplomacy, enemyCunning);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of tryDiplomacy method, of class BattleControls.
     */
    @Test
    public void test6TryDiplomacy() {
        System.out.println("tryDiplomacy");
        
        /**************************
         * Test case #6
         */
        System.out.println("\tTest case #6");
        
        // input values for test case 1
        int playerDiplomacy = 9;
        int playerCunning = 9;
        int enemyDiplomacy = 9;
        int enemyCunning = 9;
        
        int expResult = 1; // expected output return value
        int result = BattleControls.tryDiplomacy(playerDiplomacy, playerCunning, enemyDiplomacy, enemyCunning);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of tryDiplomacy method, of class BattleControls.
     */
    @Test
    public void test7TryDiplomacy() {
        System.out.println("tryDiplomacy");
        
        /**************************
         * Test case #7
         */
        System.out.println("\tTest case #7");
        
        // input values for test case 1
        int playerDiplomacy = 1;
        int playerCunning = 1;
        int enemyDiplomacy = 9;
        int enemyCunning = 9;
        
        int expResult = 0; // expected output return value
        int result = BattleControls.tryDiplomacy(playerDiplomacy, playerCunning, enemyDiplomacy, enemyCunning);
        assertEquals(expResult, result);
    }
    
}
