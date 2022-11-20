package AULA5.OrientaçãoObjetos.ClassesAbstratas.AbstratasDados;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double Salario;

    @Override
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.Salario);
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        Salario = salario;
        calcularbonus();
    }


    public abstract void  calcularbonus();
}
