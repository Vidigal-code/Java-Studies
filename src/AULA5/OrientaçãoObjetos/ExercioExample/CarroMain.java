package AULA5.OrientaçãoObjetos.ExercioExample;

import AULA5.OrientaçãoObjetos.ExercioExample.DadosCarro.DadosDoCarros;

public class CarroMain {
    public static void main(String[] args){
        DadosDoCarros Carros = new DadosDoCarros();
        DadosDoCarros Carros2 = new DadosDoCarros();

        Carros.nome = "Fusca";
        Carros.placa = "74hi";
        Carros.ano = 1970;

        Carros2.nome = "Ferrari";
        Carros2.placa = "84hi";
        Carros2.ano = 1995;

        System.out.println(Carros.nome);
        System.out.println(Carros.placa);
        System.out.println(Carros.ano);
        System.out.println("-----------------");
        System.out.println(Carros2.nome);
        System.out.println(Carros2.placa);
        System.out.println(Carros2.ano);
    }
}
