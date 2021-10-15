package pokemon;

public class TreinadorPokemon {

    String nome;
    Integer nivel;

    public TreinadorPokemon(String nome, Integer nivel) {
        this.nome = nome;
        this.nivel = 0;
    }

    public void treinarPokemon (Pokemon pokemon){
        Double forcaAtual = pokemon.getForca();
        Integer docesAtual = pokemon.getDoces();

        pokemon.setForca(forcaAtual * 1.1);
        pokemon.setDoces(docesAtual + 10);

        this.nivel += 2;
    }

    public void evoluirPokemon (Pokemon pokemon, String nomeEvolucao){
        Integer qtdDocesAtual = pokemon.getDoces();
        if (qtdDocesAtual >= 50){
            String nomeAtual = pokemon.getNome();

            pokemon.setNome(nomeEvolucao);
            pokemon.setDoces(pokemon.getDoces() - 50);

            this.nivel += 10;

            String frase = String.format("Pokemon %s evoluiu para -> %s", nomeAtual, pokemon.getNome());

            System.out.println(frase);

        } else {
            System.out.println("Opção inválida");
        }
    }
}
