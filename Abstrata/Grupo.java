package Abstrata;

import java.util.ArrayList;

public class Grupo {
    ArrayList<Heroi> herois;
     public Grupo(){
         this.herois = new ArrayList<>();
     }

    public ArrayList<Heroi> getHerois() {
        return herois;
    }

    public void adicionarHeroi(Heroi heroi){
         this.herois.add(heroi);
    }
}
