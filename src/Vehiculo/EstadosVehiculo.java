
package Vehiculos;

/**
 *
 * @author denis
 */
public enum EstadosVehiculo {
     APAGADO (1),
     IGNICION (2),
     MARCHA (3);
     
    private final int ESTADO;

    private EstadosVehiculo(int ESTADO) {
        this.ESTADO = ESTADO;
    }

    public int getESTADO() {
        return ESTADO;
    }
    
    
    
}
