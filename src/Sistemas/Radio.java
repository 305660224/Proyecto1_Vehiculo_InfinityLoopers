/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemas;
/**
 *
 * @author isaac
 */
public class Radio {
    private boolean encendida;
    private double frecuencia;
    private String modo; 
    private int volumen;
    private String cancionActual;
    private boolean reproduciendo;

    public Radio() {
        this.encendida = false;
        this.frecuencia = 69.0;
        this.modo = "FM";
        this.volumen = 5; 

        this.cancionActual = null;
        this.reproduciendo = false;
    }

    public void encenderRadio() {
        encendida = true;
    }

    public void apagarRadio() {
        encendida = false;
        reproducirPausarReset();
    }

    public void cambiarEstacion(double frecuencia) {
        if (encendida && (modo.equals("AM") || modo.equals("FM"))) {
            this.frecuencia = frecuencia;
        }
    }

    public void cambiarModo(String modo) {
        if (modo.equalsIgnoreCase("AM") || modo.equalsIgnoreCase("FM") || modo.equalsIgnoreCase("Bluetooth")) {
            this.modo = modo;
            reproducirPausarReset();
        }
    }

    public void subirVolumen() {
        if (volumen < 10) {
            volumen++;
        }
    }

    public void bajarVolumen() {
        if (volumen > 0) {
            volumen--;
        }
    }

    public void setCancion(String cancion) {
        this.cancionActual = cancion;
    }

    public void reproducir() {
        if (modo.equalsIgnoreCase("Bluetooth") && cancionActual != null) {
            reproduciendo = true;
        }
    }

    public void pausar() {
        if (modo.equalsIgnoreCase("Bluetooth") && reproduciendo) {
            reproduciendo = false;
        }
    }

    public String getCancionActual() {
        return cancionActual;
    }

    public boolean isReproduciendo() {
        return reproduciendo;
    }

    private void reproducirPausarReset() {
        reproduciendo = false;
        cancionActual = null;
    }
}
