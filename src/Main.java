import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      boolean continuar = true;
      int opc;

      Triangulo triangulo1 = new Triangulo();
      Triangulo triangulo2 = new Triangulo();
      Triangulo triangulo3 = new Triangulo();
      Rectangulo rectangulo1 = new Rectangulo();
      Rectangulo rectangulo2 = new Rectangulo();
      Rectangulo rectangulo3 = new Rectangulo();
      Circulo circulo1 = new Circulo();
      Circulo circulo2 = new Circulo();
      Circulo circulo3 = new Circulo();


          while (continuar) {

            System.out.println("1) Rectangulo");
            System.out.println("2) Triangulo");
            System.out.println("3) Circulo");
            System.out.println("4) Salir");
            opc = scanner.nextInt();

             switch (opc){

              case 1:
                System.out.println("_OPERACIONES_");
                System.out.println("1) Area");
                System.out.println("2) Perimetro");
                opc = scanner.nextInt();
                   switch (opc) {
                    case 1:
                  rectangulo1.calcularArea();
                    break;

                    case 2:
                  rectangulo1.calcularPerimetro();
                    break;
                }

                break;

              case 2:
                System.out.println("_OPERACIONES_");
                System.out.println("1) Area");
                System.out.println("2) Perimetro");
                opc = scanner.nextInt();
                switch (opc) {
                  case 1:
                    triangulo1.calcularArea();
                    break;

                  case 2:
                    triangulo1.calcularPerimetro();
                    break;
                }

                break;

              case 3:
                System.out.println("_OPERACIONES_");
                System.out.println("1) Area");
                System.out.println("2) Perimetro");
                opc = scanner.nextInt();
                switch (opc) {
                  case 1:
                    circulo1.calcularArea();
                    break;

                  case 2:
                    circulo1.calcularPerimetro();
                    break;
                }
                break;

               case 4:
                 continuar = false;
                 System.out.println("Gracias por usar el sistema.");
                 break;

               default:
                 System.out.println("Opción no válida. Intente nuevamente.");
             }


          }

      }
    }