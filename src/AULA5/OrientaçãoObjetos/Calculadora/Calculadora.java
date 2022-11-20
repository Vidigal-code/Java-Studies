package AULA5.OrientaçãoObjetos.Calculadora;

import AULA5.OrientaçãoObjetos.Calculadora.CalculadoraDados.CalculadoraDados;

public class Calculadora {
    public static void main(String... args) {
        CalculadoraDados calcular = new CalculadoraDados();
       int[] soma = {1,2,3};
        calcular.somaarrays(soma);
        calcular.SomaVarargs(1,2,3,4,5,6,7);
    }
}
