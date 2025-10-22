package fagobjeto;

public class Filme {
	private String titulo;
	private double avaliacao;

	public Filme() {
	}

	public Filme(String titulo, double avaliacao) {
		setTitulo(titulo);
		setAvaliacao(avaliacao);
	}

	public String getTitulo() {
		return titulo;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setTitulo(String titulo) {
		if (titulo == null || titulo.trim().isEmpty()) {
			System.out.println("Erro: O título não pode ser vazio.");
		} else {
			this.titulo = titulo;
		}
	}

	public void setAvaliacao(double avaliacao) {
		if (avaliacao >= 0 && avaliacao <= 5) {
			this.avaliacao = avaliacao;
		} else {
			System.out.println("Erro: A avaliação deve ser entre 0 e 5.");
		}
	}

	public void exibir() {
		System.out.println("Filme: " + this.titulo + " | Avaliação: " + this.avaliacao);
	}
}
