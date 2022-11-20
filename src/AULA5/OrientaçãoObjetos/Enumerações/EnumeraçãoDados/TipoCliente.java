package AULA5.OrientaçãoObjetos.Enumerações.EnumeraçãoDados;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int valor;
    private String nomerelatorio;

    TipoCliente(int valor, String nomerelatorio) {
        this.valor = valor;
        this.nomerelatorio = nomerelatorio;
    }

    public String getNomerelatorio() {

        return nomerelatorio;
    }

    public static TipoCliente Nomerelatorio(String nomerelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomerelatorio().equals(nomerelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

}
