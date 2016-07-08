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
public class ArmoryView extends View {
    
    public ArmoryView() {
                super("\n"
                  + "\n----------------------------------------"
                  + "\n | Armory                              |"
                  + "\n----------------------------------------"
                  + "\nA - Accuracy Upgrade"
                  + "\nF - Firepower Upgrade"
                  + "\nD - Defense Upgrade"
                  + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "A": // create and start a new game
                this.accuracyUpgrade();
                break;
            case "F": // load and existing game
                this.firepowerUpgrade();
                break;
            case "D": // display the help menu
                this.defenseUpgrade();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selction ** Try again");
                break;
        }
        
        return false;
    }

    private void accuracyUpgrade() {
        this.console.println("*** accuracyUpgrade function called ***");
        
        int invFood = 1;
        int marketFood = 2;
        
        //setFoodUnit(invFood,marketFood);
        int total = (invFood + marketFood);
        //return total;
        this.console.println("\n Food = " + total);
    }

    private void firepowerUpgrade() {
        this.console.println("*** firepowerUpgrade function called ***");
        
        int invWater= 2;
        int marketWater = 3;
        
        //setWaterGallons(invWater,marketWater);
        int total = (invWater + marketWater);
        //return total;
        this.console.println("\n Water = " + total);
    }

    private void defenseUpgrade() {
        this.console.println("*** defenseUpgrade function called ***");
    }
    
}