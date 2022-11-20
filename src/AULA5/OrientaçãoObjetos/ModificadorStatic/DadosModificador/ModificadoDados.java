package AULA5.OrientaçãoObjetos.ModificadorStatic.DadosModificador;

public class ModificadoDados {
    private String Nome;
    private static double VelocidadeLimite = 250;
    private double VelocidadeMaxima;

    public ModificadoDados(String nome, double velocidadeMaxima) {
        Nome = nome;
        VelocidadeMaxima = velocidadeMaxima;
    }

    public void Imprime(){
        System.out.println("--------------");
        System.out.println("Modelo :"+this.Nome);
        System.out.println("VelocidadeLimite :"+ModificadoDados.VelocidadeLimite);
        System.out.println("VelocidadeMaxima :"+this.VelocidadeMaxima);
    }

    public static void setVelocidadeLimite(double VelocidadeLimite){
        ModificadoDados.VelocidadeLimite = VelocidadeLimite;

    }

    public static double getVelocidadeLimite(){
     return ModificadoDados.VelocidadeLimite;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }


    public double getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        VelocidadeMaxima = velocidadeMaxima;
    }
}
