package AULA1.Operadores;

public class OperadorLogicoE {
    public static void main(String[] args) {
        // && (E) , || (OU) , ! (NEGAÇÃO)
        int idade = 10;
        float salario = 4700F;
        boolean verleimaior = idade > 35 && salario >= 4602;
        boolean verleimenor = idade < 35 && salario >= 3301;

        System.out.println("ver lei maior:" + verleimaior);
        System.out.println("ver lei menor:" + verleimenor);

    }
}
