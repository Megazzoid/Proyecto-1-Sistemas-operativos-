/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interfaz.NewJFrame;
/**
 *
 * @author kevin
 */
public class Emsamblador_RickMorty extends Thread {
    Semaphore Emsamblador;
    int capituloplot = 0;
    private NewJFrame newJFrame = NewJFrame.getInstance();
    private boolean pausar = false;
    
    
    
    
    public void pausar(){
        this.pausar = true;
    }
    
    
    public void reanudar(){
        this.pausar = false;
    }
  
  
    public Emsamblador_RickMorty(Semaphore SemaforoEmsamblador) {
        this.Emsamblador = SemaforoEmsamblador;
            
    }
    
    public void emsamblar(){
        if(capituloplot>4){
            
            if(Main.semaforoIntroRickYmorty.availablePermits()<= 29 && Main.semaforoCreditsRickyMorty.availablePermits() <= 21 &&
                Main.semaforoInicio.availablePermits() <= 48 && Main.semaforoCierreRickyMorty.availablePermits()<= 54 && Main.semaforoPlotRickyMorty.availablePermits() <= 39 ){
            
            try {
                            Thread.sleep(2000);
                            Main.semaforoInicioRickyMorty.release(2);
                            Main.semaforoIntroRickYmorty.release(1);
                            Main.semaforoCreditsRickyMorty.release(1);
                            Main.semaforoCierreRickyMorty.release(1);
                            Main.semaforoPlotRickyMorty.release(1);
                            Main.capitulosPlotRym = Main.capitulosPlotRym + 1;
                            newJFrame.getCapituloPlotRyM(Integer.toString(Main.capitulosPlotRym));
                            capituloplot = 0;
                            
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
                        }}       
            else{
            System.out.println("No se pudo producir");
        }
            
            
        }else{
            if(Main.semaforoIntroRickYmorty.availablePermits()<= 29 && Main.semaforoCreditsRickyMorty.availablePermits() <= 21 &&
                Main.semaforoInicio.availablePermits() <= 48 && Main.semaforoCierreRickyMorty.availablePermits()<= 54){
            
            try {
                            Thread.sleep(2000);
                            Main.semaforoInicioRickyMorty.release(2);
                            Main.semaforoIntroRickYmorty.release(1);
                            Main.semaforoCreditsRickyMorty.release(1);
                            Main.semaforoCierreRickyMorty.release(1);
                            Main.capituloslistosRym = Main.capituloslistosRym + 1;
                            capituloplot = capituloplot + 1; 
                            newJFrame.getCapituloRyM(Integer.toString(Main.capituloslistosRym));
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
                        }
            
        }
        
        }
    }

    
    @Override
    public void run() {
        while(true){
            
            while(pausar==true){
                     System.out.println("");
                }    
              
            emsamblar();
                    }
           
        
        }
    
    
}
