package AULA5.OrientaçãoObjetos.ModificadorStaticFinal;

import AULA5.OrientaçãoObjetos.ModificadorStaticFinal.DadosModificadorFinal.Carro;

public class ModificadorMain {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.comprar.setNome("ae");
        System.out.println(carro.comprar);
    }
}
