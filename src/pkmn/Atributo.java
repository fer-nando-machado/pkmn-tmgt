package pkmn;

public class Atributo {
    private double valor;

    public Atributo(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
        if(this.valor > 100) this.valor = 100;
        else if (this.valor < 0) this.valor = 0;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
    
    
  
}
