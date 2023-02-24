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
 * @author danma
 */
public class Director_GOT extends Thread {
    
    private NewJFrame newJFrame = NewJFrame.getInstance();
    int Dia = 1000;
    int hora = 42;
    int random = 0;
    int random2 = 0;
    int salario = 30*100; 
    int ganancias = 0;
    int audiencia = 0;
    int vigilar = 0;
    int descansar = 0;
    
    @Override
    public void run(){
        while (true){
             if (Main.Dias > 0){
                 try {
                     Main.RickMorty.acquire();
                     Main.RickMorty.release();
                     newJFrame.DirectorGOT(Integer.toString(salario));

                 } catch (InterruptedException ex) {
                     Logger.getLogger(Director_GOT.class.getName()).log(Level.SEVERE, null, ex);
                 }
                
             } else {
                 
                 Main.audienciaGOT = Main.capNormal + Main.capPlot;
                 audiencia = Main.audienciaGOT * 980000;
                 ganancias = audiencia / 150000;
                 ganancias = ganancias * 100000;
                 newJFrame.Ganancias(Integer.toString(ganancias));
                 newJFrame.capDisp(Integer.toString(Main.capNormal));
                 newJFrame.capPlot(Integer.toString(Main.capPlot));
                 
            
             }
              Random rad = new Random();
              random = rad.nextInt(43) + 20;
              random = rad.nextInt(247)+492;
              
              vigilar = random+random2;
              descansar = Dia - (vigilar);
              
            try {
                Thread.sleep(random2);
                newJFrame.directorvago("Vigilando");
                Thread.sleep(random);
                
                if (Main.hilo7.watchea = true){
                    Main.hilo7.salario--;
                    if(Main.hilo7.salario >= 0 ){
                        newJFrame.sueldoGOT(Integer.toString(Main.hilo7.salario));
                    }
                }
                
                newJFrame.directorvago("Nada");
                Thread.sleep(random);
                Thread.sleep(descansar);
            } catch (InterruptedException ex) {
                Logger.getLogger(Director_GOT.class.getName()).log(Level.SEVERE, null, ex);
            }
              
        }
    }
    
}
