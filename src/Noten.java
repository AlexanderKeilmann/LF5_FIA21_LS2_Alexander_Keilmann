import java.util.Scanner;

public class Noten {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben sie eine Note ein: ");
        int Note = scanner.nextInt();

        if (Note == 1){
            System.out.print("Sehr gut");
       }
        else if (Note == 2){
            System.out.print("Gut");
        }
        else if (Note == 3){
            System.out.print("Befriedigend");
        }
        else if (Note == 4){
            System.out.print("Ausreichend");
        }
        else if (Note == 5){
            System.out.print("Mangelhaft");
        }
        else if (Note == 6){
            System.out.print("Ungenügend");
        }
        else
        {
            System.out.print("Fehler Note gibt es nicht!");
        }
    }
}
