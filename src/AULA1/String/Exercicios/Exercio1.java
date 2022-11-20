package AULA1.String.Exercicios;

/*Criar variavéis para descrever campos a seguir
Meu <nome> é moro no <endereço>, confirmo que recebi meu <salario> na <data>
 */

public class Exercio1 {
    public static void main(String[] args) {
        String Nome = "Marcos Oliveira";
        String Endereço = "Rua vale velha";
        double Salario = 5412.12;
        String Data = "26/08/2023";
        String Relatorio = "Eu " + Nome + " moro na " + Endereço + " confirmo que recibi meu salario de " + Salario + " Na data " + Data;
        System.out.println(Relatorio);

    }
}
