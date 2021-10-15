package salario;

public class Main {
    public static void main(String[] args) {

        Empregado vinicius = new Empregado();

        vinicius.nome = "Vinícius Tomazin";
        vinicius.salario = 1850.00;
        vinicius.cargo = "Estagiário de desenvolvimento FullStack";
        vinicius.reajustarSalario(15.0);

        Empregado rony = new Empregado();
        rony.nome = "Rony Sobral";
        rony.salario = 1850.00;
        rony.cargo = "Estagiário de desenvolvimento FullStack";
        rony.tempoTrabalho = "5 anos";
        rony.local = "Pinheiros";
        System.out.println(rony.tempoTrabalho);
        System.out.println(rony.local);
        rony.reajustarSalario(15.0);
    }
}
