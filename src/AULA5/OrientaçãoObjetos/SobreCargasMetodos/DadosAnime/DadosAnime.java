package AULA5.OrientaçãoObjetos.SobreCargasMetodos.DadosAnime;

public class DadosAnime {
    private String tipo;
    private String nome;
    private String genero;
    private int episodio;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public String getNome() {
        return nome;
    }


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodio);
        System.out.println(this.genero);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




    public void carga(String nome, String tipo, int episodio) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;

    }

    public void carga(String nome, String tipo, int episodio, String genero) {
        this.carga(nome, tipo, episodio);
        this.genero = genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getTipo() {
        return this.tipo;

    }

    public int getEpisodio() {
        return this.episodio;

    }

}

