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
public class WaterView extends View {
    
    public WaterView() {
            super("\n"
                  + "\n----------------------------------------"
                  + "\n | How much Water?                            |"
                  + "\n----------------------------------------"
                  + "\nC - 1 Single ration canteen"
                  + "\nJ - a Jug of 5 rations"
                  + "\nB - a Barrrel of 20 rations"
                  + "\n----------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "C": // create and start a new game
                this.singleRat();
                break;
            case "J": // load and existing game
                this.jugRat();
                break;
            case "B": // display the help menu
                this.barrelRat();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selction ** Try again");
                break;
        }
        
        return false;
    }
    
    private void singleRat() {
        this.console.println("\n*** singleWaterRat called");
    }
    
    private void jugRat() {
        this.console.println("\n*** jugWaterRat called");
    }
    
    private void barrelRat() {
        this.console.println("\n*** barrelRat called");
    }
}
