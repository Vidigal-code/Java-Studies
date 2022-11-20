package AULA5.OrientaçãoObjetos.ModificadorStaticFinal.DadosModificadorFinal;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE;

    public final Comprador comprar = new Comprador();

    public final void imprime() {
        System.out.println("nome: "+this.nome);
    }

    static {
        VELOCIDADE_LIMITE = 250;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
