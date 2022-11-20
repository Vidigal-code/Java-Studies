package AULA2.EstruturaCondicionais.IF;

public class CondiçãoIFelseIf {
    public static void main(String[] args) {
        //idade < 15 categoria infatil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >= 18 categoria adulto
        int idade = 12;
        String Categoria;
        if (idade < 15) {
            Categoria = "Categoria Infatil";
        } else if (idade >= 15 && idade < 18) {
            Categoria = "Categoria Juvenil";

        } else {
            Categoria =  "Categoria Adulto";
        }

        System.out.println(Categoria);
    }
}

