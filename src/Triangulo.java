import java.util.Scanner;

public class Triangulo extends  Figura{
    Scanner teclado = new Scanner(System.in);
    private double base ;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;


    @Override
    public void calcularArea() {
        System.out.println("Ingrese la base de su triangulo");
        setBase(teclado.nextDouble());
        System.out.println("Ingrese la altua de su triangulo");
        setAltura(teclado.nextDouble());
        System.out.println("La base del triangulo es: "+((base*altura))/2);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Ingrese la medida de los lados del triangulo");
        System.out.println("Lado 1");
        setLado1(teclado.nextDouble());
        System.out.println("Lado 2");
        setLado2(teclado.nextInt());
        System.out.println("Lado 3");
        setLado3(teclado.nextInt());
        System.out.println("El perimetro del triangulo es: "+ (lado1+lado2+lado3));
    }

    public Triangulo() {

    }

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
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

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
}
