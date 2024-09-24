import java.util.*;

public class AppPaciente
{
  private ListaPacientes listapacientes;
  
  public AppPaciente(){
      this.listapacientes =  new ListaPacientes();
  }
  
  public static void main(String[] args){
      Scanner dados = new Scanner(System.in);
      
      AppPaciente app = new AppPaciente();
      
      int opcao;
      
      do{
          System.out.println("******************");
          System.out.println("Menu interativo:");
          System.out.println("******************");
          
          System.out.println("(1) Cadastrar paciente ");
          System.out.println("(2) Consultar paciente por nome ");
          System.out.println("(3) Consultar paciente por código ");
          System.out.println("(4) Filtrar paciente por idade ");
          System.out.println("(5) Listar pacientes ");
          System.out.println("(6) Alterar o peso do paciente por código ");
          System.out.println("(7) Alterar a altura do paciente por código ");
          System.out.println("(8) Alterar o sexo do paciente por código ");
          System.out.println("(9) Mostrar o IMC do paciente por código ");
          System.out.println("(10) Mostrar o peso ideal do paciente por código ");
          System.out.println("(11) Sair ");
          opcao = dados.nextInt();
          dados.nextLine();
          
          switch(opcao){
              case 1:
                  System.out.println("Informe o nome do(a) paciente: ");
                  String nome = dados.nextLine();
                  System.out.println("Informe a idade do(a) paciente: ");
                  int idade = dados.nextInt();
                  System.out.println("Informe o codigo do(a) paciente: ");
                  int codigo = dados.nextInt();
                  dados.nextLine();
                  System.out.println("Informe o sexo do(a) paciente: (M) Masculino (F) Feminino ");
                  String sexo = dados.nextLine();
                  System.out.println("Informe o peso do(a) paciente: ");
                  double peso = dados.nextDouble();
                  System.out.println("Informe a altura do(a) paciente: ");
                  double altura = dados.nextDouble();
                  dados.nextLine();
                  Paciente novoPaciente = new Paciente(codigo,nome,sexo,peso,altura,idade);
                  app.listapacientes.cadastrarPaciente(novoPaciente);
                  break;
                  
              case 2:
                  System.out.println("Informe o nome do(a) paciente : ");
                  nome = dados.nextLine();
                  Paciente pacienteEncontrado = app.listapacientes.consultaPacientePorNome(nome);
                  if(pacienteEncontrado != null){
                      System.out.println("Paciente encontrado: " + pacienteEncontrado);
                  }else{
                      System.out.println("Paciente não encontrado! ");
                  }
                  break;
              
              case 3:
                  System.out.println("Informe o código do(a) pacinete: ");
                  codigo = dados.nextInt();
                  pacienteEncontrado = app.listapacientes.consultaPacientePorCodigo(codigo);
                  if(pacienteEncontrado != null){
                      System.out.println("Paciente encontrado: " + pacienteEncontrado);
                  }else{
                      System.out.println("Paciente não encontrado! ");
                  }
                  break; 
                  
              case 4:
                  System.out.println("Informe a idade que deseja filtrar: ");
                  idade = dados.nextInt();
                  System.out.println("Pacientes acima de " + idade + " anos: ");
                  app.listapacientes.MostrarPacienteAcimaIdade(idade);
                  break;
                  
              case 5:
                  System.out.println("Lista de pacientes: ");
                  app.listapacientes.listarPacientes();
                  break;
                  
              case 6:
                  System.out.println("Informe o código do(a) paciente que deseja alterar o peso: ");
                  codigo = dados.nextInt();
                  pacienteEncontrado = app.listapacientes.consultaPacientePorCodigo(codigo);
                  if(pacienteEncontrado != null){
                      System.out.println("Paciente encontrado: " + pacienteEncontrado);
                      System.out.println("Informe o novo peso do(a) pacinete: ");
                      double novoPeso = dados.nextDouble();
                      app.listapacientes.alterarPesoPacientePorCodigo(codigo,novoPeso);
                  }else{
                      System.out.println("Paciente não encontrado! ");
                  }
                  break;
                  
              case 7:
                  System.out.println("Informe o código do(a) paciente que deseja alterar a altura: ");
                  codigo = dados.nextInt();
                  pacienteEncontrado = app.listapacientes.consultaPacientePorCodigo(codigo);
                  if(pacienteEncontrado != null){
                      System.out.println("Paciente encontrado: " + pacienteEncontrado);
                      System.out.println("Informe a nova altura do(a) paciente: ");
                      double novaAltura = dados.nextDouble();
                      app.listapacientes.alterarAlturaPacientePorCodigo(codigo,novaAltura);
                  }else{
                      System.out.println("Paciente não encontrado! ");
                  }
                  break;
                  
              case 8:
                  System.out.println("Informe o código do(a) paciente que deseja alterar o sexo: ");
                  codigo = dados.nextInt();
                  pacienteEncontrado = app.listapacientes.consultaPacientePorCodigo(codigo);
                  if(pacienteEncontrado != null){
                      System.out.println("Paciente encontrado: " + pacienteEncontrado);
                      System.out.println("Informe o novo sexo do(a) paciente: ");
                      String novoSexo = dados.nextLine();
                      app.listapacientes.alterarSexoPacientePorCodigo(codigo,novoSexo);
                  }else{
                      System.out.println("Paciente não encontrado! ");
                  }
                  break;
                  
              case 9:
                  System.out.println("Informe o código do(a) paciente que deseja saber o IMC: ");
                  codigo = dados.nextInt();
                  pacienteEncontrado = app.listapacientes.consultaPacientePorCodigo(codigo);
                  if(pacienteEncontrado != null){
                      System.out.println("Paciente encontrado: " + pacienteEncontrado);
                      app.listapacientes.mostrarIMCPorCodigo(codigo);
                  }else{
                      System.out.println("Paciente não encontrado! ");
                  }
                  break;
                  
              case 10:
                  System.out.println("Informe o código do(a) paciente que deseja saber o peso ideal: ");
                  codigo = dados.nextInt();
                  pacienteEncontrado = app.listapacientes.consultaPacientePorCodigo(codigo);
                  if(pacienteEncontrado != null){
                      System.out.println("Paciente encontrado: " + pacienteEncontrado);
                      app.listapacientes.mostrarPesoIdealPorCodigo(codigo);
                  }else{
                      System.out.println("Paciente não encontrado! ");
                  }
                  break;
                  
              case 11:
                  System.out.println("Saindo... ");
                  break;
                  
              default:
                  System.out.println("Opção inválida! ");
                  break;
        }
          
      }while(opcao != 11);
  }
}
