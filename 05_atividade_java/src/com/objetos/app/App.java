package com.objetos.app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in);

        String nome;
        double altura;
        double idade;


        System.out.println("Digite seu nome");
        nome = sc.nextLine();
        System.out.println("Digite sua idade");
        altura = sc.nextDouble();        
        System.out.println("Digite sua altura");
        idade = sc.nextDouble(); 
        
        
        System.out.println("Seu nome é " + nome + "Sua idade é " + idade + "e você tem uma altura de " + altura);

        sc.close();

    }

}
