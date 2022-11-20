package AULA5.OrientaçãoObjetos.Calculadora.CalculadoraDados;

public class CalculadoraDados {
    public void somar() {
        System.out.println(15 + 10);
    }

    public void subtrair() {
        System.out.println(15 - 10);
    }

    public void multiplica(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    public void somaarrays(int[] nums) {
        int soma = 0;
        for (int num : nums) {
            soma = soma + num;
        }
        System.out.println("SOMA : "+soma);
    }
    public void SomaVarargs(int... nums) {
        int soma = 0;
        for (int num : nums) {
            soma = soma + num;
        }
        System.out.println("SOMA : "+soma);
    }
    public void alterar(int numero1, int numero2) {
        numero1 = 20;
        numero2 = 12;
        System.out.println("Dentro do metedo");
        System.out.println("NUM1 " + numero1);
        System.out.println("NUM2 " + numero2);

    }

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;

        } else {
            return 0;
        }
    }

    public void Divide2(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("invalido");
            return;
        }
        System.out.println(num1 / num2);
    }

}

