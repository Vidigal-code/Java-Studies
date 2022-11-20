package AULA1.Operadores;

public class OperadorLogicoOu {
    public static void main(String[] args) {
        // && (E) , || (OU) , ! (NEGAÇÃO)

        double Contacorrente = 200;
        double ContaPoupança = 6000;
        float play = 5000;
        boolean comprar = Contacorrente > play || ContaPoupança > play;
        System.out.println("Comprou:" + comprar);

    }
}
