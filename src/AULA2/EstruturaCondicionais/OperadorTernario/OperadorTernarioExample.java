package AULA2.EstruturaCondicionais.OperadorTernario;

public class OperadorTernarioExample {
    public static void main(String[] args) {
        double salario = 4000;
        String Doar = "500 REAIS";
        String NoDoar = "NAO POSSO";
        String Resultado;
        if (salario > 5000) {
            Resultado = Doar;
        } else {
            Resultado = NoDoar;
        }
        System.out.println(Resultado);
    }
}
