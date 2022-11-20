package AULA2.EstruturaCondicionais.IF;

public class CondiçãoIFelseIf2 {
    public static void main(String[] args) {
        //idade < 15 categoria infatil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >= 18 categoria adulto
        int idade = 12;
        String Categoria = "Categoria Adulto";;
        if (idade < 15) {
            Categoria = "Categoria Infatil";
        } else if (idade >= 15 && idade < 18) {
            Categoria = "Categoria Juvenil";

        }
        System.out.println(Categoria);
    }
}

