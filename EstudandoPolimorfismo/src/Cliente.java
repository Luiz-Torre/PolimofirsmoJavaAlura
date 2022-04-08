public class Cliente implements Autenticavel {

    private AutenticaGeral util;
    public Cliente(){
        this.util = new AutenticaGeral();
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