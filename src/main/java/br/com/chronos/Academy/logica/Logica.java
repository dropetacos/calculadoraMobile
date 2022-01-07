package br.com.chronos.Academy.logica;

public class Logica {

    /*
    Criar um método que receba um objeto do tipo inteiro, representando o tamanho de um terreno.
    Caso o valor seja maior que 100 retornar "Terreno Grande" se for menor "Terreno Pequeno"
     */

    /*
    Será criado um método que irá retornar uma string (Public String) e receberá um objeto do tipo inteiro
    dentro do método teremos a variável int e o objeto.
     */

    public String getTipoTerreno(int terreno){
        if (terreno > 100){
            return "Terreno Grande";
        }
        return "Terreno Pequeno";
    }

}
