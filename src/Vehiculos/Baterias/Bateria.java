package Vehiculos.Baterias;




/**
 *
 * @author denis
 */
public class Bateria {
//ATRIBUTOS    
    private double Carga;
//METODOS GET
    public double getCarga() {
        return Carga;
    }
//METODOS SET
    public void setCarga(double Carga) {
        this.Carga = Carga;
    }
//CONSTRUCTOR
    public Bateria() {
        this.Carga = 100;
    }
//OTROS
    //Timmers
    
    //Metodos
    public void CambiarBateria(){
        Carga=100;
    }
    
}
