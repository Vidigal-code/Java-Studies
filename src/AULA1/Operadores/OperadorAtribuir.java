package AULA1.Operadores;

public class OperadorAtribuir {
    public static void main(String[] args) {
        //= , +=, -=, /=, %=

        double bonus = 1200;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("valor " + bonus);
        System.out.println("-------------------");

        int contador = 0;
        contador++;
        System.out.println(contador);
    }
}
