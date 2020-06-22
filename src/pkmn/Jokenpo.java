package pkmn;

public class Jokenpo {
   
    public static int gerarJogada(){
        return((int)(3*Math.random())); //gerando 0, 1 ou 2
    }
    
    public static int compararMaos(int p1, int p2){
        if(p1 == 0){
            if(p2 == 0) return 0; //0x0 = empate
            else if(p2 == 1) return 2; //0x1 = p2
            else return 1; //0x2 = p1
        }
        else if(p1 == 1){
            if(p2 == 0) return 1; //1x0 = p1
            else if(p2 == 1) return 0; //1x1 = empate
            else return 2; //1x2 = p2   
        }
        else{
            if(p2 == 0) return 2; //2x0 = p2
            else if(p2 == 1) return 1; //2x1 = p1
            else return 0; //2x2 = empate 
        }
    }
    
}
