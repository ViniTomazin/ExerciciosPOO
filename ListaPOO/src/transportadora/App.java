package transportadora;

public class App {
    public static void main(String[] args) {
        Encomenda encomenda = new Encomenda();

        encomenda.tamanho = "G";
        encomenda.enderecoRemetente = "Rua alvorada, 19";
        encomenda.enderecoDestinatario = "Rua haddock lobo, 595";
        encomenda.distancia = 30.00;
        encomenda.valorEncomenda = 150.00;

        encomenda.emitirEtiqueta();

    }
}
