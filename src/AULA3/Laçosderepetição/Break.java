package AULA3.Laçosderepetição;

public class Break {
    public static void main(String[] args) {
        int valormax = 50;
        for (int i = 0; i <= valormax; i++) {
            if (i > 25) {break;}
            System.out.println("i = "+i);
        }
    }
}