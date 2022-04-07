public abstract  class Conta {
    protected double saldo;
    private Integer agencia;
    private String numero; //A conta é apenas com número nesse escopo
    private Cliente titular;
    private static int totalContasCriadas;

    Conta(Integer agencia, String numero, Cliente titular  ){
        this.saldo = 0;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        Conta.totalContasCriadas++;
    }

    public abstract void deposita(double valor);
    boolean saca(double valor){
        if(this.saldo>= valor){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }
    boolean transfere(double valor, Conta destino){
        if(this.saldo>= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        else{
            return false;
        }
    }

    static String getNomeCliente(Conta conta){
        return Cliente.getNome(conta.titular);
    }
    static double getSaldo(Conta conta){
        return conta.saldo;
    }

    public static int getTotalContasCriadas() {
        return totalContasCriadas;
    }
}
