public class Gerente extends Funcionario {

    private int senha;

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    public double getBonificacao() {
        return this.salario;
    }
}