package Abstrata.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class Banda {
    List<Musico> musicos;

    public Banda(){
        this.musicos = new ArrayList<>();
    }
    public void adicionarMusico(Musico musico){
        this.musicos.add(musico);
    }
    public void realizarSom(){
        for(Musico musico : this.musicos){
            musico.tocar();
        }
    }
}
