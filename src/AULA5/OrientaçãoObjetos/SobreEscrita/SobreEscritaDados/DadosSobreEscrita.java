package AULA5.OrientaçãoObjetos.SobreEscrita.SobreEscritaDados;

public class DadosSobreEscrita {
    private String nome;

    public DadosSobreEscrita(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "ANIME: "+this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
