package fagobjeto;

public class ContaLuz {
	private double consumoKwh;
	private double valorKwh;

	public double getConsumoKwh() {
		return consumoKwh;
	}

	public double getValorKwh() {
		return valorKwh;
	}

	public void setConsumoKwh(double consumoKwh) {
		if (consumoKwh > 0) {
			this.consumoKwh = consumoKwh;
		} else {
			System.out.println("Erro: O consumo em kWh deve ser maior que 0.");
		}
	}

	public void setValorKwh(double valorKwh) {
		if (valorKwh > 0) {
			this.valorKwh = valorKwh;
		} else {
			System.out.println("Erro: O valor por kWh deve ser maior que 0.");
		}
	}

	public double calcularValorTotal() {
		return this.consumoKwh * this.valorKwh;
	}
}