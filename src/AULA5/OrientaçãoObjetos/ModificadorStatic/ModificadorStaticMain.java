package AULA5.OrientaçãoObjetos.ModificadorStatic;

import AULA5.OrientaçãoObjetos.ModificadorStatic.DadosModificador.ModificadoDados;

public class ModificadorStaticMain {
    public static void main(String[] args) {
        ModificadoDados c1 = new ModificadoDados("BMW", 300);
        ModificadoDados c2 = new ModificadoDados("V8", 300);
        ModificadoDados c3 = new ModificadoDados("Ferrari", 300);
        ModificadoDados.setVelocidadeLimite(200);
        c1.Imprime();
        c2.Imprime();
        c3.Imprime();
    }
}
