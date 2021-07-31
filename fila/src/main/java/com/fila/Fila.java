package com.fila;

public class Fila {
    private No refNoEntrada;

    public Fila() {
        this.refNoEntrada  = null;
    }

    public void enqueue(No newNo){
        newNo.setRefNo(refNoEntrada);
        refNoEntrada = newNo;
    }

    public No first(){

        if(!this.isEmpty()){
            No firstNo = refNoEntrada;
            while (true){
                if(firstNo.getRefNo() != null){
                    firstNo = firstNo.getRefNo();
                }else{
                    break;
                }
            }
            return  firstNo;

        }
        return null;
    }

    public No dequeue(){
        if (!this.isEmpty()){
            No firstNo = refNoEntrada;
            No noAuxiliar = refNoEntrada;
            while (true){
                if (firstNo.getRefNo() != null){
                    noAuxiliar = firstNo;
                    firstNo = firstNo.getRefNo();
                }
                else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return firstNo;
        }
        return null;
    }


    public boolean isEmpty(){
        return refNoEntrada == null? true : false;
    }

    @Override
    public String toString() {
        String stringReturn = "";
        No noAuxiliar = refNoEntrada;

        if (refNoEntrada != null){
            while (true){
                stringReturn += "[No{objeto=" + noAuxiliar.getObject()+"}]-->";
                if (noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }
                else {
                    stringReturn += "null";
                    break;
                }
            }
        }
        else {
            stringReturn = "null";
        }


        return stringReturn;
    }
}
