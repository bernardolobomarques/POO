package formas;

public class Ponto {
    private int x;
    private int y;

    Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void mover(int new_x, int new_y){
        this.x = new_x;
        this.y = new_y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
