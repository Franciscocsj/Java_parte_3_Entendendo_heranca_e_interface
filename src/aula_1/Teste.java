package aula_1;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Xico");
        nomes.add("Kei");
        nomes.add("felipe");

        System.out.println("---------------");

        System.out.println(nomes.toString());

        System.out.println("---------------");

        for (int i=0; i<20; i++){
            System.out.println(i);
        }

        System.out.println("---------------");


        for (String s: nomes) {
            System.out.println(s);

        }










    }
}
