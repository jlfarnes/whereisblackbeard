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
public class FoodView extends View {
    
    public FoodView() {
            super("\n"
                  + "\n----------------------------------------"
                  + "\n | How much Food?                            |"
                  + "\n----------------------------------------"
                  + "\nS - 1 Single ration"
                  + "\nB - a Box of 5 rations"
                  + "\nC - a Crate of 20 rations"
                  + "\n----------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "S": // create and start a new game
                this.singleRat();
                break;
            case "B": // load and existing game
                this.boxRat();
                break;
            case "C": // display the help menu
                this.crateRat();
                break;
            default:
                System.out.println("\n*** Invalid selction ** Try again");
                break;
        }
        
        return false;
    }
    
    private void singleRat() {
        System.out.println("\n*** singleRat called");
    }
    
    private void boxRat() {
        System.out.println("\n*** boxRat called");
    }
    
    private void crateRat() {
        System.out.println("\n*** crateRat called");
    }
}
