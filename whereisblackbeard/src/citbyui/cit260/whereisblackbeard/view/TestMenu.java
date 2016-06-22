/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;

import java.util.Scanner;

/**
 *
 * @author jlfarnes
 */
public class TestMenu extends View {
    
    private String menus;
    private String choice;
    private String testOption;
    boolean done = false; // set flag to not done
    
    public TestMenu() {
            super("\n"
                + "\nTest Menu"
                + "\n========="
                + "\nS - Starting Cove View"
                + "\nP - Port View"
                + "\nC - Combat View"
                + "\n"
                + "\n============="
                + "\nM - Main Menu");
    }
        
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "S":
                this.startingCove();
                //return true;
                break;
            case "P":
                this.portView();
                //return true;
                break;
            case "C":
                this.combatView();
                //return true;
                break;
            case "M":
                this.mainMenuView();
                //return true;
                break;
            default:
                System.out.println("\n*** Invalid selction ** Try again");
                break;
        }
        
        return false;
    }

    private void startingCove() {
        //System.out.println("*** startingCove function called ***");
        CoveView cove = new CoveView();
        cove.display();
    }

    private void portView() {
        //System.out.println("*** portView function called ***");
        PortView port = new PortView();
        port.display();
    }

    private void combatView() {
        //System.out.println("*** combatView function called ***");
        CombatView combat = new CombatView();
        combat.display();
    }

    private void mainMenuView() {
        //System.out.println("*** mainMenuView function called ***");
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
        //return;
    }
    

    
}
