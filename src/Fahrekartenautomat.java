import java.util.Scanner;

class Fahrkartenautomat {

    public static void begruessung() {

        System.out.println("Herzlich Willkommen");
    }

    public static double fahrkartenbestellungErfassen(Scanner tastatur) {

        int ArtDesTickets;
        int AnzahlderTickets;
        while (true) {
            System.out.println("Wählen Sie ihre Wunschfahrkarte für Berlin AB aus: ");
            System.out.println("Kurzstrecke AB [2,00€] (1)");
            System.out.println("Einzelfahrschein AB [3,00€] (2)");
            System.out.println("Tageskarte AB [8,80€] (3)");
            System.out.println("4-Fahrten-Karte [9,40€] (4)");
            ArtDesTickets = tastatur.nextInt();
            System.out.println("Ihre Wahl " + ArtDesTickets);
            if (ArtDesTickets > 4 || ArtDesTickets < 1) {
                System.out.println(">>falsche Eingabe<<");
                break;
            } else {
            }


        }

        System.out.print("Anzahl der Ticket: ");
        AnzahlderTickets = tastatur.nextInt();

        while (AnzahlderTickets < 1 || AnzahlderTickets > 10) {
            System.out.print("Wählen Sie bitte eine Anzahl von 1 bis 10 Tickets aus\n");

            System.out.print("Anzahl der Ticket: ");
            AnzahlderTickets = tastatur.nextInt();

        }

        ArtDesTickets = ArtDesTickets * AnzahlderTickets;
        return ArtDesTickets;
    }

    public static double fahrkartenBezahlen(Scanner tastatur1, double zuZahlenderBetrag) {

        int ArtDesTickets = 0;
        double eingeworfeneMuenze = 0;

        zuZahlenderBetrag = fahrkartenbestellungErfassen(tastatur1);
        double eingezahlterGesamtbetrag = fahrkartenBezahlen(tastatur1, zuZahlenderBetrag);
        double nochZuZahlen = 0.0;

        Scanner tastatur = new Scanner(System.in);

        while (eingezahlterGesamtbetrag < ArtDesTickets) {
            nochZuZahlen = ArtDesTickets - eingezahlterGesamtbetrag;
            System.out.println("Noch zu zahlen: " + nochZuZahlen + " Euro");
            System.out.print("Eingabe (mind. 5 Cent, höchstens 2 Euro): ");
            eingeworfeneMuenze = tastatur1.nextDouble();
            eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
        }

        return eingezahlterGesamtbetrag;
    }

    public static void fahrkartenAusgabe() {

        System.out.println("\nFahrschein wird ausgegeben");
        for (int i = 0; i < 8; i++) {
            System.out.print("=");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void rueckgeld() {

        double rueckgabebetrag;
        double eingezahlterGesamtbetrag=0;
        int ArtDesTickets=0;

        rueckgabebetrag = eingezahlterGesamtbetrag - ArtDesTickets;
        if (rueckgabebetrag > 0.00) {
            System.out.println("Der Rückgabebetrag in Höhe von " + rueckgabebetrag + " Euro");
            System.out.println("wird in folgenden Münzen ausgezahlt:");

            while (rueckgabebetrag >= 20.0) { //20-Euro-Schein
                System.out.println("20 Euro");
                rueckgabebetrag = rueckgabebetrag - 20.0;
            }
            while (rueckgabebetrag >= 10.0) { // 10-Euro-Schein
                System.out.println("10 Euro");
                rueckgabebetrag = rueckgabebetrag - 10.0;
            }
            while (rueckgabebetrag >= 5.0) { // 5-Euro-Schein
                System.out.println("5 Euro");
                rueckgabebetrag = rueckgabebetrag - 5.0;
            }
            while (rueckgabebetrag >= 2.0) { // 2-Euro-Münzen
                System.out.println("2 Euro");
                rueckgabebetrag = rueckgabebetrag - 2.0;
            }
            while (rueckgabebetrag >= 1.0) { // 1-Euro-Münzen
                System.out.println("1 Euro");
                rueckgabebetrag = rueckgabebetrag - 1.0;
            }
            while (rueckgabebetrag >= 0.5) { // 50-Cent-Münzen
                System.out.println("50 Cent");
                rueckgabebetrag = rueckgabebetrag - 0.5;
            }
            while (rueckgabebetrag >= 0.2) { // 20-Cent-Münzen
                System.out.println("20 Cent");
                rueckgabebetrag = rueckgabebetrag - 0.2;
            }
            while (rueckgabebetrag >= 0.1) { // 10-Cent-Münzen
                System.out.println("10 Cent");
                rueckgabebetrag = rueckgabebetrag - 0.1;
            }
            while (rueckgabebetrag >= 0.049) { // 5-Cent-Münzen
                System.out.println("5 Cent");
                rueckgabebetrag = rueckgabebetrag - 0.05;
            }

        }
        System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
                + "Wir wünschen Ihnen eine gute Fahrt.");
    }
}