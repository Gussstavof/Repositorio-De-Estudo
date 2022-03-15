
package com.fila;

public class Main {

    public static void main(String[] args){

        Fila<String> fila = new Fila<>();

        String barra = "------------------------------";



        String[] posicao = {"Primeiro", "Segundo", "Terceiro", "Quarto"};

        for (int i = 0; i < posicao.length; i++){
            fila.enqueue((posicao[i]));
        }

        System.out.println(fila);

        System.out.println(barra);

        System.out.println(fila.isEmpty());

        System.out.println(barra);

        System.out.println(fila.dequeue());

        System.out.println(barra);

        System.out.println(fila);

        System.out.println(barra);

        fila.enqueue(("Quinto"));

        //fila.enqueue((6)); ERRO, Fila só com string

        System.out.println(fila);

        System.out.println(barra);

        System.out.println(fila.first());

        System.out.println(barra);

        System.out.println(fila);
    }
}
