package fagobjeto;

public class Retangulo {
	private double largura;
	private double altura;

	public double getLargura() {
		return largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setLargura(double largura) {
		if (largura > 0) {
			this.largura = largura;
		} else {
			System.out.println("Erro: A largura deve ser maior que 0.");
		}
	}

	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		} else {
			System.out.println("Erro: A altura deve ser maior que 0.");
		}
	}

	public double area() {
		return this.largura * this.altura;
	}

	public double perimetro() {
		return 2 * (this.largura + this.altura);
	}
}