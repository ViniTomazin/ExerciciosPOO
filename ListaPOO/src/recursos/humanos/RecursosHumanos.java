package recursos.humanos;

//    Deve conter total de promovidos e total de salarios reajustados.
//    Deve conter um método reajustarSalario, que recebe um colaborador e o valor do reajuste(utilize Double).
//    Deve conter um método promoverColaborador, que recebe um colaborador, novo cargo e um novo salario.
//    Somente deverá ser realizada a promoção caso o novo salario informado seja maior que o salario atual do
//    funcionario, caso não seja, exiba “operação inválida”.

public class RecursosHumanos {
    private Integer totalPromovidos;
    private Integer totalSalariosReajustados;


    public void reajustarSalario (Colaborador colaborador, Double reajuste){
        Double salarioAtual = colaborador.getSalario();
        colaborador.setSalario(salarioAtual * reajuste);
        totalSalariosReajustados++;
    }

    public void promoverColaborador (Colaborador colaborador, String novoCargo, Double novoSalario){

        Double salarioAtual = colaborador.getSalario();

        if (novoSalario > salarioAtual){
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
            totalPromovidos++;
        } else {
            System.out.println("Operação inválida");
        }
    }

}
