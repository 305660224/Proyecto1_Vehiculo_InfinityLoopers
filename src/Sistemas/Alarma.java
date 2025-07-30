/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemas;

/**
 *
 * @author isaac
 */
    public class Alarma {
  private boolean estadoAlarma; // true = activada, false = desactivada
  private boolean puertasBloqueadas; // true = bloqueadas, false = abiertas

 public Alarma() {
        this.estadoAlarma = false;
        this.puertasBloqueadas = false;
    }

 public void activarAlarma() {
        estadoAlarma = true;
    }

  public void desactivarAlarma() {
        estadoAlarma = false;
    }

    public boolean bloquearPuertas() {
        if (!puertasBloqueadas) {
            puertasBloqueadas = true;
            return true;
        } else {
            return false;
        }
    }

    
    public boolean desbloquearPuertas() {
        if (!estadoAlarma) {
            puertasBloqueadas = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean isAlarmaActiva() {
        return estadoAlarma;
    }

    public boolean isPuertasBloqueadas() {
        return puertasBloqueadas;
    }
}
