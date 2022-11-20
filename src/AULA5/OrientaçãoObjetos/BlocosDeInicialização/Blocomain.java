package AULA5.OrientaçãoObjetos.BlocosDeInicialização;

import AULA5.OrientaçãoObjetos.BlocosDeInicialização.BlocoDados.DadosBloco;

public class Blocomain {
    public static void main(String[] args) {
        DadosBloco blocos = new DadosBloco("Goku");
        DadosBloco bloco = new DadosBloco();
        bloco.setNome("Goku");
        bloco.getEpisidios();
        bloco.getNome();
        System.out.println(blocos.getNome());

    }
}
