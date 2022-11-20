package AULA2.EstruturaCondicionais.Switch;

public class Switch01 {
    public static void main(String[] args) {
        //imprima dia da semana, considerado 1 como domingo
        byte dia = 0;
        // valores que pode colocar, char, int, byte, short, enum, String

        switch (dia) {
            case 1:
                System.out.println("DOM");
                break;
            case 2:
                System.out.println("SEG");
                break;
            case 3:
                System.out.println("TER");
                break;
            case 4:
                System.out.println("QUA");
                break;
            case 5:
                System.out.println("QUI");
                break;
            case 6:
                System.out.println("SEX");
                break;
            case 7:
                System.out.println("SAB");
                break;
            default:
                System.out.println("1 a 7");
        }
    }
}
