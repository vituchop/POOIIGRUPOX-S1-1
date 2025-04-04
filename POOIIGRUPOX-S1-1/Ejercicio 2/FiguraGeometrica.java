abstract class FiguraGeometrica {
    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreFigura) {
        this.nombre = nombreFigura;
    }

    public abstract double calcularArea();
    public abstract boolean esRegular();
}
