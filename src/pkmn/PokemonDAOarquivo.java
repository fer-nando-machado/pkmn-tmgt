package pkmn;

public class PokemonDAOarquivo implements PokemonDAO {

    @Override
    public void salvar(Pokemon pokemon) {
        String conteudo = null;
        
        if(pokemon instanceof PokemonGrama)
            conteudo="0";
        else if(pokemon instanceof PokemonFogo)
            conteudo="1";
        else if(pokemon instanceof PokemonAgua)
            conteudo="2";
                
        conteudo = conteudo +" "+pokemon.getFome()+" "+pokemon.getEnergia()+" "+pokemon.getHigiene()+" "+pokemon.getDiversao()+" "+pokemon.getSocial()+" "+pokemon.getBanheiro()+" "+pokemon.getNome()+" "+pokemon.getNascimento()+" "+pokemon.getUltimo()+" "+pokemon.getAltura()+" "+pokemon.getPeso()+" "+pokemon.getStatus()+" "+pokemon.getCasa();
        try{
               Arquivo.escreverLinha("save.data", conteudo, false);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void limpar() {
        Arquivo.limparArquivo("save.data");
    }

    @Override
    public boolean verificar() {
        return Arquivo.verificarArquivo("save.data");
    }
    
    
    
    
    
    @Override
    public Pokemon carregar() {
        Pokemon pokemon = null;
        
        try{
            java.util.StringTokenizer conteudo = new java.util.StringTokenizer(Arquivo.lerLinha("save.data"));

            int tipo = (Integer.parseInt(conteudo.nextToken()));
            double fome = (Double.parseDouble(conteudo.nextToken()));
            double energia = (Double.parseDouble(conteudo.nextToken()));
            double higiene = (Double.parseDouble(conteudo.nextToken()));
            double diversao = (Double.parseDouble(conteudo.nextToken()));
            double social = (Double.parseDouble(conteudo.nextToken()));
            double banheiro = (Double.parseDouble(conteudo.nextToken()));
            String nome = (conteudo.nextToken());
            long nascimento = (Long.parseLong(conteudo.nextToken()));
            long ultimo = (Long.parseLong(conteudo.nextToken()));
            double altura = (Double.parseDouble(conteudo.nextToken()));
            double peso = (Double.parseDouble(conteudo.nextToken()));            
            int status = (Integer.parseInt(conteudo.nextToken()));
            int casa = (Integer.parseInt(conteudo.nextToken()));
            
            if(tipo == 0)
                pokemon = new PokemonGrama(fome, energia, higiene, diversao, social, banheiro, nome, nascimento, ultimo, altura, peso, status, casa);
            else if(tipo == 1)
                pokemon = new PokemonFogo(fome, energia, higiene, diversao, social, banheiro, nome, nascimento, ultimo, altura, peso, status, casa);
            else if(tipo == 2)
                pokemon = new PokemonAgua(fome, energia, higiene, diversao, social, banheiro, nome, nascimento, ultimo, altura, peso, status, casa);
            
        }
        catch (Exception e){
            return(null);
        }
        
        return(pokemon);
    }


    
}
