public class ContaPoupanca extends Conta {
    ContaPoupanca(Integer agencia, String numero, Cliente titular) {
        super(agencia, numero, titular);
    }
    @Override
    public void deposita(double valor){
        this.saldo += valor;
    }
}
