public class Operatoren {

    public static void main(String [] args) {

        int ergebnis = 4 + 8 * 9 - 1;

        System.out.println(ergebnis);

        byte zaehler = 1;

        System.out.println(zaehler);

        int div = 22 / 6;

        System.out.println(div);

        System.out.println( false || false);
        System.out.println( false || true);
        System.out.println( true || false);
        System.out.println( true || true);

        System.out.println( false && false);
        System.out.println( false && true);
        System.out.println( true && false);
        System.out.println( true && true);

        System.out.println("\n");

        byte schalter = 10;
        System.out.println(schalter > 7&&schalter < 12);

        System.out.println(schalter == 12);

        System.out.println("\n");
        System.out.println("\n");

        int a = 2, b = 3;
        char name = 'Q';

        System.out.println(a < b);
        System.out.println(2 * a <= b);
        System.out.println(name != 'Q');
        System.out.println(2 * a == a + b -1);
        System.out.println(name == 81);
        System.out.println(b - a > 1);
        System.out.println(a != b - 1);

        System.out.println("\n");

        int x = 10, y = 5;
        char buchstabe = 'f';
        boolean z = true;

        System.out.println(x < 9 || y >= 11);
        System.out.println(x > 9 || (y > 7 && buchstabe == 'f'));
        System.out.println((x < 5 || y < 11) && (buchstabe != 'a' || x == 4));
        System.out.println(!(x == 10) && y <= 11);
        System.out.println(!(x == 10));
        System.out.println(z);
        System.out.println(!(x != 10) && ((!(buchstabe != 'f') && x < 11) && !z) );

    }
}
