/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemasdevehiculos;
 import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author UTN
 */
public class ControlCinturones {

    private boolean[] cinturones; 
    
    public ControlCinturones() {
        this.cinturones = new boolean[4]; 
    }
    
    public boolean estaCinturonPuesto(int asiento) {
        return (asiento >= 0 && asiento < 3) && cinturones[asiento];
    }
    
    public void colocarCinturon(int asiento) {
        if (asiento >= 0 && asiento < 3) {
            cinturones[asiento] = true;
        }
    }
    
    public void quitarCinturon(int asiento) {
        if (asiento >= 0 && asiento < 3) {
            cinturones[asiento] = false;
        }
    }
    
    public List<Integer> obtenerCinturonesDesabrochados() {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (!cinturones[i]) lista.add(i);
        }
        return lista;
    }
    
    public String getEstado() {
      String[] nombres = {"Conductor", "Pasajero 1", "Pasajero 2", "Pasajero 3"};
    String resultado = "";
    for (int i = 0; i < 3; i++) {
        resultado += nombres[i];
        resultado += ": ";
        if (cinturones[i]) {
            resultado += "Abrochado";
        } else {
            resultado += "Desabrochado";
        }
    }
    return resultado;
    }
}


