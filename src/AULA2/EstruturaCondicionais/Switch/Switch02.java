package AULA2.EstruturaCondicionais.Switch;

public class Switch02 {
    public static void main(String[] args) {
        //imprima dia da semana, considerado 1 como domingo
        char sexo = 'M';
        // valores que pode colocar, char, int, byte, short, enum, String

        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("INVALIDO");
        }
    }
}
