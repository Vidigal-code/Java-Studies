package AULA5.OrientaçãoObjetos.Interface.DadosInterface;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void laod() {
        System.out.println("AAA");
    }

    @Override
    public void remove() {
        System.out.println("NBB");
    }
}
