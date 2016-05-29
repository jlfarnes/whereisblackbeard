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
        
        // input values for test case 2
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
        
        // input values for test case 3
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
        
        // input values for test case 4
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
        
        // input values for test case 5
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
        
        // input values for test case 6
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
        
        // input values for test case 7
        int playerDiplomacy = 1;
        int playerCunning = 1;
        int enemyDiplomacy = 9;
        int enemyCunning = 9;
        
        int expResult = 0; // expected output return value
        int result = BattleControls.tryDiplomacy(playerDiplomacy, playerCunning, enemyDiplomacy, enemyCunning);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of takeDamage method, of class BattleControls.
     */
    @Test
    public void testTakeDamage() {
        System.out.println("takeDamage");
        
        /**************************
         * Test case #1
         */
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        int enemyAccuracy = 3;
        int playerSpeed = 3;
        int enemyFirepower = 4;
        int playerDefense = 2;
        
        int expResult = 1; // expected output return value
        int result = BattleControls.takeDamage(enemyAccuracy, playerSpeed, enemyFirepower, playerDefense);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of takeDamage method, of class BattleControls.
     */
    @Test
    public void test2TakeDamage() {
        System.out.println("takeDamage");
        
        /**************************
         * Test case #2
         */
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        int enemyAccuracy = -3;
        int playerSpeed = 2;
        int enemyFirepower = 4;
        int playerDefense = 2;
        
        int expResult = -1; // expected output return value
        int result = BattleControls.takeDamage(enemyAccuracy, playerSpeed, enemyFirepower, playerDefense);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of takeDamage method, of class BattleControls.
     */
    @Test
    public void test3TakeDamage() {
        System.out.println("takeDamage");
        
        /**************************
         * Test case #3
         */
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        int enemyAccuracy = 3;
        int playerSpeed = -5;
        int enemyFirepower = 4;
        int playerDefense = 2;
        
        int expResult = -1; // expected output return value
        int result = BattleControls.takeDamage(enemyAccuracy, playerSpeed, enemyFirepower, playerDefense);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of takeDamage method, of class BattleControls.
     */
    @Test
    public void test4TakeDamage() {
        System.out.println("takeDamage");
        
        /**************************
         * Test case #4
         */
        System.out.println("\tTest case #4");
        
        // input values for test case 4
        int enemyAccuracy = 3;
        int playerSpeed = 2;
        int enemyFirepower = 0;
        int playerDefense = 4;
        
        int expResult = -1; // expected output return value
        int result = BattleControls.takeDamage(enemyAccuracy, playerSpeed, enemyFirepower, playerDefense);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of takeDamage method, of class BattleControls.
     */
    @Test
    public void test5TakeDamage() {
        System.out.println("takeDamage");
        
        /**************************
         * Test case #5
         */
        System.out.println("\tTest case #5");
        
        // input values for test case 5
        int enemyAccuracy = 1;
        int playerSpeed = 1;
        int enemyFirepower = 1;
        int playerDefense = 1;
        
        int expResult = 1; // expected output return value
        int result = BattleControls.takeDamage(enemyAccuracy, playerSpeed, enemyFirepower, playerDefense);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of takeDamage method, of class BattleControls.
     */
    @Test
    public void test6TakeDamage() {
        System.out.println("takeDamage");
        
        /**************************
         * Test case #6
         */
        System.out.println("\tTest case #6");
        
        // input values for test case 6
        int enemyAccuracy = 9;
        int playerSpeed = 9;
        int enemyFirepower = 9;
        int playerDefense = 9;
        
        int expResult = 1; // expected output return value
        int result = BattleControls.takeDamage(enemyAccuracy, playerSpeed, enemyFirepower, playerDefense);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of takeDamage method, of class BattleControls.
     */
    @Test
    public void test7TakeDamage() {
        System.out.println("takeDamage");
        
        /**************************
         * Test case #7
         */
        System.out.println("\tTest case #7");
        
        // input values for test case 7
        int enemyAccuracy = 1;
        int playerSpeed = 9;
        int enemyFirepower = 1;
        int playerDefense = 9;
        
        int expResult = 0; // expected output return value
        int result = BattleControls.takeDamage(enemyAccuracy, playerSpeed, enemyFirepower, playerDefense);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of takeAshot method, of class BattleControls.
     */
    @Test
    public void testTakeAshot() {
        System.out.println("takeAshot");
        
        /**************************
         * Test case #1
         */
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        int playerAccuracy = 3;
        int playerFirepower = 4;
        int enemySpeed = 3;
        int enemyDefense = 2;
        
        int expResult = 1; // expected output return value
        int result = BattleControls.takeAshot(playerAccuracy,playerFirepower,enemySpeed,enemyDefense);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of takeAshot method, of class BattleControls.
     */
    @Test
    public void test2TakeAshot() {
        System.out.println("takeAshot");
        
        /**************************
         * Test case #2
         */
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        int playerAccuracy = -3;
        int playerFirepower = 4;
        int enemySpeed = 3;
        int enemyDefense = 2;
        
        int expResult = -1; // expected output return value
        int result = BattleControls.takeAshot(playerAccuracy,playerFirepower,enemySpeed,enemyDefense);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of takeAshot method, of class BattleControls.
     */
    @Test
    public void test3TakeAshot() {
        System.out.println("takeAshot");
        
        /**************************
         * Test case #3
         */
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        int playerAccuracy = 1;
        int playerFirepower = 5;
        int enemySpeed = -6;
        int enemyDefense = 1;
        
        int expResult = -1; // expected output return value
        int result = BattleControls.takeAshot(playerAccuracy,playerFirepower,enemySpeed,enemyDefense);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of takeAshot method, of class BattleControls.
     */
    @Test
    public void test4TakeAshot() {
        System.out.println("takeAshot");
        
        /**************************
         * Test case #4
         */
        System.out.println("\tTest case #4");
        
        // input values for test case 4
        int playerAccuracy = 1;
        int playerFirepower = -1;
        int enemySpeed = 1;
        int enemyDefense = 1;
        
        int expResult = -1; // expected output return value
        int result = BattleControls.takeAshot(playerAccuracy,playerFirepower,enemySpeed,enemyDefense);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of takeAshot method, of class BattleControls.
     */
    @Test
    public void test5TakeAshot() {
        System.out.println("takeAshot");
        
        /**************************
         * Test case #5
         */
        System.out.println("\tTest case #5");
        
        // input values for test case 5
        int playerAccuracy = 1;
        int playerFirepower = 1;
        int enemySpeed = 9;
        int enemyDefense = 9;
        
        int expResult = 0; // expected output return value
        int result = BattleControls.takeAshot(playerAccuracy,playerFirepower,enemySpeed,enemyDefense);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of takeAshot method, of class BattleControls.
     */
    @Test
    public void test6TakeAshot() {
        System.out.println("takeAshot");
        
        /**************************
         * Test case #6
         */
        System.out.println("\tTest case #6");
        
        // input values for test case 6
        int playerAccuracy = 1;
        int playerFirepower = 1;
        int enemySpeed = 1;
        int enemyDefense = 1;
        
        int expResult = 1; // expected output return value
        int result = BattleControls.takeAshot(playerAccuracy,playerFirepower,enemySpeed,enemyDefense);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of takeAshot method, of class BattleControls.
     */
    @Test
    public void test7TakeAshot() {
        System.out.println("takeAshot");
        
        /**************************
         * Test case #7
         */
        System.out.println("\tTest case #7");
        
        // input values for test case 7
        int playerAccuracy = 9;
        int playerFirepower = 9;
        int enemySpeed = 9;
        int enemyDefense = 9;
        
        int expResult = 1; // expected output return value
        int result = BattleControls.takeAshot(playerAccuracy,playerFirepower,enemySpeed,enemyDefense);
        assertEquals(expResult, result);
    }
    
}
