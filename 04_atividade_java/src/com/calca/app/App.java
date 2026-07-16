package com.calca.app;

import java.util.Scanner;

import com.calca.models.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        Triangulo tringulo = new Triangulo();
        x = new Triangulo();
        y = new Triangulo();
        tringulo.name = "Nome do triangulo";


        System.out.println("Digite os valores do triangulo");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("O valor da area do tringulo é " + x.areatringulo()); 
        
        System.out.println("O nome do triangulo é: " + tringulo);

        



            


    sc.close();
    }
}
