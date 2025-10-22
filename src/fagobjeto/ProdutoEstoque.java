package fagobjeto;

public class ProdutoEstoque {
	private String nome;
	private int quantidade;

	public String getNome() {
		return nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			System.out.println("Erro: O nome não pode ser vazio.");
		} else {
			this.nome = nome;
		}
	}

	public void setQuantidade(int quantidade) {
		if (quantidade >= 0) {
			this.quantidade = quantidade;
		} else {
			System.out.println("Erro: A quantidade não pode ser negativa.");
		}
	}

	public void adicionarEstoque(int qtd) {
		if (qtd > 0) {
			this.quantidade += qtd;
		} else {
			System.out.println("Erro: A quantidade a ser adicionada deve ser positiva.");
		}
	}

	public void removerEstoque(int qtd) {
		if (this.quantidade - qtd < 0) {
			System.out.println("Erro: Estoque insuficiente para remoção.");
		} else {
			this.quantidade -= qtd;
		}
	}
}
