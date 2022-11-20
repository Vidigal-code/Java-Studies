package AULA5.OrientaçãoObjetos.Gassociação2.EscolaDados;

public class DadosEscola {
    private String nome;
    private ProfessorDados[] professores;

    public String getNome() {
        return nome;
    }
    public DadosEscola(String nome) {
        this.nome = nome;
    }
    public DadosEscola(String nome, ProfessorDados[] professores) {
        this.nome = nome;
        this.professores = professores;
    }



    public void imprime() {
        System.out.println(this.nome);
        if (professores == null) return;
        for (ProfessorDados professor : professores) {
        System.out.println(professor.getNome());
        }

    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProfessorDados[] getProfessor() {
        return professores;
    }

    public void setProfessor(ProfessorDados[] professor) {
        this.professores = professor;
    }
}
