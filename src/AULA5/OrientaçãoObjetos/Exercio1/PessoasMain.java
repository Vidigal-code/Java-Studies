package AULA5.OrientaçãoObjetos.Exercio1;

import AULA5.OrientaçãoObjetos.Exercio1.DadosPessoa.PessoaDados;

public class PessoasMain {
    public static void main(String[] args) {
        PessoaDados pessoa = new PessoaDados();
        pessoa.setNome("Julian");
        pessoa.setIdade(7);
//        pessoa.imprime();
    System.out.println(pessoa.getNome());
    System.out.println(pessoa.getIdade());
    }
}

