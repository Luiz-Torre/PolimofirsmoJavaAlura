public class Gerente extends Funcionario implements Autenticavel {


    private AutenticaGeral util;

    Gerente(){
        this.util = new AutenticaGeral();
    }
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do GERENTE");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha){
        this.util.setSenha(senha);
    }
    @Override
    public boolean autentica ( int senha){
        return this.util.autentica(senha);
    }
}