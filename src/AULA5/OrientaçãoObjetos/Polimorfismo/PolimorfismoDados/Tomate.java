package AULA5.OrientaçãoObjetos.Polimorfismo.PolimorfismoDados;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String datadevalida;

    public String getDatadevalida() {
        return datadevalida;
    }

    public void setDatadevalida(String datadevalida) {
        this.datadevalida = datadevalida;
    }

    @Override
    public double calcularimposto() {
        System.out.println("Calculado Imposto do Tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }


    public Tomate(String nome, double valor) {
        super(nome, valor);
    }
}
