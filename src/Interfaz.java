import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        System.out.println("Elija una de las siguientes opciones ");
        System.out.println("        Elija 1 para consultar saldo ");
        System.out.println("        Elija 2 para ingresar dinero ");
        System.out.println("        Elija 3 para retirar dinero");
        System.out.println("        Elija 4 para consultar sus ultimos movimientos ");
        System.out.println("una vez ingresada la opcion  presione enter  ");
        Scanner scanner = new Scanner(System.in);

        int opcionSeleccionada = scanner.nextInt();

        System.out.println("La opcion que usted a elegido es: " + opcionSeleccionada);

    }
}
