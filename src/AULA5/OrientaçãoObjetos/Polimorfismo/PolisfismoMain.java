package AULA5.OrientaçãoObjetos.Polimorfismo;

import AULA5.OrientaçãoObjetos.Polimorfismo.DadosServico.CalcularImposto;
import AULA5.OrientaçãoObjetos.Polimorfismo.PolimorfismoDados.Computador;
import AULA5.OrientaçãoObjetos.Polimorfismo.PolimorfismoDados.Tomate;

public class PolisfismoMain {
    public static void main(String[] args) {
        Computador computador = new Computador("I7", 1000);
        Tomate tomate = new Tomate("Vermelho", 20);
        CalcularImposto.calcularPC(computador);
        System.out.println("-------------------");
        CalcularImposto.calcularTomate(tomate);
    }
}
