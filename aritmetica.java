public class aritmetica {
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b){
        double res = 0.0;
        if(b == 0){
            System.out.println("No existe la division por cero");
            res = Double.NaN; 
        }else{
            res = (double) a / b;
        }
        return res;
        }

    // Método principal para probar funciones
    public static void main(String[] args) {
        int resultado = suma(5, 3);
        System.out.println("La suma de 5 y 3 es: " + resultado);
        int producto = multiplicacion(5,8);
        System.out.println("El producto de la multiplicacion es: " + producto);

        double res = division(8,4);
        System.out.println("el resultado de la division es: " + res);
    }

    
}