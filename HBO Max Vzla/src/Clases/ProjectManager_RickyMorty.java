/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaz.NewJFrame;
import java.util.Random;

/**
 *
 * @author kevin
 */
public class ProjectManager_RickyMorty extends Thread {
   
Boolean ViendoRick = false;  
private NewJFrame newJFrame = NewJFrame.getInstance();
    
    
        @Override
        public void run() {
            while (Main.remainingDays > 0) {
                try {
                     // 
                    Main.ProjectManagerRickYmorty.acquire();
                    Main.LeerRickyMorty.acquire();
                    // Adquiere el semaforo
                    if (Main.remainingDays > 0) {
                        Thread.sleep((42));
                        Main.remainingDays--;
                        newJFrame.DiaRyM(Integer.toString(Main.remainingDays));
                        
                    }
                    Main.LeerRickyMorty.release();
                    // Libera el semaforo
                    Main.ProjectManagerRickYmorty.release();
                    
                    for (int i = 0; i < 11; i++) {
                    
                    ViendoRick = true;
                    Thread.sleep((88));
                    newJFrame.PjRyM("Ver Rick y Morty");
                    ViendoRick = false;
                    Thread.sleep((88));
                    newJFrame.PjRyM("Spring Reviews");
                    
                    }
                           
                    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        
       
    
}
