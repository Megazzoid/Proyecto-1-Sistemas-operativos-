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
    
    Semaphore semaforoIntro;
    Semaphore semaforoCredits;
    Semaphore semaforoInicio;
    Semaphore semaforoCierra;
    Semaphore semaforoGiro;
    Semaphore semaforoLimite;
    Boolean keep = true;
    int num_prod;    
    int num_prod2;
    int num_prod3;
    int num_prod4;
    int num_prod5;
   
    
    public Productores_GOT(Semaphore semaforoMax, String texto){
        this.semaforoLimite = semaforoMax;
    }
    
    public void Productores(int productores){
        this.num_prod = productores; 
    }
    
    public void Productores2(int productores2){
        this.num_prod2 = productores2; 
    }
    
    public void Productores3(int productores3){
        this.num_prod3 = productores3; 
    }
    
    public void Productores4(int productores4){
        this.num_prod4 = productores4; 
    }
    
    public void Productores5(int productores5){
        this.num_prod5 = productores5; 
    }
    

    public void producirIntro(){
        for(int i = 0; i <= Main.hilo1.num_prod; i++){
            System.out.println("Soy Intro");
            if(i == Main.hilo1.num_prod){
                for(int j = 0; j < 1; j++){
                    if(Main.semaforoIntro.availablePermits() > 0){
                        try {
                            Thread.sleep(1000);
                            Main.semaforoIntro.acquire(1);
                            Main.numero--;
                            System.out.println(Main.numero);
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
        for(int i = 0; i <= Main.hilo2.num_prod2; i++){
            System.out.println("Soy Creditos");
            if(i == Main.hilo2.num_prod2){
                for(int f = 0; f < 1; f++){
                    if(Main.semaforoCredits.availablePermits() > 0){
                        try {
                            Thread.sleep(1000);
                            Main.semaforoCredits.acquire(1);
                            Main.numero2--;
                            System.out.println(Main.numero2);
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
        for(int i = 0; i <= Main.hilo3.num_prod3; i++){
            System.out.println("Soy Inicio");
            if(i == Main.hilo3.num_prod3){
                for(int f = 0; f <= 2; f++){
                    if(f == 2){
                        if(Main.semaforoInicio.availablePermits() > 0){
                        try {
                            Thread.sleep(2000);
                            Main.semaforoInicio.acquire(1);
                            Main.numero3--;
                            System.out.println(Main.numero3);
                            semaforoLimite.acquire(1);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                        }
                }
            }
        }
    }
}
       
    public void producirCierra(){
        for(int i = 0; i <= Main.hilo4.num_prod4; i++){
            System.out.println("Soy Cierra");
            if(i == Main.hilo4.num_prod4){
                for(int f = 0; f <= 4; f++){
                    System.out.println(f);
                    if(f == 4){
                        if(Main.semaforoCierra.availablePermits() > 0){
                        try {
                            Thread.sleep(4000);
                            Main.semaforoCierra.acquire(1);
                            Main.numero4--;
                            System.out.println(Main.numero4);
                            semaforoLimite.acquire(1);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                        }
                }
            }
        }
    }
}
    public void producirGiro(){
        for(int i = 0; i < Main.hilo5.num_prod5; i++){
            System.out.println("Soy Giro");
            if(i == Main.hilo5.num_prod5){
                for(int f = 0; f <= 2; f++){
                    System.out.println(f);
                    if(f == 2){
                        if(Main.semaforoGiro.availablePermits() > 0){
                        try {
                            Thread.sleep(2000);
                            Main.semaforoGiro.acquire(1);
                            Main.numero5--;
                            System.out.println(Main.numero5);
                            semaforoLimite.acquire(1);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                        }
                }
            }
        }
    }
}
    
    @Override
   public void run(){
       while(true){
           for(int i = 0; i < num_prod; i++){
               try {
                Thread.sleep(1000);
                producirIntro();
           } catch (InterruptedException ex) {
               Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
           }
           
        }
           for(int i = 0; i < num_prod2; i++){
               try {
                Thread.sleep(1000);
                producirCredits();
           } catch (InterruptedException ex) {
               Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
           }
           
        }
            for(int i = 0; i < num_prod3; i++){
               try {
                Thread.sleep(1000);
                producirInicio();
           } catch (InterruptedException ex) {
               Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
           }
           
        }
            for(int i = 0; i < num_prod4; i++){
               try {
                Thread.sleep(1000);
                producirCierra();
           } catch (InterruptedException ex) {
               Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
           }
           
        }
            for(int i = 0; i < num_prod5; i++){
               try {
                Thread.sleep(1000);
                producirGiro();
           } catch (InterruptedException ex) {
               Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
           }
           
        }
        }
               
    }
}
 




               

        
    

