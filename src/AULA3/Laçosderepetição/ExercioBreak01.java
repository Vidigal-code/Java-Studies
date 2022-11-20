package AULA3.Laçosderepetição;

public class ExercioBreak01 {
    public static void main(String[] args) {
        //Dado o valor de um carro descubra quanta vezes pode ser parcelado
        // Condição da parcela >= 1000;

        double valortotal = 30000;
        for (int parcela = 1; parcela < valortotal; parcela++) {
            double valorparcela = valortotal / parcela;
            if(valorparcela < 1000){
               break;
            }
            System.out.println("Parcela "+ parcela + " R$ "+valorparcela);

        }
    }
}