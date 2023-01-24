import java.util.Scanner;

public class IncredibleCalculator {

    public static void main(String[] args) {

        System.out.println("Selecciona la operación que prefieras realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir (división entera)");
        System.out.println("5. Dividir (división con decimales)");

        int opcion = leerEnteroEntrada();


        switch (opcion) {
            case 1: //Sumar. Debes leer dos numeros enteros de entrada e imprimir su suma
                System.out.println("Indique el primer número a sumar");
                int n1 = leerEnteroEntrada();
                System.out.println("Indique el segundo número a sumar");
                int n2 = leerEnteroEntrada();
                System.out.println("La suma tiene como resultado " + suma(n1, n2));
                break;
            case 2: // Restar. Debes leer dos números enteros de entrada e imprimir su resta
                System.out.println("Indique el primer número a restar");
                n1 = leerEnteroEntrada();
                System.out.println("Indique el segundo número a restar");
                n2 = leerEnteroEntrada();
                System.out.println("La resta tiene como resultado " + resta(n1, n2));
                break;
            case 3: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su producto.
                System.out.println("Indique el primers número a multiplicar");
                n1 = leerEnteroEntrada();
                System.out.println("Indique el segundo número a multipllicar");
                n2 = leerEnteroEntrada();
                System.out.println("La resta tiene como resultado " + multiplicacion(n1, n2));
                    break;
            case 4: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su división entera.
                System.out.println("Indique el dividendo");
                n1 = leerEnteroEntrada();
                System.out.println("Indique el divisor");
                n2 = leerEnteroEntrada();
                System.out.printf("La división tiene como resultado %.2f", divisionEntera(n1, n2));
                    break;
            case 5: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su división con decimales.
                System.out.println("Indique el dividendo");
                n1 = leerEnteroEntrada();
                System.out.println("Indique el divisor");
                n2 = leerEnteroEntrada();
                System.out.printf("La división tiene como resultado %.2f", divisionConDecimales(n1, n2));
                    break;

        }

    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int divisionEntera(int a, int b) {
        return a / b;
    }

    public static double divisionConDecimales(int a, int b) {
        return a / (b * 1.0);
    }

    public static int leerEnteroEntrada() {
        try {
            Scanner sc = new Scanner(System.in);
            int result = Integer.parseInt(sc.next());
            sc.close();
            return result;
        } catch (NumberFormatException ex) {
            System.err.println("Lo que has introducido no es un número entero!");
            System.exit(1);
            return -1;
        }

    }

}