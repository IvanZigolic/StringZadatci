import java.util.Scanner;

public class ZadatakAnalizaTeksta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tekst: ");
        String unos = sc.nextLine();
        String znakovi = "[,\\s]";
        String samoglasnici[] = {"a", "e", "i", "o", "u" };
        String[] runos = unos.split(znakovi);
        System.out.println("Uneseno: ");
        System.out.print(unos);
        System.out.println();
        System.out.println("||--------BROJ RIJECI--------||");
        int br = 0;
        for(String i : runos){
            if(!i.equals("")) {
                br++;
            }
        }
        System.out.println("Broj rijeci: " + br);

        for(int j = 0; j <runos.length; j++ ) {
            runos[j] = runos[j].toLowerCase();
        }
        System.out.println();
        System.out.println("||--------PALINDROMI--------||");
        for(int z = 0; z < runos.length; z++){
            StringBuilder sb = new StringBuilder(runos[z]);
            sb = sb.reverse();
            String pom = sb.toString();
            if(pom.equals(runos[z])){
                System.out.println("Palindrom je: " + sb);
            }
        }
        System.out.println();
        System.out.println("||--------PROMJENA RIJECI--------||");
        for(int k = 0; k<runos.length; k++){
            for(String o : samoglasnici)
                if(runos[k].toLowerCase().startsWith(o)) {
                    runos[k] = "Java";
                }
            System.out.print(runos[k] + " ");
            }
        }
    }