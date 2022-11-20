package AULA5.OrientaçãoObjetos.Enumerações.EnumeraçãoDados;

public class Cliente {
    private String nome;
    private  TipoCliente tipoCliente;
    private TipodePagamento tipodePagamento;
    public static final String PESSOA_FISICA = "PESSOA_FISICA";
    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoCliente=" + tipoCliente.getNomerelatorio() +
                ", tipodePagamento=" + tipodePagamento +
                '}';
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipodePagamento tipodePagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipodePagamento = tipodePagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
