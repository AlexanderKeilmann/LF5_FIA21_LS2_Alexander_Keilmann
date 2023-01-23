import java.util.Scanner;

public class Monate {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben eine Zahl ein: ");
        int Monat = scanner.nextInt();

        switch(Monat){
            case 1:
                System.out.print("Januar");
                break;
            case 2:
                System.out.print("Februar");
                break;
            case 3:
                System.out.print("März");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("Mai");
                break;
            case 6:
                System.out.print("Juni");
                break;
            case 7:
                System.out.print("Juli");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("Oktober");
                break;
            case 10:
                System.out.print("September");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
                break;
            default:
                System.out.print("Fehler!");
                break;
        }


    }
}
