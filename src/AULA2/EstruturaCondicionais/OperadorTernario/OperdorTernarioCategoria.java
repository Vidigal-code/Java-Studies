package AULA2.EstruturaCondicionais.OperadorTernario;

public class OperdorTernarioCategoria {
    public static void main(String[] args) {
        //idade < 15 categoria infatil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >= 18 categoria adulto


        int idade = 16;
        System.out.println(idade < 15 ? "Categoria Infatil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto");
    }
}

