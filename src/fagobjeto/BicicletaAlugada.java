package fagobjeto;

public class BicicletaAlugada {
	private int horas;
	private double valorHora;

	public int getHoras() {
		return horas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setHoras(int horas) {
		if (horas >= 1) {
			this.horas = horas;
		} else {
			System.out.println("Erro: O número de horas deve ser no mínimo 1.");
		}
	}

	public void setValorHora(double valorHora) {
		if (valorHora > 0) {
			this.valorHora = valorHora;
		} else {
			System.out.println("Erro: O valor por hora deve ser maior que 0.");
		}
	}

	public double calcularValor() {
		return this.horas * this.valorHora;
	}
}