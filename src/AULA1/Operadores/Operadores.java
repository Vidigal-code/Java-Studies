package AULA1.Operadores;

public class Operadores {
    public static void main(String[] args) {
        // * / + -

        int num1 = 7;
        int num2 = 5;
        int soma = num1 + num2;
        int multiplica = num1 * num2;
        double divisão = num1 / (double) num2;
        int subtração = num1 - num2;

        System.out.println("soma:" + soma);
        System.out.println("multiplica:" + multiplica);
        System.out.println("divisao:" + divisão);
        System.out.println("subtração:" + subtração);


        // % porcetagem

        float resto = 14000 % 9;
        System.out.println("resto:" + resto);

        // < , > , <=, => , == , !=

        boolean IsDez = 21 > 20;
        System.out.println("Bolean:" + IsDez);
    }
}
