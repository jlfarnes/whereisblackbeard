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
public class AttackView extends View {
    
    public AttackView() {
              super("\n"
                  + "\n----------------------------------------"
                  + "\n | Attack Enemy Ship                   |"
                  + "\n----------------------------------------"
                  + "\nS - Single Shot"
                  + "\nF - Fire at Will"
                  + "\nB - Broadside"
                  + "\nC - Cancel"
                  + "\n----------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        switch (choice) {
                case "S":
                    this.console.println("\nSingle Shot called, returning to Combat menu");
                    //choiceLevel = 2;
                    //this.display();
                    break;
                case "F":
                    this.console.println("\nFire At Will called, returning to Combat menu");
                    //choiceLevel = 2;
                    //this.display();
                    //this.attackView();
                    break;
                case "B":
                    this.console.println("\nBroadside called, returning to Combat menu");
                    //choiceLevel = 2;
                    //this.display();
                    //this.runAwayView();
                    break;
                default:
                    ErrorView.display(this.getClass().getName(),
                            "\nInvalid selection, Try again...");
                    break;
            }
        return false;
    }
}
