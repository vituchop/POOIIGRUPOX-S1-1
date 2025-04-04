public class CirculoTest {
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo();
        System.out.println("Usando el constructor por defecto:");
        System.out.println("Radio: " + c1.getRadio());
        System.out.println("Área: " + c1.getArea());

        Circulo c2 = new Circulo(6.55);
        System.out.println("\nUsando el constructor con radio 6.55:");
        System.out.println("Radio: " + c2.getRadio());
        System.out.println("Área: " + c2.getArea());

        Circulo c3 = new Circulo();
        c3.setRadio(10.0);
        c3.setColor("rojo");
        System.out.println("\nObjeto modificado:");
        System.out.println(c3);


    }
}

