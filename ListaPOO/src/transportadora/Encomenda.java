package transportadora;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;
    Double valorFreteTotal = 0.0;
    Double valorTotalEncomenda;

    void calcularFreteTamanho(){
        if (tamanho.equals("P")){
            valorFreteTotal += (0.01 * valorEncomenda);
        } else if (tamanho.equals("M")) {
            valorFreteTotal += (0.03 * valorEncomenda);
        } else if (tamanho.equals("G")) {
            valorFreteTotal += (0.05 * valorEncomenda);
        } else {
            System.out.println("Tamanho inválido");
        }
    }

    void  calcularFreteDistancia (){
        if (distancia <= 50){
            valorFreteTotal += 3.00;
        } else if (distancia > 50 && distancia <= 200){
            valorFreteTotal += 5.00;
        } else {
            valorFreteTotal += 7.00;
        }
    }

    void  emitirEtiqueta (){
        calcularFreteDistancia();
        calcularFreteTamanho();
        valorTotalEncomenda = (valorFreteTotal + valorEncomenda);

        System.out.println("***** ETIQUETA PARA ENVIO *****");
        System.out.println(String.format("Endereço remetente: %s", enderecoRemetente));
        System.out.println(String.format("Endereço destinatário: %s", enderecoDestinatario));
        System.out.println(String.format("Tamanho: %s", tamanho));
        System.out.println("--------------------------------------------------");
        System.out.println(String.format("Valor encomenda: %.2f", valorEncomenda));
        System.out.println(String.format("Valor frete: %.2f", valorFreteTotal));
        System.out.println("--------------------------------------------------");
        System.out.println(String.format("Valor total: %.2f", valorTotalEncomenda));
    }
}
