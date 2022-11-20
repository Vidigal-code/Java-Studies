package AULA2.EstruturaCondicionais.Switch;

public class Switch03 {
    public static void main(String[] args) {
        byte dia = 4;
        // valores que pode colocar, char, int, byte, short, enum, String
        switch (dia) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("DIA UTIL");
                break;
            default:
                System.out.println("INVALIDO");
        }
    }
}
