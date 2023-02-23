/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Interfaz.NewJFrame;



import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.concurrent.Semaphore;

public class Productores_RickyMorty extends Thread {
    Semaphore espacioEnDrive;
    String tipoProductor;
    int SalarioAcumulado;
    private NewJFrame newJFrame = NewJFrame.getInstance();
    int contador;
    private boolean pausar = false;
    int capituloplot = 0;
   

    public Productores_RickyMorty(Semaphore espacioEnDrive, String tipoProductor) {
        this.espacioEnDrive = espacioEnDrive;
        this.tipoProductor = tipoProductor;
        
    }
    
    public void pausar(){
        this.pausar = true;
    }
    
    
    public void reanudar(){
        this.pausar = false;
    }
    
   public String VerTipo(){
       return tipoProductor;
   }
   
   public void CambiarTipo(String Tipo){
       
       if (tipoProductor == "Intro") {
           if(Main.CantidadProductoresIntro>1){
               Main.CantidadProductoresIntro--;
           }
           else{
               if(Tipo == "Intro"){
                  System.out.println("");
               }
               else{
                 return;  
               }
               
           }
       
        }else if(tipoProductor =="Inicio"){
              if(Main.CantidadProductoresInicio>1){
                   Main.CantidadProductoresInicio--;
              }
              else{
                    if(Tipo == "Inicio"){
                         System.out.println("");
               }
                     else{
                         return;  
               }
               
           
           } 
        }else if(tipoProductor =="Creditos"){
            if(Main.CantidadProductoresCreditos>1){
               Main.CantidadProductoresCreditos--;
            }
            else{
               if(Tipo == "Creditos"){
                  System.out.println("");
               }
               else{
                 return;  
               }
           }
        }
        else if(tipoProductor == "Cierre") {
            if(Main.CantidadProductoresCierre > 1){
            Main.CantidadProductoresCierre--;
            }
            else{
               if(Tipo == "Cierre"){
                  System.out.println("");
               }
               else{
                 return;  
               }
           }
        }
        else if(tipoProductor == "Plot"){
            if (Main.CantidadProductoresplot >1){
                Main.CantidadProductoresplot--;
            }
            else{
               if(Tipo == "Plot"){
                  System.out.println("");
               }
               else{
                 return;  
               }
           }
        }
        else if(tipoProductor == "Ensamblador"){
            if (Main.CantidadProductoresEmsamblador >1){
                Main.CantidadProductoresEmsamblador--;
            }
            else{
               if(Tipo == "Ensamblador"){
                  System.out.println("");
               }
               else{
                 return;  
               }
           }    
       }
       
       tipoProductor = Tipo;
       
       if (tipoProductor == "Intro") {
           Main.CantidadProductoresIntro++;
       }else if(tipoProductor =="Inicio"){
           Main.CantidadProductoresInicio++;
       }else if(tipoProductor =="Cierre"){
           Main.CantidadProductoresCierre++;
       }else if(tipoProductor =="Cirre"){
           Main.CantidadProductoresCierre++;
       }else if(tipoProductor =="Plot"){
           Main.CantidadProductoresplot++;
       }else if(tipoProductor =="Creditos"){
           Main.CantidadProductoresCreditos++;
       }
       else if(tipoProductor == "Ensamblador"){
           Main.CantidadProductoresEmsamblador++;
                   
       }
       
       
       
   }
   
   public void emsamblar(){
       if (tipoProductor.equals("Ensamblador")) {
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
                                java.util.logging.Logger.getLogger(Productores_GOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                                java.util.logging.Logger.getLogger(Productores_GOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                            }

            }

            }
       }
   }
    
    public void producirIntroRyM(){
        if (tipoProductor.equals("Intro")) {
        if(Main.semaforoIntroRickYmorty.availablePermits() > 0){
               try {
                    Thread.sleep(1000);
                            Main.semaforoIntroRickYmorty.acquire(1);
                            
                            Main.GastoRyM = Main.GastoRyM + 120;
                            
                            contador = 30 - Main.semaforoIntroRickYmorty.availablePermits();
                            
                            newJFrame.getintroDisponibleRym(Integer.toString(contador));
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
                            Main.GastoRyM = Main.GastoRyM + 72;
                            
                            contador = 25 - Main.semaforoCreditsRickyMorty.availablePermits();
                            
                            newJFrame.getCreditoDisponibleRym(Integer.toString(contador));
                            
                            
                            } catch (InterruptedException ex) {
                                 java.util.logging.Logger.getLogger(Productores_GOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                            }
                    }
    
        }
    }
    
        
    
    public void producirInicioRyM(){
        if (tipoProductor.equals("Inicio")) {
        if(Main.semaforoInicioRickyMorty.availablePermits() > 1){
               try {
                    Thread.sleep(2000);
                            Main.semaforoInicioRickyMorty.acquire(1);
                        
                            Main.GastoRyM = Main.GastoRyM + 336;
                            
                            newJFrame.getinicioDisponibleRym(Integer.toString(50 - Main.semaforoInicioRickyMorty.availablePermits()));
                            } catch (InterruptedException ex) {
                                 java.util.logging.Logger.getLogger(Productores_GOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                            }
                    }
    
        }
    } 
    public void producirCierreRyM(){
        if (tipoProductor.equals("Cierre")) {
        if(Main.semaforoCierreRickyMorty.availablePermits() > 1){
               try {
                    Thread.sleep(4000);
                            Main.semaforoCierreRickyMorty.acquire(1);
                            
                            Main.GastoRyM = Main.GastoRyM + 720;
                            
                            contador = 55 - Main.semaforoCierreRickyMorty.availablePermits();
                            
                            newJFrame.getfinalDisponibleRym(Integer.toString(contador));
                            
                      
                          
                            } catch (InterruptedException ex) {
                                 java.util.logging.Logger.getLogger(Productores_GOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                            }
                    }
    
        }
    }  
    
    public void producirPlotRyM(){
        if (tipoProductor.equals("Plot")) {
        if(Main.semaforoPlotRickyMorty.availablePermits() > 1){
               try {
                    Thread.sleep(2000);
                            Main.semaforoPlotRickyMorty.acquire(1);
                            
                            Main.GastoRyM = Main.GastoRyM + 480;
                            
                            contador = 40 - Main.semaforoPlotRickyMorty.availablePermits();
                            
                            newJFrame.getPlotDisponibleRym(Integer.toString(contador));
                            } catch (InterruptedException ex) {
                                 java.util.logging.Logger.getLogger(Productores_GOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                            }
                    }
    
        }
    }  
    
    
    @Override
    public void run() {
        while(true){
            synchronized(this){
            while(pausar==true){
                    System.out.println("");
                }    
            }
            
            producirIntroRyM();
            producirCreditosRyM();
            producirInicioRyM();
            producirCierreRyM();
            producirPlotRyM();
            emsamblar();
                    }
           
        
        }
    }
    


    

