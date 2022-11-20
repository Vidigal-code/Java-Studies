package AULA5.OrientaçãoObjetos.ClassesAbstratas.AbstratasDados;

public class Gerente extends Funcionario {
    public Gerente (String nome, double salario){
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", Salario=" + Salario +
                "} ";
    }
    @Override
    public void calcularbonus(){
        this.Salario += Salario * 0.2;
    }


}
