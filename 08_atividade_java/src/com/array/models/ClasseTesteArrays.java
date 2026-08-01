package com.array.models;   

import java.util.Scanner;


public class ClasseTesteArrays {


    private int numeroDeArrays;


    public int getNumeroDeArrays() {
        return this.numeroDeArrays;
    }

    public void setNumeroDeArrays(int numeroDeArrays) {
        this.numeroDeArrays = numeroDeArrays;
    }

    public ClasseTesteArrays(){

    }

    public double[] inserirdeArrays(int numeroDeArrays, double[] nomeDoArray ){

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o que é proposto dentro do array");
        for ( int i =0; i < numeroDeArrays; i++){
            
            nomeDoArray[i]= sc.nextDouble();

        }


        

        

        return nomeDoArray;

    }


}
