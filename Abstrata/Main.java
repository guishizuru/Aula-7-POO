package Abstrata;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Grupo grupo = new Grupo();
        grupo.adicionarHeroi(new Heroi("Lyn"));
        grupo.adicionarHeroi(new Heroi("Mylon"));

        ArrayList<Heroi> herois = new ArrayList<>();
        herois = grupo.getHerois();

    }
}
