package com.objeto.models;

import com.objeto.repository.Ataques;
import com.objeto.repository.Habbitat;
import com.objeto.repository.TipoEspecie;

public class Gato implements Ataques, TipoEspecie, Habbitat {



    @Override
    public void mordida() {
        System.out.println("O gato morde com a mandibula");
    }

    @Override
    public void corrida() {
        System.out.println("O gato corre com 4 patas");
    }

    @Override
    public void tipoHabbitata() {
        System.out.println("O tipo de habbitat do gato é terreste");
    }

    @Override
    public void especie() {
        System.out.println("A espécie do gatinho é o gathonessssssss");
    }


}
