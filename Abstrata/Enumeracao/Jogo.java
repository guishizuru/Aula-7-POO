package Abstrata.Enumeracao;
public class Jogo{
    private String nome;
    private MesesDoAno mesDeLancamento;

    public Jogo(String nome, MesesDoAno mesDeLancamento){
        this.nome = nome;
        this.mesDeLancamento = mesDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public MesesDoAno getMesDeLancamento() {
        return mesDeLancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMesDeLancamento(MesesDoAno mesDeLancamento) {
        this.mesDeLancamento = mesDeLancamento;
    }
}
