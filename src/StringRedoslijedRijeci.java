import java.util.Scanner;

public class StringRedoslijedRijeci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tekst: ");
        String unos = sc.nextLine();
        String znakovi = "[,\\s]"; // Dio za razdvajanje rijeci pronadjen na stackoverflow
        String[] runos = unos.split(znakovi);
        System.out.println("Uneseno: ");
        System.out.println(unos);
        System.out.println();
        System.out.println("Obrnuto: ");
        for(int i=runos.length-1; i>=0; i--){
            System.out.println(runos[i]);
        }
    }
}