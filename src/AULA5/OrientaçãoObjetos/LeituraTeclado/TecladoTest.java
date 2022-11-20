package AULA5.OrientaçãoObjetos.LeituraTeclado;

import java.util.Scanner;

public class TecladoTest {
    public static void main(String[] args) {
        System.out.println("Qual é sua pergunta");
        Scanner input = new Scanner(System.in);
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("Sim");

        } else {
            System.out.println("Não");
        }

    }
}
