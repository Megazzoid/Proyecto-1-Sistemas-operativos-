/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kevin
 */
public class Emsamblador_RickMorty extends Thread {
    Semaphore Emsamblador;
  
  
    public Emsamblador_RickMorty(Semaphore SemaforoEmsamblador) {
        this.Emsamblador = SemaforoEmsamblador;
            
    }
    
    public void emsamblar(){
        if(Main.semaforoIntroRickYmorty.availablePermits()<= 29 && Main.semaforoCreditsRickyMorty.availablePermits() <= 21 &&
                Main.semaforoInicio.availablePermits() <= 48 && Main.semaforoCierreRickyMorty.availablePermits()<= 54){
            
            try {
                            Thread.sleep(5000);
                            Main.semaforoInicioRickyMorty.release(2);
                            Main.semaforoIntroRickYmorty.release(1);
                            Main.semaforoCreditsRickyMorty.release(1);
                            Main.semaforoCierreRickyMorty.release(1);
                            Main.capituloslistos = Main.capituloslistos + 1;
                            System.out.println("Hay en total capitulos listos:"+Main.capituloslistos);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
                        }
            
        }
        else{
            System.out.println("No se pudo producir");
        }
    }

    
    @Override
    public void run() {
        while(true){
            
            try {
                    Thread.sleep(1000);
                    emsamblar();
                            } catch (InterruptedException ex) {
                                 java.util.logging.Logger.getLogger(Productores_GOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                            }
                    }
           
        
        }
    
    
}
