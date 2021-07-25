package com.projetoNo;

public class Main {


    public static void main(String[] args){


        No<String> no1 = new No<>("Conteúdo no1");

        No no2 = new No<>("Conteúdo no2");
        no1.setProximoNo(no2);

        No<String> no3 = new No<>("Conteúdo no3");
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Conteúdo no4");
        no3.setProximoNo(no4);

        No[] no = {no1, no2, no3 ,no4};


        for(int i = 0; i < no.length; i++){
            System.out.println(no[i]);
            System.out.println(no[i].getProximoNo());
            System.out.println("-----------------");
        }


    }
}
