import java.util.Scanner;

public class CreateRomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int number = sc.nextInt();
        int rombLenght = number;

        for (int i = 0; i < number; i++) {

            for (int j = 0; j < rombLenght; j++) {
                System.out.print(" ");
            }

            rombLenght--;

            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
