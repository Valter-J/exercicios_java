package com.array.app;

import com.array.models.ClasseTesteArrays;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in);

        ClasseTesteArrays array = new ClasseTesteArrays();


        double [] testeArray = new double[3];



       array.inserirdeArrays(3, testeArray);


       System.out.println(testeArray[1]);

        sc.close();


    }
}
