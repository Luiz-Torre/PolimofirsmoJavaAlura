public class Secretario extends Funcionario {
    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 100;
    }
}
