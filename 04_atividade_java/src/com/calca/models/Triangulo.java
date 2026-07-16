package com.calca.models;

    // classe triangulo
public class Triangulo {
    public double a;
    public double b;
    public double c;
    public String name;


    // metodos 
    public double areatringulo(){
        double p = (a + b + c)/ 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

    public String toString(){
        return name;
    }

}
