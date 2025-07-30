/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemasdevehiculos;
import Vehiculo.Motor;
/**
 *
 * @author UTN
 */
public class SistemaIluminacion {
    private boolean lucesBajasEncendidas;
    private boolean lucesAltasEncendidas;
    private boolean direccionalIzquierdaActiva;
    private boolean direccionalDerechaActiva;
    private boolean intermitentesEncendidos; 
    private boolean[] lucesPuertas;
    private final Motor motor;

    public SistemaIluminacion(Motor motor) {
        this.motor = motor;
        this.lucesBajasEncendidas = false;
        this.lucesAltasEncendidas = false;
        this.direccionalIzquierdaActiva = false;
        this.direccionalDerechaActiva = false;
        this.intermitentesEncendidos = false;
        this.lucesPuertas = new boolean[4];
    }

    
    /**
     * Enciende las luces delanteras bajas si el motor está encendido
     */
    public void encenderLucesBajas() {
        if (motor.getEstado()) {
            lucesBajasEncendidas = true;
        }
    }
    
    /**
     * Apaga las luces delanteras bajas
     */
    public void apagarLucesBajas() {
        lucesBajasEncendidas = false;
    }
    
    /*
     * Enciende las luces delanteras altas si el motor está encendido
     */
    public void encenderLucesAltas() {
        if (motor.getEstado()) {
            lucesAltasEncendidas = true;
        }
    }
    
    /**
     * Apaga las luces delanteras altas
     */
    public void apagarLucesAltas() {
        lucesAltasEncendidas = false;
    }
    
   
    /**
     * Enciende ambos intermitentes (luces de emergencia)
     */
    public void encenderIntermitentes() {
        intermitentesEncendidos = true;
        direccionalIzquierdaActiva = true;
        direccionalDerechaActiva = true;
    }
    
  
    public void apagarIntermitentes() {
        intermitentesEncendidos = false;
        direccionalIzquierdaActiva = false;
        direccionalDerechaActiva = false;
    }
    

    public void activarDireccionalIzquierda() {
        if (motor.getEstado() && !intermitentesEncendidos) {
            direccionalIzquierdaActiva = true;
        }
    }
    
    /**
     * Desactiva la direccional izquierda
     */
    public void desactivarDireccionalIzquierda() {
        if (!intermitentesEncendidos) {
            direccionalIzquierdaActiva = false;
        }
    }
    
    /**
     * Activa la direccional derecha si el motor está encendido
     */
    public void activarDireccionalDerecha() {
        if (motor.getEstado() && !intermitentesEncendidos) {
            direccionalDerechaActiva = true;
        }
    }
    
    /**
     * Desactiva la direccional derecha
     */
    public void desactivarDireccionalDerecha() {
        if (!intermitentesEncendidos) {
            direccionalDerechaActiva = false;
        }
    }
    
    
    /**
     * Enciende la luz de una puerta específica si el motor está encendido
     * @param numeroPuerta Número de puerta (0-3)
     */
    public void encenderLuzPuerta(int numeroPuerta) {
        if (motor.getEstado() && numeroPuerta >= 0 && numeroPuerta < lucesPuertas.length) {
            lucesPuertas[numeroPuerta] = true;
        }
    }
    
    /**
     * Apaga la luz de una puerta específica
     * @param numeroPuerta Número de puerta (0-3)
     */
    public void apagarLuzPuerta(int numeroPuerta) {
        if (numeroPuerta >= 0 && numeroPuerta < lucesPuertas.length) {
            lucesPuertas[numeroPuerta] = false;
        }
    }
    
    public boolean isLucesBajasEncendidas() {
        return lucesBajasEncendidas;
    }
    
    public boolean isLucesAltasEncendidas() {
        return lucesAltasEncendidas;
    }
    
    public boolean isIntermitentesEncendidos() {
        return intermitentesEncendidos;
    }
    
    public boolean isDireccionalIzquierdaActiva() {
        return direccionalIzquierdaActiva;
    }
    
    public boolean isDireccionalDerechaActiva() {
        return direccionalDerechaActiva;
    }
    
    public boolean isLuzPuertaEncendida(int numeroPuerta) {
        if (numeroPuerta >= 0 && numeroPuerta < lucesPuertas.length) {
            return lucesPuertas[numeroPuerta];
        }
        return false;
    
    
    }
}
   

