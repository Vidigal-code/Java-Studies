package AULA5.OrientaçãoObjetos.Interface.DadosInterface;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void laod() {
        System.out.println("loading...");
    }

    @Override
    public void remove() {
        System.out.println("REMOVENDO...");

    }
}
