public class Circulo{
    private Punto punto;
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
        punto=new Punto(0,0);
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto nuevoPunto) {
        this.punto = nuevoPunto;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void imprimir(){
        System.out.println(
        String.format("El centro del círculo es la coordenada (%s, %s), y tiene un radio de %s",
        punto.getX(),punto.getY(),radio));
    }
    
}