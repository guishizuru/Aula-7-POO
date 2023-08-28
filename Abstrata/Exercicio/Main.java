package Abstrata.Exercicio;

public class Main {
    public static void main(String[] args) {
        Banda banda = new Banda();
        banda.adicionarMusico(new Baterista());
        banda.adicionarMusico(new Guitarrista());
        banda.adicionarMusico(new Tecladista());

        banda.realizarSom();
    }

}
