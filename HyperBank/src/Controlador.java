public class Controlador {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Luiz T");
        funcionario.setCpf("123123123-12");
        funcionario.setSalario(35967.68);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getBonificacao());

    }
}
