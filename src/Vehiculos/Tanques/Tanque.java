package Vehiculos.Tanques;

import GUI.Sonido;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.Clip;
import javax.swing.Timer;

/**
 *
 * @author denis
 */
public class Tanque {
    
//INCIALIZAR
    Clip GasolinaBaja = Sonido.Crear("D:\\USB-DENISEEM\\temp\\Proyecto Proga\\Proyecto1_Vehiculo_InfinityLoopers\\src\\GUI\\Sonidos\\Low_Gasoline.wav");
//ATRIBUT0S
    private double Estado;
//METODOS GET
    public double getEstado() {
        return Estado;
    }
//METODOS SET
    public void setEstado(double Estado) {
        this.Estado = Estado;
    }
//COSNTRUCTOR
    public Tanque() {
        this.Estado = 100;
    }
    
//OTROS        
    //Timers        
    
        Timer Advertencia = new Timer(500, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           Sonido.Iniciar(GasolinaBaja, 0);
    }
    });
    
    //Metodos
    public void LlenarTanque() {
        if (AdvertirGasolinaBaja(Estado)) {
            Estado=100;
            Advertencia.stop();
        }
    }

    public boolean AdvertirGasolinaBaja(double Gasolina) {
        if (Gasolina < 30) {
            Advertencia.start();
            return true;
        } else {
            Advertencia.stop();
        }
        return false;
    }
}
