package aula_1;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario xico = new Funcionario();
        xico.setNome("Francisco");
        xico.setCpf("34896518732");
        xico.setSalario(1000);

        System.out.println(xico.getNome());
        System.out.println(xico.getCpf());
        System.out.println(xico.getSalario());
        System.out.println(xico.getBonificacao());

    }


}
