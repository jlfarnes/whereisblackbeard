/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;

/**
 *
 * @author josephclark
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
    this.promptMessage = "\nPlease enter your name: ";
    //display the banner when view is created
    this.displayBanner();
}

    public void displayBanner() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println(
                "\n**************************************************"
              + "\n*                                                *"
              + "\n* Enter banner lore here                         *"
              + "\n*                                                *"
              + "\n**************************************************"
                );
    }

    public void displayStartProgramView() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        System.out.println("\n*** displayStartProgram() function called ***");
        
        boolean done = false;
        do {
            // prompt for and get player name
            String playersName = this.getPlayersName(); // May need varible
            if (playersName.toUpperCase().equals("Q")) // User saying to quit
                return; //exit game
            
            // show next view
            done = this.doAction(playersName);
            
        } while (!done);
            
    }

    private String getPlayersName() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** getPlayersName() called ***");
        return "Joe";
    }

    private boolean doAction(String playersName) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** getPlayersName() called ***");
        return true;
    }

    
    
}
