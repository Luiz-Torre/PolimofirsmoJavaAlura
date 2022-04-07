public class Controlador {
    public static void main(String[] args){
        Gerente g1 = new Gerente();
        g1.setNome("Luiz T");
        g1.setCpf("123123123-12");
        g1.setSalario(35967.68);

        Secretario s = new Secretario();
        s.setSalario(1000);
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(s);

        System.out.println(controle.getSoma());
    }
}
