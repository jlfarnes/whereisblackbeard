/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereisblackbeard.control.Scene;

/**
 *
 * @author josephclark
 */
public class BattleControls {
    
    // Generate Enemy
    // Stats
    int minStat = 1;
    int maxStat = 9;
    // public static int enemyDiplomacy = calcRandNum(minStat,maxStat);
    public static int enemyDiplomacy;
    public static int enemyCunning;
    public static int enemyStrength;
    public static int enemyAccuracy;
    public static int enemySpeed;
    public static int enemyFirepower;
    public static int enemyDefense;
    public static int enemyBonus;
    public static int locationBonus;
    
    // Display Battle Scene
    
    // Ask what player wants to do
    
    // Attack, Run, or Talk
    
    // Try Diplomacy
    // public static boolean takeAshot(enemyDiplomacy,enemyCunning,enemyStrength,enemyAccuracy,enemySpeed,enemyFirepower,enemyDefense,enemyBonus,locationBonus)
    
    // Fire on Enemy
    public static boolean takeAshot (int playerAccuracy,int playerFirepower,int enemySpeed,int enemyDefense) {
        if ( (playerAccuracy > 0) == (playerAccuracy < 10) == (playerFirepower < 10) ) {
                int total = (playerAccuracy  + playerFirepower) - (enemyDefense + enemySpeed); 
                if ( total > 0 ) {
                    return true;
                }
                else if ( total > 0 ) {
                    return false;
                }
            return false;
        }
        return false;
    }
    
    // Enemy Fires back
    public static boolean takeDamage(int enemyAccuracy,int enemySpeed,int enemyFirepower,int enemyDefense) {
        
        return true;
    }
    
}
