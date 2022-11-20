package AULA5.OrientaçãoObjetos.Gassociação4.Dados;

public class Aluno {
    private String nome;
    private int Idade;

    public Aluno(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        Idade = idade;
        this.seminario = seminario;
    }

    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        Idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }
}
