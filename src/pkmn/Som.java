package pkmn;

import java.applet.*;
import java.net.URL;

public class Som {  
    public static void tocar(final URL caminho){  
        new Thread(){
            @Override
            public void run(){
                Applet.newAudioClip(caminho).play(); 
            }
        }.start();
    }
}