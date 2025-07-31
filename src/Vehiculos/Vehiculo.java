package Vehiculos;

import Vehiculos.Motores.Motor;
import Vehiculos.Tanques.Tanque;
import Vehiculos.Baterias.Bateria;
import Vehiculos.Transmisiones.Transmision;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author denis
 */
public class Vehiculo {
//ATRIBUTOS
    private Tanque tanque;
    private Motor motor;
    private Bateria bateria;
    private Transmision transmision;
    private EstadosVehiculo Estado; 
    private double Kilometraje;
    private int Velocimetro;
 
//METODOS GET
    public EstadosVehiculo getEstado() {
        return Estado;
    }

    public double getKilometraje() {
        return Kilometraje;
    }

    public int getVelocimetro() {
        return Velocimetro;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public Motor getMotor() {
        return motor;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Transmision getTransmision() {
        return transmision;
    }
    
    

//METOIDOS SET
    public void setEstado(EstadosVehiculo Estado) {
        this.Estado = Estado;
    }

    public void setKilometraje(double Kilometraje) {
        this.Kilometraje = Kilometraje;
    }


    public void setVelocimetro(int Velocimetro) {
        this.Velocimetro = Velocimetro;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

//CONSTRUCTOR
    public Vehiculo() {
        this.tanque = new Tanque();
        this.motor = new Motor();
        this.bateria = new Bateria();
        this.transmision = new Transmision();
        this.Estado = Estado.APAGADO;
        this.Kilometraje = 0;
        this.Velocimetro = 0;
    }


//OTROS
    //Timmer    
    Timer AumentarVelocidad = new Timer(200, new ActionListener() {
    public void actionPerformed(ActionEvent e) {
           Velocimetro = Velocimetro + 1;
           motor.CalcularRPMActual(Velocimetro, transmision.getVelocidadMaxMarcha().getVELOCIDADMAXMARCHA());
    }
    });
    
    Timer DisminuirVelocidad = new Timer(400, new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (Velocimetro <= 0) {
            Velocimetro =+ 1;
            DisminuirVelocidad.stop();
        }
           Velocimetro = Velocimetro - 1;
           
    }
    });
        
    Timer AumentarKilometraje = new Timer(500, new ActionListener() {
    public void actionPerformed(ActionEvent e) {
           Kilometraje = Kilometraje + (double)Velocimetro/3600;
    }
    });    
    
    Timer ConsumirGasolina = new Timer(5000, new ActionListener() {
    public void actionPerformed(ActionEvent e) {
           tanque.setEstado(motor.getTSConsumo() - tanque.getEstado());
    }
    });    
    
    Timer ConsumirBateria = new Timer(500, new ActionListener() {
    public void actionPerformed(ActionEvent e) {
           //PENDIENTE
    }
    });    
    
    //Metodos
    public void Acelerar(){
        if (Estado == EstadosVehiculo.MARCHA && Velocimetro <= transmision.getVelocidadMaxMarcha().getVELOCIDADMAXMARCHA()) {
        AumentarVelocidad.setDelay(100*transmision.getMarcha().getMARCHA());
        AumentarVelocidad.start();
        DisminuirVelocidad.stop();        
        }else{
            Velocimetro = transmision.getVelocidadMaxMarcha().getVELOCIDADMAXMARCHA();
        }
    }
    
    public void Frenar(){
        DisminuirVelocidad.setDelay(100);
        DisminuirVelocidad.start();
        AumentarVelocidad.stop();
    }
    
    public void Desacelerar(){
        DisminuirVelocidad.setDelay(400);
        DisminuirVelocidad.start();
        AumentarVelocidad.stop();
    }

    public void setConsumoGasolina(int ConsumoxSegundo){
        ConsumirGasolina.setDelay(ConsumoxSegundo);       
    }

    public void setApagar(){
        if (Velocimetro == 0) {
        Estado = EstadosVehiculo.APAGADO;
        ConsumirBateria.stop();
        ConsumirGasolina.stop();
        AumentarKilometraje.stop();
        AumentarVelocidad.stop();
        }
    }

    public void setIgnicion(){
        if (Velocimetro == 0) {
        Estado = EstadosVehiculo.IGNICION;
        ConsumirBateria.start();
        ConsumirGasolina.stop();
        AumentarKilometraje.stop();
        AumentarVelocidad.stop();
        }
    }

    public void setMarcha(){
        if (Velocimetro == 0) {
        Estado = EstadosVehiculo.MARCHA;
        ConsumirBateria.start();
        ConsumirGasolina.start();
        AumentarKilometraje.start();
        }
    }

}
