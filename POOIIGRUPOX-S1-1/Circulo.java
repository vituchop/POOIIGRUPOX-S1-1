/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Circulo {
    private double radio;
    private String color;

    private static final double RADIO_POR_DEFECTO = 12.5;
    private static final String COLOR_POR_DEFECTO = "azul";

    public Circulo() {
        this.radio = RADIO_POR_DEFECTO;
        this.color = COLOR_POR_DEFECTO;
    }

    public Circulo(double radio) {
        this.radio = radio;
        this.color = COLOR_POR_DEFECTO;
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radio * radio * Math.PI;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + ", color=" + color + ", area=" + getArea() + "]";
    }
}

