package aula_3;

import aula_1.Funcionario;
import aula_1.Gerente;

public class ControlleBonificacao {

    private double soma;


    public void registra(Funcionario f){
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }
}
