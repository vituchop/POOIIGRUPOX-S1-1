/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Punto {
    private int coordenadaX;
    private int coordenadaY;

    public Punto() {
        this.coordenadaX = 0;
        this.coordenadaY = 0;
    }

    public Punto(int x, int y) {
        this.coordenadaX = x;
        this.coordenadaY = y;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaX(int x) {
        this.coordenadaX = x;
    }

    public void setCoordenadaY(int y) {
        this.coordenadaY = y;
    }

    @Override
    public String toString() {
        return "El punto tiene las siguientes coordenadas: " + coordenadaX + ", " + coordenadaY;
    }

    public double getDistancia(Punto otroPunto) {
        int dx = this.coordenadaX - otroPunto.getCoordenadaX();
        int dy = this.coordenadaY - otroPunto.getCoordenadaY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getDistancia() {
        return getDistancia(new Punto(0, 0));
    }
}
