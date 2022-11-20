package AULA5.OrientaçãoObjetos.Gassociação;

import AULA5.OrientaçãoObjetos.Gassociação.DadosGassociacao.Jogador;
import AULA5.OrientaçãoObjetos.Gassociação.DadosGassociacao.Time;

public class JogadorMain {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Maradona");
        Jogador[] jogadores = {jogador, jogador1, jogador2};
        Time time = new Time("Brazil");

        for (Jogador execute : jogadores) {
            jogador.setTime(time);
            execute.imprime();

        }
    }
}
