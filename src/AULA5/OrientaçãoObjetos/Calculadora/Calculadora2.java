package AULA5.OrientaçãoObjetos.Calculadora;

import AULA5.OrientaçãoObjetos.Calculadora.CalculadoraDados.CalculadoraDados;

public class Calculadora2 {
    public static void main(String[] args) {
        CalculadoraDados calcular = new CalculadoraDados();
        int num1 = 22;
        int num2 = 24;

        calcular.alterar(num1,num2);
        System.out.println("\nexecutor");
        System.out.println(num1);
        System.out.println(num2);

    }
}
