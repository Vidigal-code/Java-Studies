package AULA5.OrientaçãoObjetos.ConstrutoresExample.ConstrutoresDados;

public class DadosConstrutor {
    private String tipo;
    private String nome;
    private String genero;

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    private String estudio;
    private int episodio;

    public String getGenero() {
        return genero;
    }

    public DadosConstrutor(String nome, String tipo, int episodio, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodio = episodio;
        this.genero = genero;
    }

    public DadosConstrutor(String nome, String tipo, int episodio, String genero, String estudio) {
        this(nome, tipo, episodio, genero);
        this.estudio = estudio;

    }

    public DadosConstrutor() {
        System.out.println("Dentro do constrtutor vazio");
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
        System.out.println(this.estudio);
    }

    public void setNome(String nome) {
        this.nome = nome;
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



