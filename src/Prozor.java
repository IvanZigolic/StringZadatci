import java.util.Scanner;

public class Prozor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite velicinu prozora (duzina x visina)");
        int duzina = input.nextInt();
        int visina = input.nextInt();
        int[][] polje = new int[duzina][visina];
        System.out.println("Prozor duzine " + visina + " visine " + duzina);
        for(int i=0; i < duzina; i++){
            System.out.print("|");
            for(int j=0; j < visina; j++){
                if(i==0){
                    System.out.print("-");
                }
                else if(i==duzina-1){
                    System.out.print("-");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
    }
}
