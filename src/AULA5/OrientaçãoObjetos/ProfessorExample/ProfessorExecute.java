package AULA5.OrientaçãoObjetos.ProfessorExample;

import AULA5.OrientaçãoObjetos.ProfessorExample.DadosProfessor.ProfessorClasses;

public class ProfessorExecute {
    public static void main(String[] args) {
        ProfessorClasses Professor = new ProfessorClasses();
        Professor.nome = "Ruan";
        Professor.idade = 45;
        Professor.sexo = 'M';
        System.out.println("Sou o Professor " +Professor.nome+ ", Minha Idade é "+Professor.idade+ ", Sou do Género "+Professor.sexo);
    }
}
