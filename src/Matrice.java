import java.util.Scanner;
public class Matrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ucitaj broj clanova matrice: ");
        int n = input.nextInt();
        int niz[][] = new int[n][n];
        System.out.println("Matrica " + n + "x" + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }
}