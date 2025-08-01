package Vehiculos.Motores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author denis
 */
public class Motor {
//INICIALIZAR
    
//ATRIBUTOS
    private boolean Estado;
    private int RPM;
    private int RPMActual;
    
//METODOS GET
    public boolean getEstado() {
        return Estado;
    }

    public int getRPMActual() {
        return RPMActual;
    }

    public int getRPM() {
        return RPM;
    }  
    
//METODOS SET
    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public void setRPMActual(int RPMActual) {
        this.RPMActual = RPMActual;
    }

    public void setRPM(int RPM) {
        this.RPM = RPM;
    }
    
//CONSTRUCTOR
    public Motor() {
        this.Estado = false;
        this.RPM = 5715; 
        this.RPMActual = 0; //6750RPM, a los 40 segundos 4500RPM para cambio, 112.5RPS x 1s,
    }

//OTROS
    //Timers
        
    //Metodos
            
/**
 * Enciende el motor camiando su atributo "Estado" a true
 */        
    public void Encender() {
        Estado=true;
    }
    
/**
 * Apaga el motor camiando su atributo "Estado" a false
 */    
    public void Apagar() {
        Estado=false;
    }
    
/**
 * (PENDIENTE) Segun los KM/h actuales, los KM/h maximos segun cada Marcha y el RPM del Motor calcula y aumentan los RPM Actuales
 * @param RPM
 * @param KmHMax 
 * @param ActualKmMax 
 */    
    public double CalcularRPMActual(double Velocimetro, double VelocidadMaxMarcha) {
        return (Velocimetro/VelocidadMaxMarcha)*RPM;
    }
    
/**
 *(PENDIENTE) Segun las RPM actuales y si el motor esta encendido se calcula el consumo que requiere el motor
 * @param RPM
 * @param Estado
 * @return 
 */
    public double CalcularConsumo(double Kilometraje, double RPMActual) {      
        return (Kilometraje/100)+(RPMActual/10000);        
    }
      
    

    
    
}
