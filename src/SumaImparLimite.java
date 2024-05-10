import java.util.Scanner;

public class SumaImparLimite {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar min:limite inferior para realizar la suma de impares en un intervalo : ");
        int min = scanner.nextInt();
        System.out.print("Ingresar max:limite superior para realizar la suma de impares en un intervalo : ");
        int max = scanner.nextInt();

        int suma = 0;
        for (int i = min; i <= max; i++) {
            if (i%2 != 0) {
                suma += i;
            }
        }

        System.out.println(suma);

    }

}
