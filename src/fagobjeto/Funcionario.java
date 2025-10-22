package fagobjeto;

public class Funcionario {
	private String nome;
	private double salario;

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			System.out.println("Erro: O nome não pode ser vazio.");
		} else {
			this.nome = nome;
		}
	}

	public void setSalario(double salario) {
		if (salario >= 0) {
			this.salario = salario;
		} else {
			System.out.println("Erro: O salário não pode ser negativo.");
		}
	}

	public void aumentarSalario(double percentual) {
		if (percentual > 0) {
			this.salario += this.salario * (percentual / 100.0);
		} else {
			System.out.println("Erro: O percentual de aumento deve ser positivo.");
		}
	}
}