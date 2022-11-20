package AULA5.OrientaçãoObjetos.EstudanteExample;
import AULA5.OrientaçãoObjetos.EstudanteExample.DadosEstudante.EstudanteClasses;

public class IntroduçaoClassesExecutor {
    public static void main(String[] args) {
        EstudanteClasses estudante = new EstudanteClasses();

        String nome = estudante.nome;
        int idade = estudante.idade;
        char sexo = estudante.sexo;

        estudante.nome = "Jonas";
        estudante.idade = 22;
        estudante.sexo = 'M';

        System.out.println("\n"+"Eu sou o "+nome+ ", Minha idade é "+idade+", Eu sou do género " +sexo);
        System.out.println("\n_________________");
        System.out.println("\n"+estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
