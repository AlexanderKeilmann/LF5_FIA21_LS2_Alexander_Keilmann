public class Schleifen {

    public static void main(String []args){

        for(int i=10;i<=20;i=i+1) {//Um "i" zu erhöhen ist es möglich das man anstatt "i=i+1", "i=i++" schreiben kann, das zusätzliche "+" steht für 1 da
            System.out.printf("%d ", i * i);
        }

        int i = 9;
        while(i <= 20) {

            i = i+1;
            if (i ==11)
                continue;
            if (i ==22)
                break;


            System.out.printf("%d ", i*i);
        }

    }
}
