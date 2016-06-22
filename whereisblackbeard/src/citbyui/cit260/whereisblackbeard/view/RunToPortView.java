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
public class RunToPortView extends View{
    
    public RunToPortView() {
              super("\n"
                  + "\n----------------------------------------"
                  + "\n | Run Away to a Port       |"
                  + "\n----------------------------------------"
                  + "\nL - London"
                  + "\nC - Canary Islands"
                  + "\nB - Bahamas"
                  + "\nG - Guadalajara"
                  + "\nF - Florida Keys"
                  + "\nC - Cancel"
                  + "\n----------------------------------------"
        );
    }
    
    @Override
    public boolean doAction(String choice) {
        System.out.println("\n Port called - flesh me out with all 25 Port names"
                         + "\n really should just call the map view here...");
        choice = choice.toUpperCase(); // convert choice to upper case
        switch (choice) {
                case "L":
                    //choiceLevel = 2;
                    //this.CoveView();
                    break;
                case "P":
                    //choiceLevel = 2;
                    //this.attackView();
                    break;
                case "D":
                    System.out.println("\nDon't Run Away called, returning to Combat menu");
                    //choiceLevel = 2;
                    //this.display();
                    break;
                default:
                    System.out.println("\nInvalid selection, dropping to main combat menu");
                    //choiceLevel = 2;
                    break;
            }
        return false;
    }
}
