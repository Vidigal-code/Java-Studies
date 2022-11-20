package AULA5.OrientaçãoObjetos.Gassociação4;

import AULA5.OrientaçãoObjetos.Gassociação4.Dados.Aluno;
import AULA5.OrientaçãoObjetos.Gassociação4.Dados.Local;
import AULA5.OrientaçãoObjetos.Gassociação4.Dados.Professor;
import AULA5.OrientaçãoObjetos.Gassociação4.Dados.Seminario;

public class ExecuteMain {
    public static void main(String[] args) {
        Local local = new Local("DF/BRASILIA");
        Aluno aluno = new Aluno("Breno", 17);
        Professor professor = new Professor("Thunderte", "sergay");
        Aluno[] alunos = {aluno};
        Seminario seminario = new Seminario("Como dar a bunda", alunos, local);
        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);

        professor.imprime();
        System.out.println("Breno voce reprovou em todos os teste, n serve para ser um de nós");
        System.out.println("Seu Destino é Ser Gigachad");
    }
}
