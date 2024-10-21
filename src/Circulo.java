import java.util.Scanner;

public class Circulo extends Figura{
    Scanner teclado = new Scanner(System.in);
    private double radio;
    private double pi=3.141592 ;

    @Override
    public void calcularArea() {
        System.out.println("Ingrese el radio del circulo");
        setRadio(teclado.nextDouble());
        System.out.println("El area del circulo es:"+ (pi*(radio*radio)) );
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Ingrese el radio del circulo");
        setRadio(teclado.nextDouble());
        System.out.println("El perimetro del circulo es: "+ (2*pi*radio));

    }

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
