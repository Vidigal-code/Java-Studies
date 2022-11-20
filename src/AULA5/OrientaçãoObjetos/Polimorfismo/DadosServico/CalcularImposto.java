package AULA5.OrientaçãoObjetos.Polimorfismo.DadosServico;

import AULA5.OrientaçãoObjetos.Polimorfismo.PolimorfismoDados.Computador;
import AULA5.OrientaçãoObjetos.Polimorfismo.PolimorfismoDados.Tomate;

public class CalcularImposto {

    public static void calcularPC(Computador computador){
        System.out.println("Calcular Imposto PC");
        double imposto = computador.calcularimposto();
        System.out.println("Computador "+computador.getNome());
        System.out.println("Valor "+computador.getValor());
        System.out.println("Imposto a ser pago pelo PC "+imposto);
    }
    public static void calcularTomate(Tomate tomate){
        System.out.println("Calcular Tomate");
        double imposto = tomate.calcularimposto();
        System.out.println("Tomate "+tomate.getNome());
        System.out.println("Valor "+tomate.getValor());
        System.out.println("Imposto a ser pago pelo Tomate "+imposto);
    }
}
