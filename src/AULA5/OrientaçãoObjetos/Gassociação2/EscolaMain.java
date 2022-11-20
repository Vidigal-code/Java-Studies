package AULA5.OrientaçãoObjetos.Gassociação2;

import AULA5.OrientaçãoObjetos.Gassociação2.EscolaDados.DadosEscola;
import AULA5.OrientaçãoObjetos.Gassociação2.EscolaDados.ProfessorDados;

public class EscolaMain {
    public static void main(String... args) {
        ProfessorDados professor = new ProfessorDados("Kaique");
        ProfessorDados professor2 = new ProfessorDados("ABC");
        ProfessorDados[] professores =  { professor, professor2
        } ;

        DadosEscola escola = new DadosEscola("A", professores);

        escola.imprime();

    }
}
