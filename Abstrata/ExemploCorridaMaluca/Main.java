package Abstrata.ExemploCorridaMaluca;

public class Main {
    public static void main(String[] args) {
        Corrida corrida = new Corrida();
        corrida.adicionarVeiculo(new Carro());
        corrida.adicionarVeiculo(new Moto());
        corrida.adicionarVeiculo(new Bimotor());

        corrida.iniciarCorrida();
    }
}
