package formas;

import java.awt.*;

public class Retangulo {
    private Ponto ponto;
    private int largura;
    private int altura;
    public static int qtdRetangulos = 0;


    public Retangulo(Ponto ponto, int largura, int altura) {
        this.ponto = ponto;
        this.largura = largura;
        this.altura = altura;
        qtdRetangulos ++;
    }

    public Retangulo(int x, int y, int largura, int altura) {
        this.ponto = new Ponto(x, y);
        this.largura = largura;
        this.altura = altura;
        qtdRetangulos ++;
    }

    public Retangulo(Ponto ponto, int lado) {
        this.ponto = ponto;
        this.largura = lado;
        this.altura = lado;
    }

    public void mover(int new_x, int new_y){
        this.ponto.mover(new_x, new_y);
    }

    public void desenhar() {
        System.out.printf("Retangulo(%d, %d, %d, %d)\n",
                this.ponto,  largura, altura);
    }

    public void redimensionar(float sx, float sy) {
        if (sx > 0 && sy > 0) {
            largura = (int) (sx / 100 * largura);
            altura = (int) (sy / 100 * altura);
        }
    }

    public void dividir(float sx, float sy) {
        if (sx > 0 && sy > 0) {
            largura = (int) (largura / sx );
            altura = (int) (altura / sy );
        }
    }

    public int area(){
        return altura*largura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public void setLargura(int largura){
        this.largura = largura;
    }

    public int getAltura(){
        return altura;
    }

    public int getLargura() {
        return largura;
    }
}
