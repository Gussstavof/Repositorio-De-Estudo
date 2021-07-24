package POO.Heranca.Poli;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
            String linha = "-----------------------";


            Gerente gerente = new Gerente();
            System.out.println(gerente.nome("Gustavo"));
            System.out.println(gerente.cargo("Gerente"));
            System.out.println(gerente.salario(10000.00));

            System.out.println(linha);

            Analista analista = new Analista();
            System.out.println(analista.nome("Gustavo"));
            System.out.println(analista.cargo("Analista"));
            System.out.println(analista.salario(5000.00));

            System.out.println(linha);

            Estagiario estagiario = new Estagiario();
            System.out.println(estagiario.nome("Ferreira"));
            System.out.println(estagiario.cargo("Estagiário"));
            System.out.println(estagiario.salario(1000.00));


    }
}
