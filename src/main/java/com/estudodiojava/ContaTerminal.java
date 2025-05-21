package com.estudodiojava;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int saldo = 25;
        int valorSolicitado = 18;

        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
        } else {

        }
        System.out.println(saldo);
    }
}