package AULA5.OrientaçãoObjetos.LeituraTeclado;

import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite, Seu Nome");
        String nome = entrada.nextLine();
        System.out.println("Digite, sua Idade");
        int idade = entrada.nextInt();
        System.out.println("Digite se vc é, M ou F");
        char sexo = entrada.next().charAt(0);
        System.out.println("Nome "+nome);
        System.out.println("Idade "+idade);
        System.out.println("Sexo "+ sexo);


    }

}
