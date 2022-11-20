package AULA5.OrientaçãoObjetos.Enumerações.EnumeraçãoDados;

public enum TipodePagamento {
    DEBITO{
        @Override
        public double calcular(double valor) {
            return valor * 0.1;
        }
    }, CREDITO{
        @Override
        public double calcular(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcular(double valor);
}
