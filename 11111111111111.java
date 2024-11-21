import java.util.Scanner;

public class JuegoPuntaje {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para las fichas
        int fichasRojas, fichasAzules, fichasAmarillas;

        // Solicitar entradas al usuario
        System.out.print("¿Cuántas veces llegaste en primer lugar? (Fichas rojas): ");
        fichasRojas = scanner.nextInt();

        System.out.print("¿Cuántas veces llegaste en segundo lugar? (Fichas azules): ");
        fichasAzules = scanner.nextInt();

        System.out.print("¿Cuántas veces llegaste en tercer lugar? (Fichas amarillas): ");
        fichasAmarillas = scanner.nextInt();

        // Calcular puntaje
        int puntaje = calcularPuntaje(fichasRojas, fichasAzules, fichasAmarillas);

        // Mostrar resultado
        System.out.println("\n--- Resultado del Puntaje ---");
        System.out.println("Fichas Rojas: " + fichasRojas);
        System.out.println("Fichas Azules: " + fichasAzules);
        System.out.println("Fichas Amarillas: " + fichasAmarillas);
        System.out.println("El puntaje total es: " + puntaje);
    }

    // Función para calcular el puntaje
    public static int calcularPuntaje(int fichasRojas, int fichasAzules, int fichasAmarillas) {
        // Fórmula: (Fichas rojas al cubo) + (Fichas azules por 2) - (Fichas amarillas al cuadrado)
        return (int) (Math.pow(fichasRojas, 3) + 2 * fichasAzules - Math.pow(fichasAmarillas, 2));
    }
}