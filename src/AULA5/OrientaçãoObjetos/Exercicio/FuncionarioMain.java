package AULA5.OrientaçãoObjetos.Exercicio;

import AULA5.OrientaçãoObjetos.Exercicio.DadosFuncionario.Funcionario;

public class FuncionarioMain {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Ariana");
        funcionario.setIdade(17);
        funcionario.setSalarios(new double[]{400, 400,2000});
        funcionario.imprime();
        System.out.println("\n-----------" +"\n" + funcionario.getMedia());
    }
}
