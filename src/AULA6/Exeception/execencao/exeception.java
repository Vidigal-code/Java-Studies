package AULA6.Exeception.execencao;

public class exeception {
    public static void main(String[] args) {
        abrearquivo();
    }

    public static String abrearquivo() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            System.out.println("Fechando dados no arquivo");
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            System.out.println("Rercurso liberado");
        }
        return null;
    }

}
