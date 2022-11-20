package AULA5.OrientaçãoObjetos.ClassesAbstratas;

import AULA5.OrientaçãoObjetos.ClassesAbstratas.AbstratasDados.Dev;
import AULA5.OrientaçãoObjetos.ClassesAbstratas.AbstratasDados.Gerente;

public class AbstratasMain {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Zoro", 5000);
        Dev dev = new Dev("Zora", 12000);
        dev.imprime();
        gerente.imprime();

    }
}
