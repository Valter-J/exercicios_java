package com.calca.app;

import java.util.Scanner;

import com.calca.models.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite os valores do triangulo");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("O valor da area do tringulo é " + x.areatringulo());       

        



            


    sc.close();
    }
}
