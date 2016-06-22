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
public class CommView extends View {
    
    public CommView() {
        super("\n"
                  + "\n----------------------------------------"
                  + "\n | Hail The Enemy Ship                 |"
                  + "\n----------------------------------------"
                  + "\nD - Diplomacy"
                  + "\nL - Deception"
                  + "\nT - Trade"
                  + "\nC - Cancel"
                  + "\n----------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        switch (choice) {
                case "D":
                    System.out.println("\nDiplomacy called, returning to Combat menu");
                //    choiceLevel = 2;
                    this.display();
                    // this.commView();
                    break;
                case "L":
                    System.out.println("\nDeception called, returning to Combat menu");
                //    choiceLevel = 2;
                    this.display();
                    // this.attackView();
                    break;
                case "T":
                    System.out.println("\nTrade&Barter called, returning to Combat menu");
                //    choiceLevel = 2;
                    this.display();
                    // this.runAwayView();
                    break;
                default:
                    System.out.println("\nInvalid selection, Try again...");
                    break;
            }
        return false;
    }
    
}
