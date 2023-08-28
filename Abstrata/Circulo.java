package Abstrata;

public class Circulo implements FormaGeometrica {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
     @Override
    public double calcularArea(){
         return 2 * Math.PI * this.raio;
     }
     @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * this.raio;
     }

}
