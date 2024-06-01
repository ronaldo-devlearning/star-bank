import entidades.Cliente;
import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaPoupanca;

import java.util.Locale;

public class Aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Cliente cliente1 = new Cliente();
		cliente1.setNome("Francisco da Silva");

		Conta cc = new ContaCorrente(cliente1);
		Conta cp = new ContaPoupanca(cliente1);

		cc.depositar(1000);
		cc.sacar(100);
		cc.transferir(200, cp);

		cc.imprimirExtrato();

		System.out.println();

		cp.imprimirExtrato();

	}

}
