package com.array.app;

import java.util.Arrays;
import java.util.Scanner;

import com.array.models.ClasseTesteArrays;
import com.array.models.Produto;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        ClasseTesteArrays array = new ClasseTesteArrays();

        double[] testeArray = new double[3];

        array.inserirdeArrays(3, testeArray);

        System.out.println(testeArray[1]);

        

        System.out.println("===================================");
        System.out.println("Array com classes");
        System.out.println("Digite a quantidade de arrays");

        int n = sc.nextInt();

        sc.nextLine();
        Produto[] vetor = new Produto[n];

        for (int i = 0; i < vetor.length; i++) {
            String name = sc.nextLine();
            double preco = sc.nextDouble();
            vetor[i] = new Produto(name, preco);
            sc.nextLine();

        }

        System.out.println(Arrays.toString(vetor));

        sc.close();

    }
}
