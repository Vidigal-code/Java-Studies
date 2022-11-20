package AULA5.OrientaçãoObjetos.Interface;

import AULA5.OrientaçãoObjetos.Interface.DadosInterface.DataBaseLoader;
import AULA5.OrientaçãoObjetos.Interface.DadosInterface.DataRemover;
import AULA5.OrientaçãoObjetos.Interface.DadosInterface.FileLoader;

public class InterfaceMain {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        DataBaseLoader dataRemover = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataRemover.remove();
        dataBaseLoader.laod();
        fileLoader.laod();
        fileLoader.remove();

    }
}