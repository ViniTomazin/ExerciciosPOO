package pokemon;

public class TestePokemon {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Rony", "Mestre", 100.00, 0);
        TreinadorPokemon treinadorPokemon = new TreinadorPokemon("Black",0);

        treinadorPokemon.treinarPokemon(pokemon1);
        treinadorPokemon.treinarPokemon(pokemon1);
        treinadorPokemon.treinarPokemon(pokemon1);
        treinadorPokemon.treinarPokemon(pokemon1);
        treinadorPokemon.treinarPokemon(pokemon1);

        System.out.println(pokemon1);

        treinadorPokemon.evoluirPokemon(pokemon1, "Raichu");
    }
}
