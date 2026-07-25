package com.objeto.models;

import com.objeto.repository.Ataques;
import com.objeto.repository.Habbitat;
import com.objeto.repository.TipoEspecie;

public class Cachoroo implements Ataques, Habbitat, TipoEspecie{


    @Override
    public void mordida() {
        System.out.println("O cachorro morde com a mandibula");
    }

    @Override
    public void corrida() {
        System.out.println("O cachorro corre com as 4 patas");
    }

    @Override
    public void tipoHabbitata() {
        System.out.println("O cachorro vive em terreno Terrerstre");
    }

    @Override
    public void especie() {
        System.out.println("A especie do cachorro é cachorrão");
    }


    


}
