public class App {
    public static void main(String[] args) {
        CadastroFuncionariosOriginal cadastro = new CadastroFuncionariosOriginal();

        System.out.printf("Funcionários que recebem insalubridade e tem dependentes: %s\n", cadastro.getInsalubridadeDependentes());
        System.out.printf("Quantidade de funcionários com dependentes: %d\n", cadastro.quantidadeFuncionariosComDependentes());
        System.out.printf("Somatório do salário bruto dos funcionários que ganham mais de 5000: %.2f\n", cadastro.somatorioSalarioBruto());
        System.out.printf("Média dos salários dos funcionário que não recebem insalubridade: %.2f\n", cadastro.mediaSalarialDosQueNaoTemInsalubridade());
        System.out.printf("Nome dos funcionários com o número de matrícula menor que 500: %s\n", cadastro.nomesDosQueTemMatriculaMenorQue500());
        cadastro.aumentaSalarioInsalubres(10);
        System.out.printf("Salário líquido do funcionario: %.2f\n", cadastro.getSalarioLiquido(1079));
        // System.out.printf("Funcionários cujo salário bruto é mais de 10% maior que o salário base: %s\n", cadastro.getNomeMatriculaSalarioBrutoMaiorQueBase());


        System.out.println("Funcionários cujo salário bruto é mais de 10% maior que o salário base:");
            cadastro.getNomeMatriculaSalarioBrutoMaiorQueBase()
            .forEach(System.out::println);

    }

}
