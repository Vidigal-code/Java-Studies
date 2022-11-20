package AULA5.OrientaçãoObjetos.EstudanteExample1;
import AULA5.OrientaçãoObjetos.EstudanteExample1.DadosEstudante1.EstudanteClasses01;

public class IntroduçaoClassesExecutor01 {
    public static void main(String[] args) {
        EstudanteClasses01 estudante = new EstudanteClasses01();
        EstudanteClasses01 estudante2 = new EstudanteClasses01();

        estudante.nome = "Jonas";
        estudante.idade = 22;
        estudante.sexo = 'M';

        estudante2.nome = "Erika";
        estudante2.idade = 15;
        estudante2.sexo = 'F';


        System.out.println("\n"+estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("\n----------------");


        System.out.println("\n"+estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
