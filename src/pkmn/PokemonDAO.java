package pkmn;

public interface PokemonDAO {
    public boolean verificar();
    public Pokemon carregar();
    public void salvar(Pokemon pokemon);
    public void limpar();
}