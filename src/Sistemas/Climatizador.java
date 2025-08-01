/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemas;
/**
 *
 * @author isaac
 */
public class Climatizador {
    private double temperaturaDeseada;
    private int velocidadVentilador; //de 0 a 5
    private boolean aireAcondicionadoEncendido;
    private boolean calefaccionEncendida;

    public Climatizador() {
        this.temperaturaDeseada = 22.0; 
        this.velocidadVentilador = 0;
        this.aireAcondicionadoEncendido = false;
        this.calefaccionEncendida = false;
    }

        public double getTemperaturaDeseada() {
        return temperaturaDeseada;
    }

    public int getVelocidadVentilador() {
        return velocidadVentilador;
    }
//********************************************************
    public boolean isACEncendido() {
        return aireAcondicionadoEncendido;
    }

    public boolean isCalefaccionEncendida() {
        return calefaccionEncendida;
    }
    
    public void setTemperatura(double grados) {
        this.temperaturaDeseada = grados;
    }

    public void setVelocidadVentilador(int nivel) {
        if (nivel >= 0 && nivel <= 5) {
            this.velocidadVentilador = nivel;
        }
    }
//**************************************************************
    public void activarAC() {
        aireAcondicionadoEncendido = true;
        calefaccionEncendida = false; 
    }

    public void desactivarAC() {
        aireAcondicionadoEncendido = false;
    }

    public void activarCalefaccion() {
        calefaccionEncendida = true;
        aireAcondicionadoEncendido = false; 
    }

    public void desactivarCalefaccion() {
        calefaccionEncendida = false;
    }
}