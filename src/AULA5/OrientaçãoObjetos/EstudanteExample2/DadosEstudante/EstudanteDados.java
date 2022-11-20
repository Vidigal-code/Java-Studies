package AULA5.OrientaçãoObjetos.EstudanteExample2.DadosEstudante;

public class EstudanteDados {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime( ){

        System.out.println("\n----------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
