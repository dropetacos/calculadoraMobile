package br.com.chronos.Academy.logica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicaTest {

    /*
    Iremos criar 2 métodos. 1 para Validar o Terreno Grande e o outro o Terreno Pequeno.
    - Instanciar esse objeto para que possamos utilizar os métodos da classe Lógica
    - Utilizar o método getTipoTerreno
     */

    @Test
    public void validaTerrenoGrande(){
        Logica logica = new Logica();
        logica.getTipoTerreno(101);
    }

    @Test
    public void validaTerrenoPequeno(){
        Logica logica = new Logica();
        logica.getTipoTerreno(100);
    }

}