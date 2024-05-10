import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar la cantidad de numeros de la serie de Fibonacci a generar : ");
        int amount = scanner.nextInt();

        int n = 0;
        int n_1 = 0;
        int n_2 = 1;

        while(amount > 0) {
            System.out.println(n);
            n = n_1+n_2;
            n_2 = n_1;
            n_1 = n;
            amount--;
        }

    }

}
