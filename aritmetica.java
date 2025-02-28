import java.util.Scanner;

public class aritmetica {
    //Pablo Limachi
    public static int suma(int a, int b) {
        return a + b;
    }
    //Jhunior Garcia
    public static int resta(int a, int b) {
        return a - b;
    }
    //Nilson Huanca
    public static int multiplicacion(int a, int b) {
        return a * b;
    }
    //Fernanda Larrea
    public static double division(int a, int b) {
        double res = 0.0;
        if (b == 0) {
            System.out.println("No existe la division por cero");
            res = Double.NaN;
        } else {
            res = (double) a / b;
        }
        return res;
    }
    //Diego Grajeda
    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }
    //Eleonor Anturiano
    public static double Raiz(double numero, int raiz) {
        if (raiz == 2) {
            return Math.sqrt(numero);
        } else {
            return Math.pow(numero, 1.0 / raiz);
        }
    }
    //Luis Velarde
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    //Jhoel Camacho
    public static int Residuo(int a, int b) {
        return a % b;
    }
    //Nestor Bruno Meneses
    public static int Factorial(int num) {
        int a = 1;
        for (int i = 1; num >= i; i++) {
            a = i * a;
        }
        return a;
    }

    // Método principal para probar funciones
    public static void main(String[] args) {
        int resultado = suma(5, 3);
        System.out.println("La suma de 5 y 3 es: " + resultado);
        int resResta = resta(10, 6);
        System.out.println("La resta de 10 y 6 es: " + resResta);
        int producto = multiplicacion(5, 8);
        System.out.println("El producto de la multiplicacion es: " + producto);
        double res = division(8, 4);
        System.out.println("el resultado de la division es: " + res);
        double resPotencia = potencia(5, 3);
        System.out.println("el resultado de la potencia es: " + resPotencia);
        double resRaiz = Raiz(27, 3);
        //Eleonor Camile Anturiano Eulate
        System.out.println("el resultado de la raiz es: " + resRaiz);
        int resResiduo = Residuo(20, 3);
        System.out.println("El residuo es:" + resResiduo);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número para verificar si es par: ");
        int numero = scanner.nextInt();

        if (esPar(numero)) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        scanner.close();
        int Facto = Factorial(5);
        System.out.println("el resultado de el factorial de 5 es: " + Facto);
    }
}
