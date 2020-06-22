package pkmn;

public class PokemonAgua extends Pokemon {

    public PokemonAgua(String nome, double altura, double peso) {
        super(nome, altura, peso);
    }
    
    public PokemonAgua(double fome, double energia, double higiene, double diversao, double social, double banheiro, String nome, long nascimento, long ultimo, double altura, double peso, int status, int casa) {
        super(fome, energia, higiene, diversao, social, banheiro, nome, nascimento, ultimo, altura, peso, status, casa);
    }

    @Override
    public void simular(int i, int velocidade){
        fome.setValor(fome.getValor()-(i*0.000034722*0.9*velocidade));
        if(casa != 1) energia.setValor(energia.getValor()-(i*0.000023148*1.0*velocidade));
        diversao.setValor(diversao.getValor()-(i*0.000021574*0.8*velocidade));
        social.setValor(social.getValor()-(i*0.000023148*1.1*velocidade));
        banheiro.setValor(banheiro.getValor()-(i*0.000092593*0.8*velocidade));
        if(casa != 2){
            if(status == 1) higiene.setValor(higiene.getValor()-(2*i*0.000017361*1.5*velocidade));
            else higiene.setValor(higiene.getValor()-(i*0.000017361*1.5*velocidade));            
        }
    }
    
    @Override
    public String conversar() {
        if(fome.getValor() < 50) return ("Estou com fome.");
        else if(energia.getValor() < 50) return ("Estou com sono.");
        else if(diversao.getValor() < 50) return ("Estou entediado.");
        else if(social.getValor() < 50) return ("Estou solitário.");
        else if(higiene.getValor() < 50) return ("Estou sujo.");
        else return ("Está tudo certo por aqui!");
    }
}
