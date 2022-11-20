package AULA3.Laçosderepetição;

public class ForPar2 {
    public static void main(String[] args) {
        //imprima numeros par até 100000
        int i = 0;

        for (i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("O numero " + i + " é par!");
            }
        }

        System.out.println("\n"+"-----------------while");

        i = 0;

        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println("O numero " + i + " é par!");
                i++;
            } else {
                i++;
            }
        }

        System.out.println("\n"+"-----------------do-while");

        i = 0;
        do {
            if (i % 2 == 0) {
                System.out.println("O numero " + i + " é par!");
                i++;
            } else {
                i++;
            }
        } while (i <= 100);
            }
        }

