
package Vehiculos.Transmisiones;

/**
 *
 * @author denis
 */
public enum EstadosMarcha {
     NEUTRO  (0),
     MARCHA1 (1),
     MARCHA2 (2),
     MARCHA3 (3),
     MARCHA4 (4),
     MARCHA5 (5),
     REVERSA (6);
     
    private final int MARCHA;

    private EstadosMarcha(int MARCHA) {
        this.MARCHA = MARCHA;
    }

    public int getMARCHA() {
        return MARCHA;
    }          
    
}
