/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.whereisblackbeard.view;

import java.io.PrintWriter;
import whereisblackbeard.Whereisblackbeard;

/**
 *
 * @author josephclark
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = Whereisblackbeard.getOutFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "-------------------------------------------------------"
                  + "\n- Error - " + errorMessage
                  + "\n-------------------------------------------------------");
    }
    
}
