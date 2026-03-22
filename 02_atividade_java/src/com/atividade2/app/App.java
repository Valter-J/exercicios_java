package com.atividade2.app;

import  java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. 

        // Criando o objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Declaracao de variável

        int x;

        // Impressao no terminal para digitar o número

        System.out.println("Digite um número e verifique se ele é par ou ímpar");
        x = sc.nextInt();


        // Verificação se é impar ou par
        if (x % 2 == 0) {
            System.out.println( "Seu número é Par");
        }
        else{
            System.out.println("Seu número é impar");
        }

        
        // Fecha o objeto Scanner
        sc.close();


       
    }
}
