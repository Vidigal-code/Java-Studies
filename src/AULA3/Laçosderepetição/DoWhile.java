package AULA3.Laçosderepetição;

public class DoWhile {
    public static void main(String[] args) {
      //do-while executa apenas uma vez
        int count = 0;
        do {
            System.out.println("Contagem: "+ ++count);
        } while (count < 10);
    }
}
