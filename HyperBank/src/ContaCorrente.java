public class ContaCorrente extends Conta {
    public ContaCorrente(Integer agencia, String numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    @Override
    public void deposita(double valor){
        this.saldo += valor;
    }
}