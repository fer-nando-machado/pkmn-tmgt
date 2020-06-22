package pkmn;

public class Fabrica {
    public static PokemonDAO criarPokemonDAO(){
        return new PokemonDAOarquivo();
    }
}
