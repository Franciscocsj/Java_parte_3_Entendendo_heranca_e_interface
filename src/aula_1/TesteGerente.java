package aula_1;

public class TesteGerente {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("39587416832");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(66666);
        boolean autenticou = g1.autentica(66666);


        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());
    }
}
