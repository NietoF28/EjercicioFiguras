import java.util.ArrayList;
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

    ArrayList<Rectangulo> lstrectangulos = new ArrayList<>();
    ArrayList<Triangulo> lsttriangulos = new ArrayList<>();
    ArrayList<Circulo> lstcirculos = new ArrayList<>();




    while (continuar) {
      System.out.println(" //FIGURAS\\ ");
      System.out.println("1) Rectangulo");
      System.out.println("2) Triangulo");
      System.out.println("3) Circulo");
      System.out.println("4) Mostrar Rectangulos");
      System.out.println("5) Salir");

      opc = scanner.nextInt();

      switch (opc){

        case 1:
          System.out.println("__");
          System.out.println("1) Rectangulo 1");
          System.out.println("2) Rectangulo 2");
          System.out.println("3) Rectangulo 3");
          opc = scanner.nextInt();
          switch (opc) {
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
                  rectangulo2.calcularArea();
                  break;
                case 2:
                  rectangulo2.calcularPerimetro();
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
                  rectangulo3.calcularArea();
                  break;
                case 2:
                  rectangulo3.calcularPerimetro();
                  break;

              }
                break;

          }

          break;

        case 2:
          System.out.println("_TRIANGULO_");
          System.out.println("1) Triangulo 1");
          System.out.println("2) Triangulo 2");
          System.out.println("3) Triangulo 3");
          opc = scanner.nextInt();
          switch (opc) {

              case 1:
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

                case 2:
              System.out.println("_OPERACIONES_");
              System.out.println("1) Area");
              System.out.println("2) Perimetro");
              opc = scanner.nextInt();

              switch (opc) {
                case 1:
                  triangulo2.calcularArea();
                  break;
                case 2:
                  triangulo2.calcularPerimetro();
                  break;
                         }
                   break;
            case  3:
              System.out.println("_OPERACIONES_");
              System.out.println("1) Area");
              System.out.println("2) Perimetro");
              opc = scanner.nextInt();

              switch (opc) {
                case 1:
                  triangulo3.calcularArea();
                  break;
                case 2:
                  triangulo3.calcularPerimetro();
                  break;
              }
              break;

          }

          break;

        case 3:
          System.out.println("__");
          System.out.println("1) Circulo 1");
          System.out.println("2) Circulo 2");
          System.out.println("3) Circulo 3");
          opc = scanner.nextInt();
          switch (opc) {
            case 1:
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

            case 2:
              System.out.println("_OPERACIONES_");
              System.out.println("1) Area");
              System.out.println("2) Perimetro");
              opc = scanner.nextInt();

              switch (opc) {
                case 1:
                  circulo2.calcularArea();
                  break;
                case 2:
                  circulo2.calcularPerimetro();
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
                  circulo3.calcularArea();
                  break;
                case 2:
                  circulo3.calcularPerimetro();
                  break;
              }
              break;
          }
          break;
        case 4:
          lstrectangulos.add(rectangulo1);
          lstrectangulos.add(rectangulo2);
          lstrectangulos.add(rectangulo3);

          for (Rectangulo es : lstrectangulos) {
            System.out.println(es);
          }

          break;

        case 5:
          continuar = false;
          System.out.println("Gracias por usar el sistema.");
          break;

        default:
          System.out.println("Opción no válida. Intente nuevamente.");
      }


    }

  }
}