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
 * @author danma
 */
public class Productores_GOT extends Thread{
    
    public Semaphore semaforoIntro;
    public Semaphore semaforoCredits;
    public Semaphore semaforoInicio;
    public Semaphore semaforoCierra;
    public Semaphore semaforoGiro;
    public Semaphore semaforoLimite;
    public String text;
    public Boolean keep = true;
    public int valor = 0;
    
    
    
    public Productores_GOT(Semaphore semaforoMax, String texto){
        
        this.semaforoLimite = semaforoMax;
        this.text = texto;
        
    }

    public void producirIntro(){
        System.out.println("Esto es intro");
        for(int i = 0; i < 4; i++){
            if(i == Main.productor){
                for(int j = 0; j < 2; j++){
                    if(Main.semaforoIntro.availablePermits() > 0){
                        try {
                            Main.semaforoIntro.acquire(1);
                            Main.numero--;
                            System.out.println(Main.numero);
                            Thread.sleep(1000);
                            semaforoLimite.acquire(1);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }
                }
            }
        }
    }
    
    public void producirCredits(){
        System.out.println("Esto es creditos");
        for(int i = 0; i < 4; i++){
            if(i == Main.productor){
                for(int f = 0; f < 2; f++){
                    if(Main.semaforoCredits.availablePermits() > 0){
                        try {
                            Main.semaforoCredits.acquire(1);
                            Main.numero2--;
                            System.out.println(Main.numero2);
                            Thread.sleep(1000);
                            semaforoLimite.acquire(1);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }
                }
            }
        }
    }
    
    @Override
   public void run(){
       while(true){
           try {
                Thread.sleep(1000);
                producirIntro();
                producirCredits();
           } catch (InterruptedException ex) {
               Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }

       
   }
}
 




               

        
    

