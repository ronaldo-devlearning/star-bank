package entidades;

public class ContaCorrente extends Conta {

    private double taxaSaque = 10.0;
    private double taxaTransf = 20.0;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor + taxaSaque;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor + taxaTransf - taxaSaque);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.printf("Bem-vindo ao autoatendimento STAR BANK, %s! Segue o extrato da sua conta corrente.\n",
                getCliente().getNome());
        super.imprimirExtrato();
    }

}
