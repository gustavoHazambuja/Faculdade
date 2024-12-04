import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CadastroFuncionariosOriginal {
	private List<Funcionario> lstf;

	public CadastroFuncionariosOriginal() {
		lstf = new LinkedList<>();

		Random r = new Random();

		for (int i = 0; i < 40; i++) {
			int matricula = r.nextInt(1000) + 100;
			String nome = "Fulano" + i;
			boolean insalubridade = r.nextBoolean();
			int nroDep = r.nextInt(3) + 1;
			double salBase = (r.nextDouble() * 15000) + 500;
			Funcionario f = new Funcionario(matricula, nome, salBase, nroDep, insalubridade);
			lstf.add(f);
		}
	}

	public List<Funcionario> getFuncionarios() {
		return Collections.unmodifiableList(lstf);
	}

	@Override
	public String toString() {
		return "CadastroFuncionarios [lstf=" + lstf + "]";
	}

	// 2a
	public List<Funcionario> getInsalubridadeDependentes() {
		return lstf.stream()
			.filter(f -> f.getInsalubridade() && f.getNroDependentes() > 0)
			.collect(Collectors.toList());
	}

	// 2b
	public long quantidadeFuncionariosComDependentes() {
		return lstf.stream()
			.filter(f -> f.getNroDependentes() > 0)
			.mapToLong(Funcionario::getNroDependentes)
			.count();
	}

	// 2c
	public double somatorioSalarioBruto() {
		return lstf.stream()
			.filter(f -> f.getSalarioBruto() > 5000)
			.mapToDouble(Funcionario::getSalarioBruto)
			.sum();
	}

	// 2d
	public void aumentaSalarioInsalubres(double taxa) {
		lstf.stream()
			.filter(f -> f.getInsalubridade())
			.forEach(f -> f.aumentaSalBase(taxa));
			
	}

	// 2e
	public List<String> getNomeMatriculaSalarioBrutoMaiorQueBase() {
		return lstf.stream()
			.filter(f -> f.getSalarioBruto() > f.getSalarioBase() * 1.1)
			.map(f -> "Nome: " + f.getNome() + ", Matrícula: " + f.getMatricula())
			.collect(Collectors.toList());

	}

	// 2f
	public double mediaSalarialDosQueNaoTemInsalubridade() {
		return lstf.stream()
			.filter(f -> !f.getInsalubridade())
			.mapToDouble(Funcionario::getSalarioBase)
			.average()
			.orElse(0.0);
	}

	// 2g
	public List<String> nomesDosQueTemMatriculaMenorQue500() {
		return lstf.stream()
			.filter(f -> f.getMatricula() < 500)
			.map(Funcionario::getNome)
			.collect(Collectors.toList());
	}

	// 2h
	public double getSalarioLiquido(int matricula) {
		return lstf.stream()
			.filter(f -> f.getMatricula() == matricula)
			.mapToDouble(Funcionario::getSalarioLiquido)
			.findFirst()
			.orElse(-1.0);
			
			
	}
}
