package pkmn;

import java.io.IOException;
import java.util.GregorianCalendar;

public class Relogio {
    
    public static int getDiaNoite(){
        GregorianCalendar calendario = new GregorianCalendar();
        
        if((calendario.get(GregorianCalendar.HOUR_OF_DAY) >= 18)||(calendario.get(GregorianCalendar.HOUR_OF_DAY) < 6))
            return (1);
        else 
            return (0);
    }
    
    public static String getHoraAtual(){
        GregorianCalendar calendario = new GregorianCalendar();
        String horaFormatada;

        if(calendario.get(GregorianCalendar.HOUR_OF_DAY) <= 9) horaFormatada = "0"+calendario.get(GregorianCalendar.HOUR_OF_DAY)+":";
        else horaFormatada = calendario.get(GregorianCalendar.HOUR_OF_DAY)+":";

        if(calendario.get(GregorianCalendar.MINUTE) <= 9) horaFormatada = horaFormatada+"0"+calendario.get(GregorianCalendar.MINUTE)+":";
        else horaFormatada = horaFormatada+calendario.get(GregorianCalendar.MINUTE)+":";

        if(calendario.get(GregorianCalendar.SECOND) <= 9) horaFormatada = horaFormatada+"0"+calendario.get(GregorianCalendar.SECOND);
        else horaFormatada = horaFormatada+calendario.get(GregorianCalendar.SECOND);

        return(horaFormatada);
    }
    
    public static long getDataAtual(){
        GregorianCalendar calendario = new GregorianCalendar();
        return(calendario.getTimeInMillis());
    }
    
    public static int getDiferencaSegundos(long a, long b){
        return((int) ((a-b)/1000));
    }
    
    public static int getDiferencaDias(long a, long b){
        return((int) ((a-b)/(24*60*60*1000)));
    }   
    
   
}
