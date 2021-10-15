package confeitaria.donamaria;

public class App {
    public static void main(String[] args) {
        Bolo boloChocolate = new Bolo();
        Bolo boloLimao = new Bolo();
        Bolo boloCenoura = new Bolo();
        Bolo boloFuba = new Bolo();

        boloChocolate.sabor = "Chocolate";
        boloChocolate.valor = 35.00;
        boloChocolate.comprarBolo(40);
        boloChocolate.exibirRelatorio();

        boloLimao.sabor = "Limão";
        boloLimao.valor = 55.00;
        boloLimao.comprarBolo(20);
        boloLimao.exibirRelatorio();

        boloCenoura.sabor = "Cenoura";
        boloCenoura.valor = 32.00;
        boloCenoura.comprarBolo(105);
        boloCenoura.exibirRelatorio();

        boloFuba.sabor = "Fuba";
        boloFuba.valor = 30.00;
        boloFuba.comprarBolo(99);
        boloFuba.exibirRelatorio();
    }
}
