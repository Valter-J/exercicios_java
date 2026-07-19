package com.objeto.models;

import com.objeto.repository.Ataques;

public class Gato implements Ataques {



    @Override
    public void mordida() {
        System.out.println("O gato morde com a mandibula");
    }

    @Override
    public void corrida() {
        System.out.println("O gato corre com 4 patas");
    }


}
