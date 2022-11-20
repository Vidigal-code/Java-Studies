package AULA5.OrientaçãoObjetos.BlocosDeInicialização.BlocoDados;

public class DadosBloco {
    private String nome;
    private static int[] episidios;

   static  {
        System.out.println("test");
        episidios = new int[100];

        for (int i = 0; i < episidios.length; i++) {
            episidios[i] = i + 1;

        }

        for (int Episidio : episidios) {
            System.out.println("Episidios :" + Episidio);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisidios() {
        return episidios;
    }



    public DadosBloco(String nome) {
        this.nome = nome;
    }

    public DadosBloco() {

        }

    }

