/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemasdevehiculos;

/**
 *
 * @author UTN
 */
public class ControlPuertas {
    private static final int NUM_PUERTAS = 4;
    private boolean[] estadoPuertas; // true = abierta, false = cerrada
    
    public ControlPuertas() {
        estadoPuertas = new boolean[NUM_PUERTAS];
    }
    
    public void abrirPuerta(int numeroPuerta) {
        if (esNumeroValido(numeroPuerta)) {
            estadoPuertas[numeroPuerta - 1] = true;
        }
    }
    
    public void cerrarPuerta(int numeroPuerta) {
        if (esNumeroValido(numeroPuerta)) {
            estadoPuertas[numeroPuerta - 1] = false;
        }
    }
    
    public boolean esPuertaAbierta(int numeroPuerta) {
        return esNumeroValido(numeroPuerta) && estadoPuertas[numeroPuerta - 1];
    }
    
    public int[] obtenerPuertasAbiertas() {
        // Primero contamos cuántas están abiertas
        int contador = 0;
        for (boolean abierta : estadoPuertas) {
            if (abierta) contador++;
        }
        
        // Creamos array con el tamaño exacto
        int[] puertasAbiertas = new int[contador];
        int indice = 0;
        
        // Llenamos el array
        for (int i = 0; i < NUM_PUERTAS; i++) {
            if (estadoPuertas[i]) {
                puertasAbiertas[indice++] = i + 1; // +1 para número de puerta
            }
        }
        
        return puertasAbiertas;
    }
    
    public String getEstado() {
    String estado = "";
    for (int i = 1; i <= NUM_PUERTAS; i++) {
        estado += "Puerta " + i + ": " + (esPuertaAbierta(i) ? "Abierta" : "Cerrada") + "\n";
    }
    return estado;
}
    
    private boolean esNumeroValido(int numeroPuerta) {
        return numeroPuerta >= 1 && numeroPuerta <= NUM_PUERTAS;
    }
}



