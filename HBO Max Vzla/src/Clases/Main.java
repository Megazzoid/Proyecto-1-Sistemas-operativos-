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
 * @author kevin
 */
public class Main {
    
    public static Semaphore semaforoMax = new Semaphore(200);
    public static Semaphore semaforoIntro = new Semaphore(30);
    public static Semaphore semaforoCredits = new Semaphore(25);
    public static Semaphore semaforoInicio = new Semaphore(50);
    public static Semaphore semaforoCierra = new Semaphore(55);
    public static Semaphore semaforoGiro = new Semaphore(40);
    
    public static Productores_GOT hilo1;
    public static Productores_GOT hilo2;
    public static Productores_GOT hilo3;
    public static Productores_GOT hilo4;
    public static Productores_GOT hilo5;
    public static Productores_GOT hilo6;
    
    public static volatile int numero = 30;
    public static volatile int numero2 = 25;
    public static volatile int numero3 = 50;
    public static volatile int numero4 = 55;
    public static volatile int numero5 = 40;
    public static boolean check = true;
    public static int productor = 2;
    
    // el semaforo de rick y morty
    
    public static Semaphore semaforoIntroRickYmorty = new Semaphore(30);
    public static Semaphore semaforoCreditsRickyMorty = new Semaphore(25);
    public static Semaphore semaforoInicioRickyMorty = new Semaphore(50);
    public static Semaphore semaforoCierreRickyMorty = new Semaphore(55);
    public static Semaphore semaforoPlotRickyMorty = new Semaphore(40);
    public static Semaphore semaforoEmsamblador = new Semaphore(1);
    public static Semaphore ProjectManagerRickYmorty = new Semaphore(1);
    public static Semaphore LeerRickyMorty = new Semaphore(1);
    
    
    public static Productores_RickyMorty hiloRym1;
    public static Productores_RickyMorty hiloRym2;
    public static Productores_RickyMorty hiloRym3;
    public static Productores_RickyMorty hiloRym4;
    public static Productores_RickyMorty hiloRym5;
    public static Productores_RickyMorty hiloRym6;
    public static Productores_RickyMorty hiloRym7;
    public static Productores_RickyMorty hiloRym8;
    public static Productores_RickyMorty hiloRym9;
    public static Productores_RickyMorty hiloRym10;

    public static ProjectManager_RickyMorty hiloRym12;
    public static Director_RickyMorty hiloRym13;
    public static int capituloslistosRym = 0;
    public static int capitulosPlotRym = 0;
    public static int TotalDays = 30;
    public static int remainingDays = TotalDays;
    public static int GastoRyM = 0;
    public static int seriesultimolote = 0;
    public static int CantidadProductoresInicio = 3;
    public static int CantidadProductoresCreditos = 1;
    public static int CantidadProductoresCierre = 2;
    public static int CantidadProductoresplot = 1;
    public static int CantidadProductoresIntro = 2;
    public static int CantidadProductoresEmsamblador = 1;
    
                    
    public static void main(String[] args) {

        hilo1 = new Productores_GOT(semaforoMax, "intro");
        hilo2 = new Productores_GOT(semaforoMax, "Creditos");
        hilo3 = new Productores_GOT(semaforoMax, "Inicio");
        hilo4 = new Productores_GOT(semaforoMax, "cierre");
        hilo5 = new Productores_GOT(semaforoMax, "giro chido");
        hilo6 = new Productores_GOT(semaforoMax, "giro chido");
        
        hilo1.Productores(3);
        hilo2.Productores2(2);
        hilo3.Productores3(1);
        hilo4.Productores4(2);
        hilo5.Productores5(2);
        hilo6.ProductoresEnsambladores(2);
        
        
        hiloRym1 = new Productores_RickyMorty(semaforoIntroRickYmorty, "Intro");
        hiloRym2 = new Productores_RickyMorty(semaforoIntroRickYmorty, "Intro");
        hiloRym3 = new Productores_RickyMorty(semaforoIntroRickYmorty, "Creditos");
        hiloRym4 = new Productores_RickyMorty(semaforoIntroRickYmorty, "Inicio");
        hiloRym5 = new Productores_RickyMorty(semaforoIntroRickYmorty, "Inicio");
        hiloRym6 = new Productores_RickyMorty(semaforoIntroRickYmorty, "Inicio");
        hiloRym7 = new Productores_RickyMorty(semaforoIntroRickYmorty, "Cierre");
        hiloRym8 = new Productores_RickyMorty(semaforoIntroRickYmorty, "Cierre");
        hiloRym9 = new Productores_RickyMorty(semaforoIntroRickYmorty, "Emsamblador");
        hiloRym10 = new Productores_RickyMorty(semaforoIntroRickYmorty, "Plot");
        hiloRym12 = new ProjectManager_RickyMorty();
        hiloRym13 = new Director_RickyMorty();
        
       
        
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
        
       
        
        
        
    }
    public static void Iniciar(){
        hiloRym1.start();
        hiloRym2.start();
        hiloRym3.start();
        hiloRym4.start();
        hiloRym5.start();
        hiloRym6.start();
        hiloRym7.start();
        hiloRym8.start();
        hiloRym9.start();
        hiloRym10.start();
        hiloRym12.start();
        hiloRym13.start();
        
    }
    
     public static void Pausar(){
        hiloRym1.pausar();
        hiloRym2.pausar();
        hiloRym3.pausar();
        hiloRym4.pausar();
        hiloRym5.pausar();
        hiloRym6.pausar();
        hiloRym7.pausar();
        hiloRym8.pausar();
        hiloRym9.pausar();
        hiloRym10.pausar();
        hiloRym12.pausar();
        hiloRym13.pausar();
        
    }
     
     public static void Reanudar(){
        hiloRym1.reanudar();
        hiloRym2.reanudar();
        hiloRym3.reanudar();
        hiloRym4.reanudar();
        hiloRym5.reanudar();
        hiloRym6.reanudar();
        hiloRym7.reanudar();
        hiloRym8.reanudar();
        hiloRym9.reanudar();
        hiloRym10.reanudar();
        hiloRym12.reanudar();
        hiloRym13.reanudar();
        
    }
}


        


       
