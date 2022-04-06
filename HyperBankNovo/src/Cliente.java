public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;

    Cliente(String nome, String cpf, String profissao){
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    static String getNome(Cliente cliente){
        return cliente.nome;
    }
}
