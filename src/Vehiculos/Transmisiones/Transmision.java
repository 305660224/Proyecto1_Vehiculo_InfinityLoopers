package Vehiculos.Transmisiones;
import GUI.Sonido;
import javax.sound.sampled.Clip;
/**
 *
 * @author denis
 */
public class Transmision {      
//INICIALIZAR
    Clip PresionarEmbrague = Sonido.Crear("D:\\USB-DENISEEM\\temp\\Proyecto Proga\\Proyecto1_Vehiculo_InfinityLoopers\\src\\GUI\\Sonidos\\Clutch_Pressed.wav");
    Clip SoltarEmbrague = Sonido.Crear("D:\\USB-DENISEEM\\temp\\Proyecto Proga\\Proyecto1_Vehiculo_InfinityLoopers\\src\\GUI\\Sonidos\\Clutch_Released.wav");

//ATRIBUTOS    
    private boolean Embrague;
    private EstadosMarcha Marcha;
    private VelocidadesMaximas VelocidadMaxMarcha;

//METODOS GET
    public boolean isEmbrague() {
        return Embrague;
    }

    public EstadosMarcha getMarcha() {
        return Marcha;
    }

    public VelocidadesMaximas getVelocidadMaxMarcha() {
        return VelocidadMaxMarcha;
    }
    
//METODOS SET
    public void setEmbrague(boolean Embrague) {
        this.Embrague = Embrague;
    }

    public void setMarcha(EstadosMarcha Marcha) {
        this.Marcha = Marcha;
    }

    public void setVelocidadMaxMarcha(VelocidadesMaximas VelocidadMaxMarcha) {
        this.VelocidadMaxMarcha = VelocidadMaxMarcha;
    }
    
//CONSTRUCTOR

    public Transmision() {
        this.Embrague = false;
        this.Marcha = Marcha.NEUTRO;
        this.VelocidadMaxMarcha = VelocidadMaxMarcha.NEUTRO;
    }

    
//OTROS
    //Timmers
    
    //Metodos
    public void SoltarEmbrague() {        
        Embrague = false;
    }
    
    public void PresionarEmbrague(){
        Embrague = true;
    }
    
    public void setNeutro (){
        if (Embrague && Marcha.getMARCHA()-1 == 0 || Marcha.getMARCHA()+1 == 7) {
        Marcha = EstadosMarcha.NEUTRO;
        VelocidadMaxMarcha = VelocidadesMaximas.NEUTRO;
        }
    }
    
    public void setMarcha1 (){
        if (Embrague && Marcha.getMARCHA()+1 == 1 || Marcha.getMARCHA()-1 == 1) {
        Marcha = EstadosMarcha.MARCHA1;
        VelocidadMaxMarcha = VelocidadesMaximas.KmH20;
        }
    }
    
    public void setMarcha2 (){
        if (Embrague && Marcha.getMARCHA()+1 == 2 || Marcha.getMARCHA()-1 == 2) {
        Marcha = EstadosMarcha.MARCHA2;
        VelocidadMaxMarcha = VelocidadesMaximas.KmH40;
        }
    }
    
    public void setMarcha3 (){
        if (Embrague && Marcha.getMARCHA()+1 == 3 || Marcha.getMARCHA()-1 == 3) {
        Marcha = EstadosMarcha.MARCHA3;
        VelocidadMaxMarcha = VelocidadesMaximas.KmH60;
        }       
    }
    
    public void setMarcha4 (){
        if (Embrague && Marcha.getMARCHA()+1 == 4 || Marcha.getMARCHA()-1 == 4) {
        Marcha = EstadosMarcha.MARCHA4;
        VelocidadMaxMarcha = VelocidadesMaximas.KmH80;
        }
    }
    
    public void setMarcha5 (){
        if (Embrague && Marcha.getMARCHA()+1 == 5 || Marcha.getMARCHA()-1 == 5) {
        Marcha = EstadosMarcha.MARCHA5;
        VelocidadMaxMarcha = VelocidadesMaximas.KmH300;
        }
    }
    
    public void setReversa (){
        if (Embrague && Marcha.getMARCHA()-1 == -1) {
        Marcha = EstadosMarcha.REVERSA;
        VelocidadMaxMarcha = VelocidadesMaximas.NEUTRO;
        }
    }
    
}
