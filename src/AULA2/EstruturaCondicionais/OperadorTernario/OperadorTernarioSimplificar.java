package AULA2.EstruturaCondicionais.OperadorTernario;

public class OperadorTernarioSimplificar {
    public static void main(String[] args) {
        double salario = 7000;
        String Resultado = salario > 5000 ? "500 REAIS" : "NAO POSSO";
        boolean Possodoar = salario > 5000 ? true : false;

        System.out.println(Resultado);
        System.out.println(Possodoar);

    }
}