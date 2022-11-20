package AULA5.OrientaçãoObjetos.LeituraTeclado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TecladoTESTA {

    public static <comandos> void main(String[] args) {

        System.out.println("Qual é sua pergunta");
        Scanner input = new Scanner(System.in);
        String pergunta = input.nextLine();
        final String str = pergunta;
        final String[] finalText = str.split ( ":" );
        final String s = finalText[0];
        switch(s.toLowerCase()){
            case "comando": {
              System.out.println("HELLO"+ " " + finalText[1]);
                break;
            }
            default:
                return;
        }

    }
}
