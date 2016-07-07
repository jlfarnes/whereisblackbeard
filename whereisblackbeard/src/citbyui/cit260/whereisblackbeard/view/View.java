/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import whereisblackbeard.Whereisblackbeard;

/**
 *
 * @author josephclark
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = Whereisblackbeard.getInFile();
    protected final PrintWriter console = Whereisblackbeard.getOutFile();
    
    public View() {
        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(value);
        } while (!done);
    }
    
    @Override
    public String getInput() {
        boolean valid = false;
        String value = null; // value to be returned
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.displayMessage);
            
            value = this.keyboard.readLine();
            value = value.trim();
            
            if (value.length()  < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; // end of loop
        }
            
        
        return value; 
    }
    
}
