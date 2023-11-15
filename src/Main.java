import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        //pierwsze dwa znaki przeniesione na tyl pod warunkiem ze sa minimum 3
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj string");
        String podanyString = scanner.nextLine();

        int iloscZnakow = podanyString.length();
        System.out.println(iloscZnakow);
        if (iloscZnakow < 3){
            System.out.println(podanyString);
        } else {
            System.out.println(podanyString.substring(2) + podanyString.substring(0,2));
        }

        //podaj string, podaj numer, wydrukuj np.  4 znaki otaczajacy 4 index "siema siema" -> "ma s"
        System.out.println("Podaj drugi string");
        String podanyStringB = scanner.nextLine();
        System.out.println("Podaj index");
        int index = scanner.nextInt();
        String czteryZnaki;

        if (index + 4 <= podanyStringB.length()){
            czteryZnaki = podanyStringB.substring(index, index + 4);
            System.out.println("Wycięty teskt to: " + czteryZnaki);
        }  else {
            System.out.println("Niepoprawny index");
        }

        // Math
        System.out.println("Podaj kolejno a, b, c trójmianu kwadratowego");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = pow(b,2) - 4 * a * c;

        if (a == 0){
            double x = -c / b;
            System.out.printf("Rozwiązanie to %.2f\n", x);
        } else {
            if (delta > 0) {
                double x1 = (-b - sqrt(delta) / (2 * a));
                double x2 = (-b + sqrt(delta) / (2 * a));
                System.out.printf("Pierwiastkami równania kwadratowego są %.2f i %.2f\n", x1, x2);
            } else if (delta == 0) {
                double x0 = (-b / (2 * a));
                System.out.printf("Równanie kwadratowe ma jeden pierwiastek %.2f\n", x0);
            } else {
                System.out.println("Równanie nie ma pierwiastków");
            }
        }

        // random
        double[] tabDouble = new double[20];
        for (int i = 0; i < tabDouble.length; i++){
            tabDouble[i] = random() * 40 + 30;
            System.out.println(tabDouble[i]);
        }

        int[] tabInt = new int[20];
        for (int i = 0; i < tabInt.length; i++){
            tabInt[i] = (int)(random() * 40 + 30);
            System.out.println(tabInt[i] + " ");
        }
        System.out.println();
    }
}