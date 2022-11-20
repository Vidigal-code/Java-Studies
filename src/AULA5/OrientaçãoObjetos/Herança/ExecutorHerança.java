package AULA5.OrientaçãoObjetos.Herança;

import AULA5.OrientaçãoObjetos.Herança.DadosPessoa.Endereco;
import AULA5.OrientaçãoObjetos.Herança.DadosPessoa.Funcionario;
import AULA5.OrientaçãoObjetos.Herança.DadosPessoa.Pessoa;

public class ExecutorHerança {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Asas Brancas");
        endereco.setCep("1774-000");
        Pessoa pessoa = new Pessoa("Kyan");
        pessoa.setCpf("11.22");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Kyo");
        funcionario.setCpf("011.77");
        funcionario.setSalario(2000);
        funcionario.setEndereco(endereco);
        funcionario.imprime();
    }
}
