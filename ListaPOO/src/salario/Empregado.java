package salario;

public class Empregado {
    String nome;
    String cargo;
    Double salario;
    String tempoTrabalho;
    String local;

    void reajustarSalario (Double porcentagemReajuste){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);

       Double reajuste = porcentagemReajuste / 100;
       salario = salario + (reajuste * salario);

        System.out.println("Salário reajustado: " + salario);
    }
}
