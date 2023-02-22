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
  
  
    public Emsamblador_RickMorty(Semaphore SemaforoEmsamblador) {
        this.Emsamblador = SemaforoEmsamblador;
            
    }
    
    public void emsamblar(){
        if(capituloplot>4){
            
            if(Main.semaforoIntroRickYmorty.availablePermits()<= 29 && Main.semaforoCreditsRickyMorty.availablePermits() <= 21 &&
                Main.semaforoInicio.availablePermits() <= 48 && Main.semaforoCierreRickyMorty.availablePermits()<= 54 && Main.semaforoPlotRickyMorty.availablePermits() <= 39 ){
            
            try {
                            Thread.sleep(5000);
                            Main.semaforoInicioRickyMorty.release(2);
                            Main.semaforoIntroRickYmorty.release(1);
                            Main.semaforoCreditsRickyMorty.release(1);
                            Main.semaforoCierreRickyMorty.release(1);
                            Main.semaforoPlotRickyMorty.release(1);
                            Main.capitulosPlotRym = Main.capitulosPlotRym + 1;
                            
                            
                           NewJFrame pantalla = new NewJFrame ();
                           pantalla.setVisible(true);
                           pantalla.setLocationRelativeTo(null);
                           pantalla.setPrueba(Main.capitulosPlotRym+"Se acaba de producir un capitulo plot en totales hay");
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
                            Thread.sleep(5000);
                            Main.semaforoInicioRickyMorty.release(2);
                            Main.semaforoIntroRickYmorty.release(1);
                            Main.semaforoCreditsRickyMorty.release(1);
                            Main.semaforoCierreRickyMorty.release(1);
                            Main.capituloslistosRym = Main.capituloslistosRym + 1;
                            System.out.println("Hay en total capitulos listos:"+Main.capituloslistosRym);
                            capituloplot = capituloplot + 1; 
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
                        }
            
        }
        
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
