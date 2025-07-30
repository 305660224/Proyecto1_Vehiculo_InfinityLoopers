/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemas;
/**
 *
 * @author Isaac
 */
public class Limpiaparabrisas {
    private boolean estado; // true = encendido, false = apagado
    private int velocidad;  // 0 = apagado, 1 = baja, 2 = media, 3 = alta

   
    public Limpiaparabrisas(boolean estado, int velocidad) {
        if (velocidad >= 0 && velocidad <= 3 && estado) {
            this.estado = true;
            this.velocidad = velocidad;
        } else {
            this.estado = false;
            this.velocidad = 0;
        }
    }
    
    public void configurarVelocidadLimpiaparabrisas(int velocidad) {
        if (velocidad >= 0 && velocidad <= 3) {
            this.velocidad = velocidad;
            this.estado = (velocidad != 0);
        }
    }

    public boolean getEstado() {
        return estado;
    }
    
    public void setVelocidad(int velocidad) {
        configurarVelocidadLimpiaparabrisas(velocidad);
    }


    public int obtenerVelocidadLimpiaparabrisas() {
        return velocidad;
    }
}