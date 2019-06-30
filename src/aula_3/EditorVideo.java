package aula_3;

import aula_1.Funcionario;

public class EditorVideo extends Funcionario {

    public double getBonificacao() {
        return super.getBonificacao() + 100;
    }
}
