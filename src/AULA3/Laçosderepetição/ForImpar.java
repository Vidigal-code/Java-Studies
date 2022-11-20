package AULA3.Laçosderepetição;

public class ForImpar {
    public static void main(String[] args) {
        //imprima numeros par até 100000
        for (int count = 1; count <= 40; count++) {
            if (count % 2 != 0) {
                System.out.println("For2: " + count);
            }
        }
    }
}
