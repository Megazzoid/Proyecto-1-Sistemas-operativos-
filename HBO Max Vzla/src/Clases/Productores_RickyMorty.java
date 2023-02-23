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
            
            producirIntroRyM();
            producirCreditosRyM();
            producirInicioRyM();
            producirCierreRyM();
            producirPlotRyM();
                    }
           
        
        }
    }
    


    

