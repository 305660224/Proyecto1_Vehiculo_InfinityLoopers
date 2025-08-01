/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemas;
import Sistemasdevehiculos.ControlPuertas;
import java.util.List;
/**
 *
 * @author isaac
 */
// une el sistema de alarma y las puertas a traves de esta class
public class SistemaAlarmaSeguridad{
    private Alarma alarma;
    private ControlPuertas controlPuertas;

    public SistemaAlarmaSeguridad (){
        this.alarma = new Alarma();
        this.controlPuertas = new ControlPuertas();
    }

    public boolean activarAlarma() {
        alarma.activarAlarma();
        return alarma.bloquearPuertas(); // da true si se bloqueo 
    }

    public boolean desactivarAlarma() {
        alarma.desactivarAlarma();
        return alarma.desbloquearPuertas(); // da true si se desbloqueo
    }

    public boolean abrirPuerta(int numeroPuerta) {
        if (!alarma.isPuertasBloqueadas()) {
            controlPuertas.abrirPuerta(numeroPuerta);
            return true;
        }
        return false; // 
    }

    public boolean cerrarPuerta(int numeroPuerta) {
        controlPuertas.cerrarPuerta(numeroPuerta);
        return true; 
    }


    public boolean isAlarmaActiva() {
        return alarma.isAlarmaActiva();
    }

    public boolean isPuertasBloqueadas() {
        return alarma.isPuertasBloqueadas();
    }

    public boolean isPuertaAbierta(int numeroPuerta) {
        return controlPuertas.esPuertaAbierta(numeroPuerta);
    }

    public int[] obtenerPuertasAbiertas() {
        return controlPuertas.obtenerPuertasAbiertas();
    }
}