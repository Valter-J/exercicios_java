package com.objetos.app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");



        String nome;
        double altura;
        double idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome");
        nome = sc.nextLine();
        System.out.println("Digite sua idade");
        altura = sc.nextDouble();        
        System.out.println("Digite seu nome");
        idade = sc.nextDouble();        
        




        sc.close();

    }

}
