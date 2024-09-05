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
    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }
    public static double Raiz(double numero, int raiz) {
        if (raiz == 2) {
            return Math.sqrt(numero);
        } else {
            return Math.pow(numero, 1.0 / raiz);
        }
    }

    public static int Residuo(int a, int b){
        res = a % b;
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
        double resPotencia = potencia(5,3);
        System.out.println("el resultado de la potencia es: " + resPotencia);
        double resRaiz = Raiz(27,3);
        System.out.println("el resultado de la raiz es: " + resRaiz);
        int resResiduo = Residuo(20,3);
        System.out.println("El residuo es:" + resResiduo);
    }

    
}