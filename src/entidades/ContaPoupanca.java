package entidades;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	@Override
	public void imprimirExtrato() {
		System.out.printf("Bem-vindo ao autoatendimento STAR BANK, %s! Segue o extrato da sua poupança.\n",
				getCliente().getNome());
		super.imprimirExtrato();
	}
	
}
