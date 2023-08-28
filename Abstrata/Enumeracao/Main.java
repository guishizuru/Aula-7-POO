package Abstrata.Enumeracao;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("FIFA", MesesDoAno.FEVEIRO);
        Jogo jogo2 = new Jogo("Pes",MesesDoAno.JUNHO);

        System.out.println(jogo.getMesDeLancamento().getMesFormatado());
    }
}
