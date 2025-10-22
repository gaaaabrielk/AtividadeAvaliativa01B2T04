package fagobjeto;

public class Temperatura {
	private double celsius;

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		if (celsius >= -273.15) {
			this.celsius = celsius;
		} else {
			System.out.println("Erro: A temperatura não pode ser menor que o zero absoluto (-273.15 °C).");
		}
	}

	public double paraFahrenheit() {
		return (this.celsius * 9.0 / 5.0) + 32;
	}

	public double paraKelvin() {
		return this.celsius + 273.15;
	}
}