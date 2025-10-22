package fagobjeto;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			System.out.println("Erro: O nome não pode ser vazio.");
		} else {
			this.nome = nome;
		}
	}

	public void setPeso(double peso) {
		if (peso > 0) {
			this.peso = peso;
		} else {
			System.out.println("Erro: O peso deve ser maior que 0.");
		}
	}

	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		} else {
			System.out.println("Erro: A altura deve ser maior que 0.");
		}
	}

	public double calcularIMC() {
		return this.peso / (this.altura * this.altura);
	}

	public String classificacaoIMC() {
		double imc = calcularIMC();
		if (imc < 18.5)
			return "Abaixo do peso";
		else if (imc < 24.9)
			return "Normal";
		else if (imc < 29.9)
			return "Sobrepeso";
		else
			return "Obesidade";
	}
}
