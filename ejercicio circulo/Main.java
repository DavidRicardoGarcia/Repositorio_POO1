public class Main {
    public static void main(String[] args) {
        Circulo circulo=new Circulo(10);
        Punto puntoNuevo= new Punto(5, 7);
        circulo.setPunto(puntoNuevo);
        circulo.imprimir();
        System.out.println(puntoNuevo.toString());
    }
}
