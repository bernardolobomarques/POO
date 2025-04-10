package formas;

import javax.swing.text.Segment;

public class SegmentoReta {
    Ponto p1;
    Ponto p2;

    SegmentoReta(int x_p1, int y_p1, int x_p2, int y_p2){
        this.p1 = new Ponto(x_p1,y_p1);
        this.p2 = new Ponto(x_p2,y_p2);
    }

    SegmentoReta(Ponto p1, Ponto p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public double tamanho(){
        float difX = p1.getX() - p2.getX();
        float difY = p1.getY() - p2.getY();
        
        return Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2));
    }
}
