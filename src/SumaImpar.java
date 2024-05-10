import java.util.Scanner;

public class SumaImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar n para sumar todos los impares desde 0 hasta n : ");
        int num = scanner.nextInt();

        int suma = 0;
        for (int i = 0; i <= num; i++) {
            if (i%2 != 0) {
                suma += i;
            }
        }

        System.out.println(suma);

    }

}
