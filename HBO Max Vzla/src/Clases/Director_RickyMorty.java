/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaz.NewJFrame;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author kevin
 */
public class Director_RickyMorty extends Thread {
   
    int random = 0;
    int random2 = 0;
    int tiempo = 1000;
    int hora = 41;
    int horasvigilando = 0;
    int horasrestantes = 0;
    private NewJFrame newJFrame = NewJFrame.getInstance();
    int audencia = 0;
    int ganancia = 0;
    private boolean pausar = false;
    
    
    
    public void pausar(){
        pausar = true;
    }
    
    
    public void reanudar(){
        pausar = false;
    }
    
    @Override
    public void run() {
        while(true){
            
            synchronized(this){
            while(pausar==true){
                    System.out.println("");
                }    
            }  
            
            try {
            // Adquirir el semáforo del contador de días (Countdown)
            
             if (Main.remainingDays > 0) {
                 Main.LeerRickyMorty.acquire();
                 Main.LeerRickyMorty.release();
            }
             else{
                 Main.remainingDays = Main.diasporlote;
                 newJFrame.DiaRyM(Integer.toString(Main.remainingDays));
                 newJFrame.SalarioMensual(Integer.toString(Main.GastoRyM));
                 
                 Main.seriesultimolote = Main.capitulosPlotRym + Main.capituloslistosRym;
                 
                 newJFrame.LoteRyM(Integer.toString(Main.seriesultimolote));
                 
                 
                 audencia = Main.seriesultimolote * 1000000;
                 newJFrame.AudenciaPorLote(Integer.toString(audencia));
                 ganancia = audencia / 150000;
                 ganancia = ganancia * 100000;
                 
                 newJFrame.GananciaRyM(Integer.toString(ganancia));
                 
                 
                 
                 Main.capitulosPlotRym = 0;
                 Main.capituloslistosRym = 0;
                 
                 newJFrame.getCapituloPlotRyM(Integer.toString(Main.capitulosPlotRym));
                 newJFrame.getCapituloRyM(Integer.toString(Main.capituloslistosRym));
                 
                 Main.GastoRyM = 0;
                 
             }
            
             Random rand = new Random();
             random = rand.nextInt(43)+20;
 
             
             random2 = rand.nextInt(247) + 492;
             
             horasvigilando = random2+random;
             horasrestantes = tiempo - (horasvigilando);
             
             Thread.sleep(random2);
             
             newJFrame.DirectorRyM("Vigilando");
             Thread.sleep(random);
             
             if (Main.hiloRym12.ViendoRick = true){
                 Main.hiloRym12.salario--; 
                 if(Main.hiloRym12.salario >= 0) {
                 newJFrame.SalarioPMRyM(Integer.toString(Main.hiloRym12.salario));
             }
             }
             
             newJFrame.DirectorRyM("Nada");
             Thread.sleep(random);
             
            
             
             Thread.sleep(horasrestantes);
             
             
                     
 
             
             
             
             
                
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            
        }
        
    }
    
}
