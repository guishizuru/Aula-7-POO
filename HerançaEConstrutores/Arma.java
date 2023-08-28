package HerançaEConstrutores;

public class Arma {
    private String nome;
    private int pontosDeAtaque;

    private Arma arma;
    public Arma(String nome,int pontosDeAtaque){
        this.nome = nome;
        this.pontosDeAtaque = pontosDeAtaque;
        this.arma = arma;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontosDeAtaque() {
        return pontosDeAtaque;
    }

    public void setPontosDeAtaque(int pontosDeAtaque) {
        this.pontosDeAtaque = pontosDeAtaque;
    }
}
