package com.objeto.models;

import com.objeto.repository.Ataques;

public class Cachoroo implements Ataques{


    @Override
    public void mordida() {
        System.out.println("O cachorro morde com a mandibula");
    }

    @Override
    public void corrida() {
        System.out.println("O cachorro corre com as 4 patas");
    }


    


}
