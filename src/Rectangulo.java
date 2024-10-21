import java.util.Scanner;

public class Rectangulo extends Figura{
    Scanner teclado = new Scanner(System.in);
    private double base ;
    private double altura;


    @Override
    public void calcularArea() {
        System.out.println("Ingrese la base de su rectangulo");
        setBase(teclado.nextDouble());
        System.out.println("Ingrese la altura de su rectangulo");
        setAltura(teclado.nextDouble());
        System.out.println("EL area de su rectangulo es: "+base*altura);

    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Ingrese la base de su rectangulo");
        setBase(teclado.nextDouble());
        System.out.println("Ingrese la altura de su rectangulo");
        setAltura(teclado.nextDouble());
        System.out.println("El perimetro de su rectangulo es: "+ (2*(base+altura)));
    }

    public Rectangulo() {

    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
