package com.pilha;

public class Pilha {

    private No refNoEntrada;

    public Pilha() {

        this.refNoEntrada = null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntrada;
        refNoEntrada = novoNo;
        refNoEntrada.setRefNo(refAuxiliar);
    }

    public No pop(){
        if (!this.isEmpty()){
            No noPoped = refNoEntrada;
            refNoEntrada = refNoEntrada.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntrada;
    }

    public boolean isEmpty(){
        if (refNoEntrada == null){
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public String toString() {
        String stringReturn = "--------\n";
        stringReturn+= " Pilha\n";
        stringReturn += "--------\n";

        No noAuxiliar = refNoEntrada;

        while (true){
            if (noAuxiliar != null){
                stringReturn += "[No{dado=" +noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }
            else {
                break;
            }
        }
        stringReturn += "========\n";
        return stringReturn;
    }
}
