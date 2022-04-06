public class TestaBanco {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Luiz M", "222.222.222-22", "programador");

        Conta contaLuiz = new Conta(1, "1234-5", cliente);
        System.out.println(Conta.getNomeCliente(contaLuiz));
        contaLuiz.deposita(100);
        System.out.println(Conta.getSaldo(contaLuiz));
    }
}