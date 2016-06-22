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
public class RunAwayView extends View {
    
    public RunAwayView() {
              super("\n"
                  + "\n----------------------------------------"
                  + "\n | Run Away from the Enemy Ship        |"
                  + "\n----------------------------------------"
                  + "\nC - Run to Cove"
                  + "\nF - Run to Another Port"
                  + "\nD - Cancel"
                  + "\n----------------------------------------"
        );
    }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        switch (choice) {
                case "C":
                    //choiceLevel = 2;
                    this.coveView();
                    break;
                case "P":
                    //choiceLevel = 6;
                    //this.runToPortView();
                    System.out.println("\n Calling the Map Selection View");
                    break;
                case "D":
                    System.out.println("\nDon't Run Away called, returning to Combat menu");
                    //choiceLevel = 2;
                    //this.display();
                    //return;
                    break;
                default:
                    System.out.println("\nInvalid selection, Try again...");
                    break;
            }
        return false;
    }
    
    private void coveView() {
        //System.out.println("*** CoveView function called ***");
        CoveView cove = new CoveView();
        cove.display();
    }

    private void runToPortView() {
        //System.out.println("*** runToPortView function called ***");
        RunToPortView runToPort = new RunToPortView();
        runToPort.display();
    }
}
