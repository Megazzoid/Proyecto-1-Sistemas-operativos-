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
    public Boolean keep = true;
    int num_prod;
    
    
    
    
    
    public Productores_GOT(Semaphore semaforoMax, String texto){
        
        this.semaforoLimite = semaforoMax;
        
        
    }
    
    public void Productores(int productores){
        this.num_prod = productores;
    }

    public void producirIntro(){
        for(int i = 0; i <= num_prod; i++){
            System.out.println(i);
            if(i == num_prod){
                for(int j = 0; j <= num_prod; j++){
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
        for(int i = 0; i < 2; i++){
            if(i == Main.productor){
                for(int f = 0; f < 1; f++){
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
    
        public void producirInicio(){
        System.out.println("Esto es inicio");
        for(int i = 0; i < 3; i++){
            if(i == Main.productor){
                for(int f = 0; f < 2; f++){
                    if(Main.semaforoCredits.availablePermits() > 0){
                        try {
                            Main.semaforoInicio.acquire(1);
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
           for(int i = 0; i <= num_prod; i++){
               try {
                Thread.sleep(1000);
                producirIntro();
                //producirCredits();
                //producirInicio();
           } catch (InterruptedException ex) {
               Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
           }
           
        }

        }
               
    }
}
 




               

        
    

