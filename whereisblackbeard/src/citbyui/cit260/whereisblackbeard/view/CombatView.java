/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;

/**
 *
 * @author jlfarnes
 */
public class CombatView extends View {
      
    public CombatView() {
        // this.combatView = 
                super("\n"
                  + "\n----------------------------------------"
                  + "\n | In Combat                           |"
                  + "\n----------------------------------------"
                  + "\nH - Hail the other ship"
                  + "\nF - Fire"
                  + "\nR - Run Away"
                  + "\n----------------------------------------");

    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
       switch (choice) {
                case "H":
                    //choiceLevel = 3;
                    this.commView();
                    break;
                case "F":
                    //choiceLevel = 4;
                    this.attackView();
                    break;
                case "R":
                    //choiceLevel = 5;
                    this.runAwayView();
                    break;
                default:
                    System.out.println("\nInvalid selection, Try again...");
                    break;
        }
        return false;
    }


    private void commView() {
        // System.out.println("*** commView function called ***");
        CommView comm = new CommView();
        comm.display();
    }

    private void attackView() {
        //System.out.println("*** attackView function called ***");
        AttackView attack = new AttackView();
        attack.display();
    }

    private void runAwayView() {
        //System.out.println("*** runAwayView function called ***");
        RunAwayView runAway = new RunAwayView();
        runAway.display();
    }
    
}