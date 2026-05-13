import java.util.Scanner;

public class StringZadatci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tekst: ");
        String unos = sc.nextLine();
        System.out.println(unos);
        unos = unos.replaceAll(" ", "");
        System.out.println(unos);
        int brs = 0;
        int brn = 0;
        int brz = 0;
        for(char i : unos.toCharArray()) {
        if(i>= 'a' && i<='z' || i>= 'A' && i<='Z'){ brs++; }
        else if(i>= '0' && i<= '9'){ brn++; }
        else{ brz++; }
        }
        System.out.println("Unos ima " + brs + " slova, " + brn + " brojeva i " + brz + " znaka.");
    }
}