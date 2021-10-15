package confeitaria.donamaria;

public class Bolo {
    String sabor;
    Double valor;
    Integer quantidadeVendida = 0;

    void comprarBolo (Integer qtdCompra){
        if ((qtdCompra + quantidadeVendida) > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        }
        quantidadeVendida += qtdCompra;
    }

    void exibirRelatorio(){
        valor = valor * quantidadeVendida;
        String frase = String.format("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f", sabor,
                quantidadeVendida, valor);
        System.out.println(frase);
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
