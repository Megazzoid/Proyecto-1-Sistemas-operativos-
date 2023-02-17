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
    
    Semaphore espacioEnDriveRickyMorty = new Semaphore(150);
    
    // Crea los productores de rick y morty
    
                    
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
        
        //Productor_RickyMorty intro = new Productor_RickyMorty("intro", 5, 30, 1, semaphore);
        //Productor_RickyMorty creditos = new Productor_RickyMorty("créditos", 3, 25, 4, semaphore);
        //Productor_RickyMorty inicio = new Productor_RickyMorty("inicio", 7, 50, 1, semaphore);
        //Productor_RickyMorty cierre = new Productor_RickyMorty("cierre", 7.5, 55, 1, semaphore);
        //Productor_RickyMorty plotTwist = new Productor_RickyMorty("plot twist", 10, 40, 1, semaphore);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
        
    }

}


        


       
