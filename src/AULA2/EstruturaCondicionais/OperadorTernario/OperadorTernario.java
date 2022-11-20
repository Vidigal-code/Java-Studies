package AULA2.EstruturaCondicionais.OperadorTernario;

public class OperadorTernario {
    public static void main(String[] args) {

        double salario = 7000;
        String Doar = "500 REAIS";
        String NoDoar = "NAO POSSO";
        String Resultado = salario > 5000 ? Doar : NoDoar;
        System.out.println(Resultado);

    }
}