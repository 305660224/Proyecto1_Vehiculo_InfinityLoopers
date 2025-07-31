
package Vehiculos.Transmisiones;

/**
 *
 * @author denis
 */
public enum VelocidadesMaximas {
     NEUTRO  (0),
     KmH20   (20),
     KmH40   (40),
     KmH60   (60),
     KmH80   (80),
     KmH300  (300);
     
    private final int VELOCIDADMAXMARCHA;

    private VelocidadesMaximas(int VELOCIDADMAXMARCHA) {
        this.VELOCIDADMAXMARCHA = VELOCIDADMAXMARCHA;
    }

    public int getVELOCIDADMAXMARCHA() {
        return VELOCIDADMAXMARCHA;
    }
        
}
