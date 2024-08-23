import java.util.Scanner;

public class Taller1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10;
        int b = 5;
        char letra = 'A';
        int numero = 27;
        System.out.println("hola mundo");
        System.out.println("Suma:" +(a+b));
        System.out.println("Resta:" +(a-b));
        System.out.println("Multiplicacion:" +(a*b));
        System.out.println("Division:" +(a/b));
        System.out.println("Letra:" +(letra));
        System.out.print(numero + "%");

        for (int i = 0; i < numero; i++) {
            System.out.println("#");
        }

        System.out.println("Ingrese la temperatura: ");
        int fahrenheit = scanner.nextInt();

        double celsius = (fahrenheit - 32) + 5.0 / 9;
        System.out.println("La temperatura en Celsius es: " +celsius);
        
    }
}
        

