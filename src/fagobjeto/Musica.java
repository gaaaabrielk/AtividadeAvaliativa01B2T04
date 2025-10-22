package fagobjeto;

public class Musica {
	private String titulo;
	private int duracaoSegundos;

	public String getTitulo() {
		return titulo;
	}

	public int getDuracaoSegundos() {
		return duracaoSegundos;
	}

	public void setTitulo(String titulo) {
		if (titulo == null || titulo.trim().isEmpty()) {
			System.out.println("Erro: O título não pode ser vazio.");
		} else {
			this.titulo = titulo;
		}
	}

	public void setDuracaoSegundos(int duracaoSegundos) {
		if (duracaoSegundos > 0) {
			this.duracaoSegundos = duracaoSegundos;
		} else {
			System.out.println("Erro: A duração deve ser maior que 0.");
		}
	}

	public String formatarDuracao() {
		int minutos = this.duracaoSegundos / 60;
		int segundos = this.duracaoSegundos % 60;
		return String.format("%02d:%02d", minutos, segundos);
	}
}
