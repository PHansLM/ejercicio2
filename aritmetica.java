public class aritmetica {
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    // Método principal para probar funciones
    public static void main(String[] args) {
        int resultado = suma(5, 3);
        System.out.println("La suma de 5 y 3 es: " + resultado);
        int producto = multiplicacion(5,8);
        System.out.println("El producto de la multiplicacion es: " + producto);
    }

    
}