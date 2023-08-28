package Abstrata.Enumeracao;

public enum MesesDoAno {
    JANEIRO,
    FEVEIRO,
    MARCO,
    ABRIL,
    MAIO,
    JUNHO,
    AGOSTO,
    SETEMBRO,
    OUTUBRO,
    NOVEMBRO,
    DEZEMBRO;
    public String getMesFormatado(){
        String mesMinusculo = this.toString().toLowerCase();
        return mesMinusculo.substring(0,1).toUpperCase() + mesMinusculo.substring(1);
    }
}
