package AULA5.OrientaçãoObjetos.ModificadorStaticFinal.DadosModificadorFinal;

public class Comprador {
    private String nome;



    @Override
    public String toString() {
        return "ModificadorFinalDadosComprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
