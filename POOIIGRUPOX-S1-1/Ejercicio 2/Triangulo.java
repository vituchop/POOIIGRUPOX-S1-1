class Triangulo extends FiguraGeometrica {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo() {
        super("Triángulo"); 
        this.punto1 = new Punto(0, 0);
        this.punto2 = new Punto(1, 0);
        this.punto3 = new Punto(0, 1);
    }

    public Triangulo(String nombre, Punto p1, Punto p2, Punto p3) {
        super(nombre);
        this.punto1 = p1;
        this.punto2 = p2;
        this.punto3 = p3;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto1(Punto p1) {
        this.punto1 = p1;
    }

    public void setPunto2(Punto p2) {
        this.punto2 = p2;
    }

    public void setPunto3(Punto p3) {
        this.punto3 = p3;
    }

    @Override
    public String toString() {
        return "Triángulo: " + getNombre() + " tiene 3 Puntos: " +
                getPunto1().toString() + ", " +
                getPunto2().toString() + ", " +
                getPunto3().toString();
    }

    @Override
    public double calcularArea() {
        double a = punto1.getDistancia(punto2);
        double b = punto2.getDistancia(punto3);
        double c = punto3.getDistancia(punto1);
        double s = (a + b + c) / 2; 
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
    }
 
    @Override
    public boolean esRegular() {
        double lado1 = punto1.getDistancia(punto2);
        double lado2 = punto2.getDistancia(punto3);
        double lado3 = punto3.getDistancia(punto1);
        return (lado1 == lado2) && (lado2 == lado3);
    }
}


