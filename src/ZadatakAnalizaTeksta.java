import java.util.Scanner;

public class ZadatakAnalizaTeksta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tekst: ");
        String unos = sc.nextLine();
        String znakovi = "[,\\s]";
        String[] runos = unos.split(znakovi);
        System.out.println("Uneseno: ");
        System.out.println(unos);
        System.out.println();
        int br = 0;
        for(String i : runos){
            if(!i.equals("")) {
                br++;
            }
        }
        System.out.println("Broj rijeci: " + br);

        for(int j = 0; j <runos.length; j++ ) {
            runos[j] = runos[j].toLowerCase();
            System.out.println(runos[j]);
        }
        System.out.println();

        for(int z = 0; z < runos.length; z++){
            StringBuilder sb = new StringBuilder(runos[z]);
            sb = sb.reverse();
            String pom = sb.toString();
            if(pom.equals(runos[z])){
                System.out.println("Palindrom je: " + sb);
            }
        }
    }
}