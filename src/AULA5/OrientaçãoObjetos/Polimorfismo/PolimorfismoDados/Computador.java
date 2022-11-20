package AULA5.OrientaçãoObjetos.Polimorfismo.PolimorfismoDados;

public class Computador  extends  Produto {
   public static final double IMPOSTO_POR_CENTO = 21;

    @Override
    public double calcularimposto() {
        System.out.println("Calculado Imposto do Computador");
        return  this.valor * IMPOSTO_POR_CENTO;
    }

    public Computador(String nome, double valor) {
        super(nome, valor);

    }

}
