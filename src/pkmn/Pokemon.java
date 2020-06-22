package pkmn;

public abstract class Pokemon {
    protected Atributo fome;
    protected Atributo energia;
    protected Atributo higiene;
    protected Atributo diversao;
    protected Atributo social;
    protected Atributo banheiro;
    
    protected String nome;
    protected long nascimento;
    protected long ultimo;
    protected double altura;
    protected double peso;
    protected int status;  
    protected int casa;    
    
    public Pokemon(double fome, double energia, double higiene, double diversao, double social, double banheiro, String nome, long nascimento, long ultimo, double altura, double peso, int status, int casa) {
        this.fome = new Atributo(fome);
        this.energia = new Atributo(energia);
        this.higiene = new Atributo(higiene);
        this.diversao = new Atributo(diversao);
        this.social = new Atributo(social);
        this.banheiro = new Atributo(banheiro);
        this.nome = nome;
        this.nascimento = nascimento;
        this.ultimo = ultimo;
        this.altura = altura;
        this.peso = peso;
        this.status = status;
        this.casa = casa;
    }

    public Pokemon(String nome, double altura, double peso) {
        this(100,100,100,100,100,100, nome, Relogio.getDataAtual(), Relogio.getDataAtual(), altura, peso, 0, 0);
    }
    
    public void simular(int velocidade){
        simular(1, velocidade);
    }
    
    public abstract void simular(int i, int velocidade);
    
    public abstract String conversar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura < 0)
            this.altura = 0;
        else
            this.altura = altura;            
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso < 0)
            this.peso = 0;
        else
            this.peso = peso;      
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCasa() {
        return casa;
    }

    public void setCasa(int casa) {
        this.casa = casa;
    }

    public long getNascimento() {
        return nascimento;
    }

    public void setNascimento(long nascimento) {
        this.nascimento = nascimento;
    }
    
    public long getUltimo() {
        return ultimo;
    }

    public void setUltimo(long ultimo) {
        this.ultimo = ultimo;
    }

    public double getFome() {
        return fome.getValor();
    }

    public void setFome(double fome) {
        this.fome.setValor(fome);
    }

    public double getBanheiro() {
        return banheiro.getValor();
    }

    public void setBanheiro(double banheiro) {
        this.banheiro.setValor(banheiro);
    }

    public double getDiversao() {
        return diversao.getValor();
    }

    public void setDiversao(double diversao) {
        this.diversao.setValor(diversao);
    }

    public double getEnergia() {
        return energia.getValor();
    }

    public void setEnergia(double energia) {
        this.energia.setValor(energia);
    }

    public double getHigiene() {
        return higiene.getValor();
    }

    public void setHigiene(double higiene) {
        this.higiene.setValor(higiene);
    }

    public double getSocial() {
        return social.getValor();
    }

    public void setSocial(double social) {
        this.social.setValor(social);
    }

    @Override
    public String toString() {
        return "Pokemon{" + "fome=" + fome + ", energia=" + energia + ", higiene=" + higiene + ", diversao=" + diversao + ", social=" + social + ", banheiro=" + banheiro + ", nome=" + nome + ", nascimento=" + nascimento + ", ultimo=" + ultimo + ", altura=" + altura + ", peso=" + peso + ", status=" + status + ", casa=" + casa + '}';
    }
    
    
}
