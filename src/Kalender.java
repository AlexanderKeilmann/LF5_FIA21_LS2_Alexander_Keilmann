import java.time.Month;
import java.util.Scanner;

public class Kalender {

    public static void main(String[] args){

        int tage = 0;
        int monat;
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Wie lautet der Monat (1-12): ");
        monat = tastatur.nextInt();

        tage = Month.of(monat).length(false); //Java Befehl um den Monat auszugeben

        System.out.printf("Der %d-te Monat im Jahr hat %d Tage.", monat, tage);
        tastatur.close();


    }
}
