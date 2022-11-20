package AULA2.EstruturaCondicionais.IF;

public class CondiçãoIFelseIf3 {
    public static void main(String[] args) {
        double SAnual = 70000;
        double S1faixa = 9.70 / 100;
        double S2faixa = 37.35 / 100;
        double S3faixa = 49.50 / 100;
        double SImposto;
        if(SAnual <= 34712){
            SImposto = SAnual * S1faixa;
        } else if(SAnual >= 34713 &&  SAnual <= 68507){
            SImposto = SAnual * S2faixa;
        } else {
            SImposto = SAnual * S3faixa;
        }
        System.out.println("Imposto é: "+ SImposto);
    }
}
