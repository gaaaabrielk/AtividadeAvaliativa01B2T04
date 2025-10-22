package fag;

import fagobjeto.*;

public class Main{

	public static void main(String[] args) {
		System.out.println("1. Classe ContaBancaria");
		ContaBancaria conta = new ContaBancaria();
		conta.setTitular("João da Silva");
		conta.depositar(1500.0);
		conta.sacar(800.0);
		System.out.println("Saldo final: " + conta.getSaldo());
		System.out.println("n");

		System.out.println("2. Classe Filme");
		Filme filme1 = new Filme("Interestelar", 5.0);
		Filme filme2 = new Filme();
		filme2.setTitulo("Openheimer");
		filme2.setAvaliacao(4.8);
		filme1.exibir();
		filme2.exibir();
		System.out.println("n");

		System.out.println("3. Classe Funcionario");
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Abel Souza");
		funcionario.setSalario(3700.0);
		System.out.println("Salário antes do aumento: " + funcionario.getSalario());
		funcionario.aumentarSalario(10.0);
		System.out.println("Salário depois do aumento: " + funcionario.getSalario());
		System.out.println("n");

		System.out.println("4. Classe Retangulo");
		Retangulo retangulo = new Retangulo();
		retangulo.setLargura(5.0);
		retangulo.setAltura(8.0);
		System.out.println("Área: " + retangulo.area());
		System.out.println("Perímetro: " + retangulo.perimetro());
		System.out.println("n");

		System.out.println("5. Classe Musica");
		Musica musica1 = new Musica();
		musica1.setTitulo("Muleque de Vila Projota");
		musica1.setDuracaoSegundos(477);
		Musica musica2 = new Musica();
		musica2.setTitulo("Helipa YagoProprio");
		musica2.setDuracaoSegundos(328);
		System.out.println("Música: " + musica1.getTitulo() + " - Duração: " + musica1.formatarDuracao());
		System.out.println("Música: " + musica2.getTitulo() + " - Duração: " + musica2.formatarDuracao());
		System.out.println("\n");

		System.out.println("6. Classe Pessoa");
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Vinicios franco");
		pessoa.setPeso(88.5);
		pessoa.setAltura(1.95);
		System.out.printf("IMC: %.2f\n", pessoa.calcularIMC());
		System.out.println("Classificação: " + pessoa.classificacaoIMC());
		System.out.println("\n");

		System.out.println("7. Classe ContaLuz");
		ContaLuz contaLuz = new ContaLuz();
		contaLuz.setConsumoKwh(190.0);
		contaLuz.setValorKwh(0.85);
		System.out.printf("Valor a pagar: R$ %.2f\n", contaLuz.calcularValorTotal());
		System.out.println("\n");

		System.out.println("8. Classe BicicletaAlugada");
		BicicletaAlugada aluguel = new BicicletaAlugada();
		aluguel.setHoras(3);
		aluguel.setValorHora(15.50);
		System.out.printf("Valor final do aluguel: R$ %.2f\n", aluguel.calcularValor());
		System.out.println("\n");

		System.out.println("9. Classe ProdutoEstoque");
		ProdutoEstoque produto = new ProdutoEstoque();
		produto.setNome("Caneta");
		produto.setQuantidade(200);
		produto.adicionarEstoque(50);
		produto.removerEstoque(25);
		System.out.println("Quantidade final em estoque: " + produto.getQuantidade());
		System.out.println("\n");

		System.out.println("10. Classe Temperatura");
		Temperatura temp = new Temperatura();
		temp.setCelsius(25.0);
		System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", temp.paraFahrenheit());
		System.out.printf("Temperatura em Kelvin: %.2f K\n", temp.paraKelvin());
		System.out.println("\n");
	}
}




