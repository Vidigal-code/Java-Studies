package AULA5.OrientaçãoObjetos.EstudanteExample2;

import AULA5.OrientaçãoObjetos.EstudanteExample2.DadosEstudante.EstudanteDados;

public class EstudanteMain {
    public static void main(String[] args) {
        EstudanteDados estudante = new EstudanteDados();
        EstudanteDados estudante2 = new EstudanteDados();
        ImprimirEstudante impressora = new ImprimirEstudante();

        estudante.nome = "Jonas";
        estudante.idade = 22;
        estudante.sexo = 'M';

        estudante2.nome = "Erika";
        estudante2.idade = 15;
        estudante2.sexo = 'F';
        estudante.imprime();
        estudante2.imprime();

    }

}
