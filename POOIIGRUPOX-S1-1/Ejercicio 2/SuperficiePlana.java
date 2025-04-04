import java.util.List;
import java.util.ArrayList;

class SuperficiePlana {
    private List<FiguraGeometrica> figurasGeometricas;

    public SuperficiePlana() {
        this.figurasGeometricas = new ArrayList<>();
    }

    public void agregarFigura(FiguraGeometrica figura) {
        figurasGeometricas.add(figura);
    }

    public void mostrarAreas() {
        for (FiguraGeometrica figura : figurasGeometricas) {
            System.out.println("Área de " + figura.getNombre() + ": " + figura.calcularArea());
        }
    }
}

