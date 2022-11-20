package AULA5.OrientaçãoObjetos.EstudanteExample2;

import AULA5.OrientaçãoObjetos.EstudanteExample2.DadosEstudante.EstudanteDados;

public class ImprimirEstudante {
        public void Imprimir(EstudanteDados estudante ){
            System.out.println("\n"+estudante.nome);
            System.out.println(estudante.idade);
            System.out.println(estudante.sexo);
        }
    }

