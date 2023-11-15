import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

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


    }
}