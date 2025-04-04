public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 0);
        Punto p3 = new Punto(0, 4);

        Triangulo t1 = new Triangulo("Triángulo 1", p1, p2, p3);
        System.out.println(t1);
        System.out.println("Área: " + t1.calcularArea());
        System.out.println("Es regular: " + t1.esRegular());

        SuperficiePlana superficie = new SuperficiePlana();
        superficie.agregarFigura(t1);
        superficie.mostrarAreas();
    }
}