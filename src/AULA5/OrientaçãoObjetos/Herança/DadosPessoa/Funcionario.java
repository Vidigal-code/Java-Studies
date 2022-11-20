package AULA5.OrientaçãoObjetos.Herança.DadosPessoa;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome){

        super(nome);

        System.out.println("Dentro do construtor de Funcionario");
    }

    static {
        System.out.println("Dentro do bloco de inicializaçãp estatico de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização Funcionario 1 ");
    }
    {
        System.out.println("Dentro do bloco de inicialização Funcionario 2 ");
    }


    public double getSalario() {
        return salario;
    }
    public void imprime() {
        super.imprime();
        System.out.println( this.salario);
    }


    public void setSalario(double salario) {
        this.salario = salario;


    }
    public void relatorioPagamento(){
        System.out.println("Eu "+ this.nome+"Recebi o Salario de "+this.salario);
    }


}
