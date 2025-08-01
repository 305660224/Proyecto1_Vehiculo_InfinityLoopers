/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemasdevehiculos;
 
/**
 *
 * @author UTN
 */
public class ControlCinturones {
    private boolean[] cinturones; 
    private static final int NUM_ASIENTOS = 4;
    private static final String[] NOMBRES_ASIENTOS = {"Conductor", "Pasajero 1", "Pasajero 2", "Pasajero 3"};
    
 public ControlCinturones() {
        this.cinturones = new boolean[NUM_ASIENTOS]; 
    }
    
public boolean estaCinturonPuesto(int asiento) {
        validarAsiento(asiento);
        return cinturones[asiento];
    }
    
public void colocarCinturon(int asiento) {
        validarAsiento(asiento);
        cinturones[asiento] = true;
    }
    
public void quitarCinturon(int asiento) {
        validarAsiento(asiento);
        cinturones[asiento] = false;
    }
    
public int[] obtenerCinturonesDesabrochados() {
      int contador = 0;
        for (boolean puesto : cinturones) {
            if (!puesto) contador++;
        }
        
        int[] resultado = new int[contador];
        int indice = 0;
        for (int i = 0; i < NUM_ASIENTOS; i++) {
            if (!cinturones[i]) {
                resultado[indice++] = i;
            }
        }
        return resultado;
    }
    
public String getEstado() {
    String resultado = "";
    for (int i = 0; i < NUM_ASIENTOS; i++) {
        resultado += NOMBRES_ASIENTOS[i] + ": " + 
                   (cinturones[i] ? "Abrochado" : "Desabrochado");
        if (i < NUM_ASIENTOS - 1) resultado += ", ";
    }
    return resultado;
}
private void validarAsiento(int asiento) {
        if (asiento < 0 || asiento >= NUM_ASIENTOS) {
            throw new IllegalArgumentException("Número de asiento inválido: " + asiento);
        }
    }
}
