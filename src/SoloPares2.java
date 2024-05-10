import java.util.Scanner;

public class SoloPares2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar n para generar los primeros n pares: ");
        int num = scanner.nextInt();

        int n = 2;
        while(num > 0) {
            System.out.println(n);
            n += 2;
            num--;
        }

    }

}
