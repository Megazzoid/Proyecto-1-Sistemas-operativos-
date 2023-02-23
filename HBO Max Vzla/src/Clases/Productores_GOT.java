/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaz.NewJFrame;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danma
 */
public class Productores_GOT extends Thread{
    
    private NewJFrame newJFrame = NewJFrame.getInstance();
    
    Semaphore semaforoIntro;
    Semaphore semaforoCredits;
    Semaphore semaforoInicio;
    Semaphore semaforoCierra;
    Semaphore semaforoGiro;
    Semaphore semaforoLimite;
    Semaphore introDisp;
    Boolean keep = true;
    int num_prod;    
    int num_prod2;
    int num_prod3;
    int num_prod4;
    int num_prod5;
    int num_ens;
    int cap_plot = 0;
    int contador;
    int contador_ens;
    
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
    
    public void ProductoresEnsambladores(int ensa){
        this.num_ens = ensa; 
    }

    public void producirIntro(){
        for(int i = 0; i <= newJFrame.num_prod; i++){
            if(i == newJFrame.num_prod){
                for(int j = 0; j < newJFrame.num_prod; j++){
                    if(NewJFrame.semaforoIntro.availablePermits() > 0){
                        try {
                            NewJFrame.semaforoIntro.acquire(1);
                            NewJFrame.semaforoMax.acquire(1);
                            contador++;
                            newJFrame.introDisp(Integer.toString(contador));
                            System.out.println("hola");
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    } else {
                        System.out.println("toy full");
                    }
                }
            }
        }
    }
    
    public void producirCredits(){
        for(int i = 0; i <= newJFrame.num_prod2; i++){
            if(i == newJFrame.num_prod2){
                for(int f = 0; f < newJFrame.num_prod2; f++){
                    if(NewJFrame.semaforoCredits.availablePermits() > 0){
                        try {
                            NewJFrame.semaforoCredits.acquire(1);
                            NewJFrame.semaforoMax.acquire(1);
                            contador++;
                            newJFrame.credDisp(Integer.toString(contador));
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }
                }
            }
        }
    }
    
    public void producirInicio(){
        for(int i = 0; i <= newJFrame.num_prod3; i++){
            if(i == newJFrame.num_prod3){
                for(int f = 0; f < newJFrame.num_prod3; f++){
                    if(NewJFrame.semaforoInicio.availablePermits() > 0){
                        try {
                            NewJFrame.semaforoInicio.acquire(1);
                            NewJFrame.semaforoMax.acquire(1);
                            contador++;
                            newJFrame.iniDisp(Integer.toString(contador));
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                    }
                
            }
        }
    }
}
       
    public void producirCierra(){
        for(int i = 0; i <= newJFrame.num_prod4; i++){
            if(i == newJFrame.num_prod4){
                for(int f = 0; f < newJFrame.num_prod4; f++){
                    if(NewJFrame.semaforoCierra.availablePermits() > 0){
                        try {
                            NewJFrame.semaforoCierra.acquire(1);
                            NewJFrame.semaforoMax.acquire(1);
                            contador++;
                            newJFrame.cierreDisp(Integer.toString(contador));    
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                        }
                
            }
        }
    }
}
    public void producirGiro(){
        for(int i = 0; i <= newJFrame.num_prod5; i++){
            if(i == newJFrame.num_prod5){
                for(int f = 0; f < newJFrame.num_prod5; f++){
                    if(NewJFrame.semaforoGiro.availablePermits() > 0){
                        try {
                            NewJFrame.semaforoGiro.acquire(1);
                            NewJFrame.semaforoMax.acquire(1);
                            contador++;
                            newJFrame.plotDisp(Integer.toString(contador));
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                        }
                
            }
        }
    }
}
    public void ConstruirSerie(){
        if(cap_plot<4){
            cap_plot++;
            for(int i = 0; i <= newJFrame.num_ens; i++){
                    if(i == newJFrame.num_ens){
                    for(int f = 0; f < newJFrame.num_ens; f++){
                        if(NewJFrame.semaforoIntro.availablePermits() <= 29 && NewJFrame.semaforoCierra.availablePermits() <= 54 && NewJFrame.semaforoCredits.availablePermits() <= 23 
                            && NewJFrame.semaforoInicio.availablePermits() <= 49){
                        NewJFrame.semaforoIntro.release(1);
                        NewJFrame.semaforoCredits.release(1);
                        NewJFrame.semaforoInicio.release(1);
                        NewJFrame.semaforoCierra.release(1);
                        NewJFrame.semaforoGiro.release(1);
                        NewJFrame.semaforoMax.release(5);
                        contador_ens++;
                        newJFrame.capDisp(Integer.toString(contador_ens));
                        newJFrame.introDisp(Integer.toString(contador));
                        System.out.println(cap_plot);
                    } 
                    
                }
            }
        }
            
        } else {
            if(cap_plot == 4){
            for(int i = 0; i <= newJFrame.num_ens; i++){
                    if(i == newJFrame.num_ens){
                    for(int f = 0; f < newJFrame.num_ens; f++){
                        if(NewJFrame.semaforoIntro.availablePermits() <= 29 && NewJFrame.semaforoCierra.availablePermits() <= 54 && NewJFrame.semaforoCredits.availablePermits() <= 24 
                            && NewJFrame.semaforoInicio.availablePermits() <= 49 && NewJFrame.semaforoGiro.availablePermits() <= 39 ){
                        NewJFrame.semaforoIntro.release(1);
                        NewJFrame.semaforoCredits.release(1);
                        NewJFrame.semaforoInicio.release(1);
                        NewJFrame.semaforoCierra.release(1);
                        NewJFrame.semaforoGiro.release(1);
                        NewJFrame.semaforoMax.release(5);
                        contador_ens++;
                        cap_plot = 0;
                        newJFrame.capDisp(Integer.toString(contador_ens));
                        newJFrame.introDisp(Integer.toString(contador));
                        System.out.println(cap_plot);
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
                Thread.sleep(2000);
                producirInicio();
           } catch (InterruptedException ex) {
               Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
           }
           
        }
            for(int i = 0; i < num_prod4; i++){
               try {
                Thread.sleep(4000);
                producirCierra();
           } catch (InterruptedException ex) {
               Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
           }
           
        }
            for(int i = 0; i < num_prod5; i++){
               try {
                Thread.sleep(2000);
                producirGiro();
           } catch (InterruptedException ex) {
               Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
           }
           
        }
            for(int i = 0; i < num_ens; i++){
               try {
                   Thread.sleep(2000);
                   ConstruirSerie();
               } catch (InterruptedException ex) {
                   Logger.getLogger(Productores_GOT.class.getName()).log(Level.SEVERE, null, ex);
               }
                
            }
            
        }
               
    }
}




               

        
    

