/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;
 import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author UTN
 */
public class ControlPuertas {
  
    private boolean[] puertasAbiertas; //
    
    public ControlPuertas() {
        puertasAbiertas = new boolean[4]; 
    }
    
 
    public void abrirPuerta(int numeroPuerta) {
        int puerta = numeroPuerta - 1;
        if (puerta >= 0 && puerta < puertasAbiertas.length) {
            puertasAbiertas[puerta] = true;
        }
    }
    
   
    public void cerrarPuerta(int numeroPuerta) {
        int puertas = numeroPuerta - 1;
        if (puertas >= 0 && puertas < puertasAbiertas.length) {
            puertasAbiertas[puertas] = false;
        }
    }
    
  
    public boolean esPuertaAbierta(int numeroPuerta) {
        int put = numeroPuerta - 1;
        if (put >= 0 && put < puertasAbiertas.length) {
            return puertasAbiertas[put];
        }
        return false;
    }
   
    public List<Integer> obtenerPuertasAbiertas() {
        List<Integer> abiertas = new ArrayList<>();
        for (int i = 0; i < puertasAbiertas.length; i++) {
            if (puertasAbiertas[i]) {
                abiertas.add(i + 1); 
            }
        }
        return abiertas;
    }
    
    public String getEstado() {
    String resultado = "";
    for (int i = 0; i < puertasAbiertas.length; i++) {
        resultado += "Puerta " + (i + 1) + ": " + 
                    (puertasAbiertas[i] ? "Abierta" : "Cerrada") + "\n";
    }
    return resultado;
}
}


