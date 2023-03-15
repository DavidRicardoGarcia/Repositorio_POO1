public class Punto {
    private double x;
    private double y;
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public void setX(double nuevoX) {
        this.x = nuevoX;
    }
    public double getY() {
        return y;
    }

    public void setY(double nuevoY) {
        this.y = nuevoY;
    }

    public String toString(){
        return String.format("las coordenadas son (%s, %s)", x,y);
    }
}
