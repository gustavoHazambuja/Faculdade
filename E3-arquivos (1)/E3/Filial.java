import java.util.*;


// =======================================================
// Esta classe está parcialmente implementada
// Você deve completar o código para realizar as tarefas
// =======================================================

public class Filial {

	private String cnpj;
	private String endereco;
	//private ????????? produtosDisponiveis;
	private Set<Produto> produtosDispiniveis;


	public Filial (String cnpj, String endereco) {
		this.cnpj = cnpj;
		this.endereco = endereco;
		//this.produtosDisponiveis = new ...;
		this.produtosDispiniveis = new HashSet<Produto>();
	}

	public String getCnpj () {
		return this.cnpj;
	}

	public String getEndereco () {
		return this.endereco;
	}

	public boolean adicionarProduto (Produto produto) {
		// completar...
		produtosDispiniveis.add(produto);
		return true;
	}

	public Set<Produto> getProdutos(){
		return produtosDispiniveis;
	}

	public List<Produto> prodsOrdenadosPorPreco(){
		Set<Produto> produtosDisponiveis = getProdutos();

		List<Produto> produtos = new ArrayList<>(produtosDisponiveis);
		Collections.sort(produtos);

		return produtos;
	}
}

