package AULA2.EstruturaCondicionais.IF;

public class CondiçãoIFelse {
    public static void main(String[] args) {
        int idade = 15;
        boolean autorizar = idade >= 18;
        if (autorizar) {
            System.out.println("Autorizado a Comprar Bebida");

        }
        else {
            System.out.println("Não Autorizado");
        }
    }
}
