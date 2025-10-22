package fagobjeto;

public class ContaBancaria {
	private String titular;
	private double saldo;

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setTitular(String titular) {
		if (titular == null || titular.trim().isEmpty()) {
			System.out.println("Erro: O titular não pode ser vazio.");
		} else {
			this.titular = titular;
		}
	}

	private void setSaldo(double saldo) {
		if (saldo < 0) {
			System.out.println("Erro: O saldo não pode ser negativo.");
		} else {
			this.saldo = saldo;
		}
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("Erro: O valor do depósito deve ser positivo.");
		}
	}

	public void sacar(double valor) {
		if (this.saldo - valor < 0) {
			System.out.println("Erro: Saldo insuficiente para o saque.");
		} else {
			this.saldo -= valor;
		}
	}
}