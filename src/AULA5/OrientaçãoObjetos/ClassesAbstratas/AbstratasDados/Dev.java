package AULA5.OrientaçãoObjetos.ClassesAbstratas.AbstratasDados;

public class Dev extends Funcionario{
    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", Salario=" + Salario +
                "} ";
    }
    @Override
    public void calcularbonus(){
        this.Salario += Salario * 0.05;
    }
    public Dev(String nome, double salario) {
        super(nome, salario);
    }
}
