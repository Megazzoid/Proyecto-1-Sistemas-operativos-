/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaz.NewJFrame;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danma
 */
public class ProjectManager_GOT extends Thread{
    
    private NewJFrame newJFrame = NewJFrame.getInstance();
    int salario = 7 * 30;
    boolean watchea =false;
   
    @Override
    public void run(){
        while(true){
            try {
                System.out.println(Main.Dias);
                Main.RickMorty.acquire();
                Main.sprint.acquire();
                Thread.sleep(1000);
                
                if(Main.Dias > 0){
                    
                    Thread.sleep(126);
                    Main.Dias--;
                    newJFrame.DiasGOT(Integer.toString(Main.Dias));
                    Main.RickMorty.release();
                    Main.sprint.release();
                    
                    for(int i = 0; i < 7; i++){
                          
                      watchea = true;
                      Thread.sleep(34);
                      newJFrame.pjvago("Viendo Rick & Morty");
                      watchea = false;
                      Thread.sleep(34);
                      newJFrame.pjvago("Haciendo Spring Reviews");
                }
                   
                } 
                      
            } catch (InterruptedException ex) {
                Logger.getLogger(ProjectManager_GOT.class.getName()).log(Level.SEVERE, null, ex);
            }
            
  
}
    
}



}
