package AULA5.OrientaçãoObjetos.SobreCargasMetodos;

import AULA5.OrientaçãoObjetos.SobreCargasMetodos.DadosAnime.DadosAnime;

public class AnimeMain {
    public static void main(String[] args) {
        DadosAnime anime = new DadosAnime();
        anime.carga("Naruto", "TV", 7,"AVENTURA");
        anime.imprime();
    }
}
