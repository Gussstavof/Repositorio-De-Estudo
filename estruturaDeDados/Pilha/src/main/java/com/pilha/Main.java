package com.pilha;

public class Main {

    public  static void main(String[] args){
        Pilha pilha = new Pilha();

        for (int i = 0; i <= 6; i++){
            pilha.push(new No(i));
        }

        System.out.println(pilha);

        System.out.println("Dado tirado da pilha: "+pilha.pop());

        System.out.println(pilha);

        pilha.push(new No(77));
        System.out.println(pilha);


    }
}
