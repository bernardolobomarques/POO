package formas;

public class Circulo {
    private double raio;
    private Ponto ponto;

    public Circulo(double raio, Ponto ponto) {
        this.raio = raio;
        this.ponto = ponto;
    }

    public Circulo(Circulo outro){
        this.raio = outro.raio;
        this.ponto.mover(outro.ponto.getX(), outro.ponto.getY());
    }

    public double getRaio() {
        return raio;
    }

    public double getX() {
        return this.ponto.getX();
    }

    public double getY() {
        return this.ponto.getY();
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void moverCirculo(int x, int y){
        this.ponto.mover(x, y);
    }

    public double getArea(){
        return raio*raio*3.14;
    }

    public double getPerimetro(){
        return 2*raio*3.14;
    }
}
