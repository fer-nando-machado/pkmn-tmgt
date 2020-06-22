package pkmn;

public class PokemonGrama extends Pokemon {

  
    public PokemonGrama(String nome, double altura, double peso) {
        super(nome, altura, peso);
    }

    public PokemonGrama(double fome, double energia, double higiene, double diversao, double social, double banheiro, String nome, long nascimento, long ultimo, double altura, double peso, int status, int casa) {
        super(fome, energia, higiene, diversao, social, banheiro, nome, nascimento, ultimo, altura, peso, status, casa);
    }
    
    @Override
    public void simular(int i, int velocidade){
        fome.setValor(fome.getValor()-(i*0.000034722*1.0*velocidade));
        if(casa != 1) energia.setValor(energia.getValor()-(i*0.000023148*0.9*velocidade));
        diversao.setValor(diversao.getValor()-(i*0.000021574*0.9*velocidade));
        social.setValor(social.getValor()-(i*0.000023148*1.0*velocidade));
        banheiro.setValor(banheiro.getValor()-(i*0.000092593*1.2*velocidade));
        if(casa != 2){
            if(status == 1) higiene.setValor(higiene.getValor()-(5*i*0.000017361*1.0*velocidade));
            else higiene.setValor(higiene.getValor()-(i*0.000017361*1.0*velocidade));                
        }
    }
    
    @Override
    public String conversar() {
        if(fome.getValor() < 50) return ("Necessito comer alguma coisa.");
        else if(energia.getValor() < 50) return ("Necessito ir dormir.");
        else if(diversao.getValor() < 50) return ("Necessito me divertir.");
        else if(social.getValor() < 50) return ("Necessito conversar.");
        else if(higiene.getValor() < 50) return ("Necessito tomar um banho.");
        else return ("Por aqui, está tudo bem!");
    }
}
