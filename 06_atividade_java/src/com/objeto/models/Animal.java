package com.objeto.models;

import com.objeto.repository.Ataques;
import com.objeto.repository.Habbitat;
import com.objeto.repository.TipoEspecie;;

public class Animal {

    public void ataqueAnimal(Ataques ataques){
        ataques.corrida();
        ataques.mordida();
    }


    public void tipoHabbitata( Habbitat habbitat){
        habbitat.tipoHabbitata();
    }

    public void TipoEspecie(TipoEspecie tipoEspecie){
        tipoEspecie.especie();
    }

}
