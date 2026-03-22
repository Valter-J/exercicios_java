package com.exercicio1.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Exercício
        // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. 



        // 1º  Abrindo instância do objeto Scanner
        
        Scanner sc = new Scanner(System.in);

        // Declaração de variáveis
        int x;

        // Mostra mensagem para o usuario
        System.out.println("Digite um numero: ");
        x = sc.nextInt();


        // Estrutura com condição

        if (x >= 0) {
            System.out.println(x + " é um número não negativo. ");
        }
        else {
            System.out.println( x + " é um número negativo. ");
        }

        // Fecha o objeto
            sc.close();

    }
}
