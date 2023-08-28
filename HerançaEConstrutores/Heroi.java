package HerançaEConstrutores;

import HerançaEConstrutores.Arma;

public class Heroi extends Personagem {

    private Arma arma;

//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("heroi: {\n")
 //               .append("\tid: ")
//                .append(this.id)
//                .append("\n")
//                .append("\tnome: ")
//                .append(this.nome)
//                .append("\n}");
//        return stringBuilder.toString();
//
//    }
    public Heroi(int id, String nome, Arma arma){
        super(id, nome);
        this.arma = arma;
    }


    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
