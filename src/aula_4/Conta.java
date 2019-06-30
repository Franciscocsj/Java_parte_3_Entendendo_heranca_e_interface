package aula_4;

import aula_4.Cliente;

public class Conta {

    //Private permite que o atributo somente seja modificado dentro da propria classe.
    //Atributos do tipo privado não podem nem ser lido nem modificados por classes que diferentes dela mesma.
    //Os dados nunca serão modificados diretamente.
    //Para isso, existe a palavra-chave static. O static faz com que o atributo seja da classe,
    //e não mais do objeto. Com isso, todo o objeto conta possui acesso a um único total.
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("o total de contas e " + total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou criando uma conta " + this.numero);
    }


    //metodo void não tem retorno ele recebe o paramentro executa algo e não retorna nada.
    //dentro do parenteses é o que ele recebe
    public void deposita(double valor) {
        this.saldo += valor;

    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            //mesmo que saldo = saldo - valor
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean tranfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;


    }


    //método que pega o saldo
    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int novoNumero) {
        if (numero <= 0) {
            System.out.println("não pode valor negativo");
            return;
        }
        this.numero = novoNumero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("não pode valor negativo");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
