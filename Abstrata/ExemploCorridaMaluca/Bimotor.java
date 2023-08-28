package Abstrata.ExemploCorridaMaluca;

public class Bimotor implements Veiculo {
    @Override
    public void acelerar(){
        System.out.println("Bi motor está acelerando");

    }
    @Override
    public void frear(){
        System.out.println("Bi motor está freando");
    }

    @Override
    public void virarEsquerda() {
        System.out.println("Bi motor está virando a esquerda");
    }
    @Override
    public  void virarDireita(){
        System.out.println("Bi motor está virando a direita");
    }
}
