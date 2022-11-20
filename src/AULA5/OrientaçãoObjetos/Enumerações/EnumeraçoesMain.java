package AULA5.OrientaçãoObjetos.Enumerações;

import AULA5.OrientaçãoObjetos.Enumerações.EnumeraçãoDados.Cliente;
import AULA5.OrientaçãoObjetos.Enumerações.EnumeraçãoDados.TipoCliente;
import AULA5.OrientaçãoObjetos.Enumerações.EnumeraçãoDados.TipodePagamento;

public class EnumeraçoesMain {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Roberta", TipoCliente.PESSOA_FISICA, TipodePagamento.CREDITO);
        Cliente cliente2 = new Cliente("Maria", TipoCliente.PESSOA_JURIDICA, TipodePagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipodePagamento.CREDITO.calcular(100));
        System.out.println(TipodePagamento.DEBITO.calcular(100));
        TipoCliente tipoCliente2 = TipoCliente.Nomerelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }
}
