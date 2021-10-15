package recursos.humanos;

//        Crie dois objetos do tipo Colaborador.
//        Crie um objeto do tipo RecursosHumanos.
//        Exiba as informações dos colaboradores.
//        Promova um colaborador com salário maior.
//        Promova um colaborador com salário menor.
//        Faça o reajuste de salário de um colaborador.
//        Exiba novamente as informações dos colaboradores.
//        Exiba o total de promovidos.
//        Exiba o total de salários reajustados.

public class testeColaborador {
        public static void main(String[] args) {
                Colaborador colaborador1 = new Colaborador("Vinicius", "Estagiario", 1850.00);
                Colaborador colaborador2 = new Colaborador("Joel", "Encarregado", 2000.00);
                RecursosHumanos rh = new RecursosHumanos();

                rh.reajustarSalario(colaborador1, 1.5);
                rh.reajustarSalario(colaborador2, 2.5);
        }
}
