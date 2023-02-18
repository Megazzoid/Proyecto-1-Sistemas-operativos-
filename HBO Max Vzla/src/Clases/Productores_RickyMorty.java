/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;



import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.concurrent.Semaphore;

public class Productores_RickyMorty extends Thread {
    Semaphore espacioEnDrive;
    String tipoProductor;
    int Acumulado;
   

    public Productores_RickyMorty(Semaphore espacioEnDrive, String tipoProductor) {
        this.espacioEnDrive = espacioEnDrive;
        this.tipoProductor = tipoProductor;
        
    }
    
    public void producirIntroRyM(){
        if (tipoProductor.equals("Intro")) {
        if(Main.semaforoIntroRickYmorty.availablePermits() > 0){
               try {
                    Thread.sleep(1000);
                            Main.semaforoIntroRickYmorty.acquire(1);
                            System.out.println("Semaforo adquirido");
                            } catch (InterruptedException ex) {
                                 java.util.logging.Logger.getLogger(Productores_GOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                            }
                    }
    
    }
    }
    
    public void producirCreditosRyM(){
        if (tipoProductor.equals("Creditos")) {
        if(Main.semaforoCreditsRickyMorty.availablePermits() > 4){
               try {
                    Thread.sleep(1000);
                            Main.semaforoCreditsRickyMorty.acquire(4);
                            System.out.println("Hay"+ Main.semaforoCreditsRickyMorty.availablePermits());
                            } catch (InterruptedException ex) {
                                 java.util.logging.Logger.getLogger(Productores_GOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                            }
                    }
    
        }
    }
        
    
      
    
    
    @Override
    public void run() {
        while(true){
            
            try {
                    Thread.sleep(1000);
                    producirIntroRyM();
                    producirCreditosRyM();        
                            } catch (InterruptedException ex) {
                                 java.util.logging.Logger.getLogger(Productores_GOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                            }
                    }
           
        
        }
    }
    


    

