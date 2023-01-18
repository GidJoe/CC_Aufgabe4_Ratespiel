import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Hier wird mit "Random" eine zufällige Zahl generiert mit der Funktion "Random"
        Random rd = new Random();
        // Variablen deklarieren
        int zähler = 1, eingabe, rng = rd.nextInt(1, 100);

        // Scanner einfügen
        Scanner myscan = new Scanner(System.in);


        System.out.println("Zahlenraten!");
        System.out.println("1-100");
        //System.out.println(rng);

        // While schleife mit Fallunterscheidungen
        while (true) {
            System.out.println("Zahl?      (0 zum beenden)");
            eingabe = myscan.nextInt();
            if (eingabe == 0) break;
            if (eingabe == rng) {
                System.out.println("RICHTIG !!! " + "Versuche "+ zähler);
                myscan.nextInt();
                break;
            } else {
                System.out.println("Leider falsch, versuchs nochmal ");
                zähler++;
            }


        }

        // Resources des Scanners freigeben
        myscan.close();
    }
}