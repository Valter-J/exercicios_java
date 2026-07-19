package com.objeto.app;

import com.objeto.models.Animal;
import com.objeto.models.Cachoroo;
import com.objeto.models.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        
       Animal animais = new Animal();


       animais.ataqueAnimal(new Gato());
       animais.ataqueAnimal(new Cachoroo());








    }
}
