package AULA5.OrientaçãoObjetos.Polimorfismo;

import AULA5.OrientaçãoObjetos.Polimorfismo.DadosServico.CalcularImposto;
import AULA5.OrientaçãoObjetos.Polimorfismo.PolimorfismoDados.Computador;
import AULA5.OrientaçãoObjetos.Polimorfismo.PolimorfismoDados.Produto;
import AULA5.OrientaçãoObjetos.Polimorfismo.PolimorfismoDados.Tomate;

public class PolisfismoMain2 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen Generation", 1000);
        Produto produto2 = new Tomate("Franceis", 20);
        System.out.println("Nome: "+produto1.getNome());
        System.out.println("Valor: "+produto1.getValor());
        System.out.println("Imposto Taxado: "+produto1.calcularimposto());
        System.out.println("__________________________________");
        System.out.println("Nome: "+produto2.getNome());
        System.out.println("Valor: "+produto2.getValor());
        System.out.println("Imposto taxado: "+produto2.calcularimposto());
        System.out.println("__________________________________");

    }
}
