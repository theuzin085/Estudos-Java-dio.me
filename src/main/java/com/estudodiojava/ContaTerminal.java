package com.estudodiojava;


import java.util.Scanner;

import static java.lang.System.out;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        out.println("===================================");
        out.println(" Sejam Bem-Vindos ao Banco Central");
        out.println("===================================");


        out.println("Digite seu nome e sobrenome: ");
        String nome = scanner.nextLine();

        out.println("Digite Sua agencia: ");
        String age = scanner.nextLine();

        out.println("Digite o numero da conta: ");
        int nu = scanner.nextInt();

        out.println("Digite o Valor de deposito: ");
        int Saldo = scanner.nextInt();

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência:"+ age + " Numero da conta:"+ nu + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
}