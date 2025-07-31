package GUI;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sonido {
    
    public static Clip Crear(String RutaSonido) {
        Clip Sonido = null;
        try {
            File ArchivoSonido = new File(RutaSonido);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(ArchivoSonido);
            Sonido = AudioSystem.getClip();
            Sonido.open(audioStream);
        
            
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
        
        }
        return Sonido;
    }
    
    
    public static void Iniciar(Clip Sonido, int Position) {
        Sonido.setMicrosecondPosition(Position);
        Sonido.start();
    }
    
    public static void Detener(Clip Sonido) {
        Sonido.stop();
    }
    
}