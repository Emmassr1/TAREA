import java.util.Scanner;

public class MayorNumero {

 
    public static double obtenerNumero() {
        Scanner scanner = new Scanner(System.in);
        double numero = 0;
        boolean valido = false;


        while (!valido) {
            System.out.print("Introduce un número: ");
            if (scanner.hasNextDouble()) {
                numero = scanner.nextDouble();
                valido = true;
            } else {
                System.out.println("¡Eso no es un número válido! Inténtalo de nuevo.");
                scanner.next(); 
            }
        }
        return numero;
    }


    public static double encontrarMayor(double num1, double num2, double num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Por favor ingresa tres números.");

        double numero1 = obtenerNumero();
        double numero2 = obtenerNumero();
        double numero3 = obtenerNumero();

     
        double mayor = encontrarMayor(numero1, numero2, numero3);

      
        System.out.println("El número mayor es: " + mayor);
    }
}
