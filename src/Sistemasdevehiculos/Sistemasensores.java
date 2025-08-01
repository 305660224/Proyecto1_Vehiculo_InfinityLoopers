/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemasdevehiculos;
import Vehiculos.Baterias.Bateria;
/**
 *
 * @author UTN
 */
public class Sistemasensores {
    private boolean frenoManoActivado;
    private boolean obstaculoDetectado;
    private boolean alarmaActiva;
    private final Bateria bateria;
    

    public Sistemasensores(Bateria bateria) {
        this.frenoManoActivado = true;
        this.obstaculoDetectado = false;
        this.alarmaActiva = false;
        this.bateria = bateria;
    }
      private boolean tieneEnergia() {
        return bateria.getCarga() > 0;
    }
    

    public void activarFrenoMano() {
        if(tieneEnergia()) {
            frenoManoActivado = true;
            consumirEnergia(0.5);
            verificarEstado();
        }
    }
    
    public void desactivarFrenoMano() {
        if(tieneEnergia()) {
            frenoManoActivado = false;
            consumirEnergia(0.5);
            verificarEstado();
        }
    }
    
    public void detectarObstaculo() {
        if(tieneEnergia()) {
            obstaculoDetectado = true;
            consumirEnergia(1.0);
            verificarEstado();
        }
    }
    
    public void limpiarObstaculo() {
        obstaculoDetectado = false;
        verificarEstado();
    }
    
    // Métodos de apoyo
    private void verificarEstado() {
        if(!tieneEnergia()) {
            System.out.println("Sistema sin energía!");
            return;
        }if(frenoManoActivado && obstaculoDetectado) {
            activarAlarma("¡Peligro! Obstáculo con freno activado", 2.0);
        }else if(frenoManoActivado) {
            activarAlarma("Advertencia: Freno de mano activado", 1.0);
        }else if(obstaculoDetectado) {
            activarAlarma("Cuidado: Obstáculo detectado", 1.0);
        }else {
            desactivarAlarma();
        }
    }
    
    private void activarAlarma(String mensaje, double consumo) {
        if(!alarmaActiva) {
            alarmaActiva = true;
            consumirEnergia(consumo);
            System.out.println(mensaje + " | Batería: " + bateria.getCarga() + "%");
        }
    }
    
    private void desactivarAlarma() {
        if(alarmaActiva) {
            alarmaActiva = false;
            System.out.println("Alarma desactivada | Batería: " + bateria.getCarga() + "%");
        }
    }
    
    private void consumirEnergia(double cantidad) {
        double nuevaCarga = bateria.getCarga() - cantidad;
        bateria.setCarga(nuevaCarga);
    }
}


