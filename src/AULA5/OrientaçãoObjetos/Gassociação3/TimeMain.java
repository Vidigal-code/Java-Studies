package AULA5.OrientaçãoObjetos.Gassociação3;

import AULA5.OrientaçãoObjetos.Gassociação3.DadosTime.Jogador;
import AULA5.OrientaçãoObjetos.Gassociação3.DadosTime.Time;

public class TimeMain {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brazil");
        Jogador[] jogadores = {jogador, jogador2};
        time.setJogadores(jogadores);
        jogador.setTime(time);
        jogador2.setTime(time);




        System.out.println("---Jogador-----");
        jogador.imprime();
        jogador2.imprime();

        System.out.println("---Time-----");
        time.imprime();


    }
}
