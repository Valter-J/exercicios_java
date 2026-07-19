package com.objeto.models;

import com.objeto.repository.Ataques;

public class Animal {

    public void ataqueAnimal(Ataques ataques){
        ataques.corrida();
        ataques.mordida();
    }



}
