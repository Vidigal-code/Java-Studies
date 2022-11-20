package AULA5.OrientaçãoObjetos.Gassociação.DadosGassociacao;

public class Jogador {
    private String nome;
    private Time time;

    public Time getTime() {
        return time;
    }

    public Jogador(String nome, Time time) {
        this.nome = nome;
        this.time = time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        if(time != null) {
            System.out.println(time.getNome());
        }

    }


}
