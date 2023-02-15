/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;



import java.util.concurrent.Semaphore;

public class Productores_RickyMorty extends Thread {
    private final Semaphore espacioEnDrive;
    private final String tipoProductor;
    private final double costoHora;
    private final int cantidad;
    private final int limiteEspacioDrive;

    public Productores_RickyMorty(Semaphore espacioEnDrive, String tipoProductor, double costoHora, int cantidad, int limiteEspacioDrive) {
        this.espacioEnDrive = espacioEnDrive;
        this.tipoProductor = tipoProductor;
        this.costoHora = costoHora;
        this.cantidad = cantidad;
        this.limiteEspacioDrive = limiteEspacioDrive;
    }

    @Override
    public void run() {
        try {
            System.out.println(tipoProductor + " comienza su trabajo.");
            espacioEnDrive.acquire(limiteEspacioDrive);

            System.out.println(tipoProductor + " está produciendo " + cantidad + " partes de capítulo.");
            Thread.sleep(5000);

            System.out.println(tipoProductor + " ha terminado su trabajo.");
            espacioEnDrive.release(limiteEspacioDrive);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    
}
