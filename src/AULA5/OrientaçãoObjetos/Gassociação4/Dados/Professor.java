package AULA5.OrientaçãoObjetos.Gassociação4.Dados;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;
    private Local local;

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void imprime(){
        if(seminarios == null) return;
        System.out.println("--SEMINARIOOS CADASTRADOS--");
        for(Seminario seminarios : this.seminarios ){
            System.out.println("Professor: "+this.nome);
            System.out.println("Tema: "+ seminarios.getTitulo());
            System.out.println("local: " + seminarios.getLocal().getEndereco());
            if(seminarios.getAlunos() == null) continue;
            System.out.println("--Alunos--");
            for(Aluno aluno : seminarios.getAlunos()){
                System.out.println("Aluno: "+aluno.getNome() +"\n" + "Idade: " +aluno.getIdade());
            }

        }
    }

}
