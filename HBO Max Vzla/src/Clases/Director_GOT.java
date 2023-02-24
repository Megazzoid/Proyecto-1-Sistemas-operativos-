/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaz.NewJFrame;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danma
 */
public class Director_GOT extends Thread {
    
    private NewJFrame newJFrame = NewJFrame.getInstance();
    int Dia = 1000;
    int hora = 42;
    int random = 0;
    int random2 = 0;
    int salario = 7*1000; 
    
    public void run(){
        while (true){
             if (Main.Dias > 0){
                 try {
                     Main.RickMorty.acquire();
                     Main.RickMorty.release();

                 } catch (InterruptedException ex) {
                     Logger.getLogger(Director_GOT.class.getName()).log(Level.SEVERE, null, ex);
                 }
                
             } else {
                 
                 newJFrame.DirectorGOT(Integer.toString(Main.salarioDirector));
                 
                 
                 
                 
                 
             }
        }
    }
    
}
