package Vehiculo;

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
    private double TSConsumo;
    
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

    public double getTSConsumo() {
        return TSConsumo;
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

    public void setTSConsumo(double TSConsumo) {
        this.TSConsumo = TSConsumo;
    }
    
//CONSTRUCTOR
    public Motor(int RPM) {
        this.Estado = false;
        this.RPM = RPM; 
        this.RPMActual = 0; //6750RPM, a los 40 segundos 4500RPM para cambio, 112.5RPS x 1s,
        this.TSConsumo = 0;
    }

//OTROS
    //Timers
    
            Timer AumentarRPM = new Timer(500, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           
    }
    });
    
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
    public void AumentarRPMActual(int RPM, int KmHMax, int ActualKmMax) {
        
    }
    
/**
 *(PENDIENTE) Segun las RPM actuales y si el motor esta encendido se calcula el consumo que requiere el motor
 * @param RPM
 * @param Estado
 * @return 
 */
    public double CalcularConsumo(int RPM, boolean Estado) {
       
        return 0;
    }
      
    

    
    
}
