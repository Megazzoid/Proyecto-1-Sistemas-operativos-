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
    public String text;
    public Boolean keep = true;
    public int valor = 0;
    
    
    
    public Productores_GOT(Semaphore semaforo1, String texto){
        
        this.semaforoIntro = semaforo1;
       // this.semaforoCredits = semaforo2;
        //this.semaforoInicio = semaforo3;
       // this.semaforoCierra = semaforo4;
       // this.semaforoGiro = semaforo5;
        this.text = texto;
        
    }


    @Override
    public void run(){
        for(int i = 0; i < 4; i++){
            if(i == Main.productor){
                for(int j = 0; j < 2; j++){
                    System.out.println(j);
                    if(semaforoIntro.availablePermits() > 0){
                        try {
                            semaforoIntro.acquire(2);
                            Main.semaforoMutao.acquire();
                            Main.numero--;
                            System.out.println(Main.numero);
                            Thread.sleep(1000);
                            Main.semaforoMutao.release();
                            j--;
                            semaforoIntro.release(3);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        
                    }

                }
                
            }
        }
    }
}

               

        
    

