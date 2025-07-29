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
public class ControlCinturones {

    private boolean[] cinturones; // 0: Conductor, 1-3: Pasajeros
    
    public ControlCinturones() {
        this.cinturones = new boolean[4]; // Todos desabrochados inicialmente
    }
    
    public boolean estaCinturonPuesto(int asiento) {
        return (asiento >= 0 && asiento < 4) && cinturones[asiento];
    }
    
    public void colocarCinturon(int asiento) {
        if (asiento >= 0 && asiento < 4) {
            cinturones[asiento] = true;
        }
    }
    
    public void quitarCinturon(int asiento) {
        if (asiento >= 0 && asiento < 4) {
            cinturones[asiento] = false;
        }
    }
    
    public List<Integer> obtenerCinturonesDesabrochados() {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if (!cinturones[i]) lista.add(i);
        }
        return lista;
    }
    
    public String getEstado() {
      String[] nombres = {"Conductor", "Pasajero 1", "Pasajero 2", "Pasajero 3"};
    String resultado = "";
    for (int i = 0; i < 4; i++) {
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


