package src;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> setString = new HashSet<>();

        while (true) {
            try {
                System.out.println("inserisci il numero di parole che vuoi inserire:");
                int n = Integer.parseInt(input.nextLine());
                for (int i = 0; i < n; i++) {
                    System.out.println("inserisci la parola da inserire");
                    String parola = input.nextLine();
                    setString.add(parola);
                }
                break;
            } catch (Exception x) {
                System.out.println(x.getMessage());
            }
        }

        for (String s : setString) {
            System.out.println(s);
        }

        System.out.println("la lunghezza del set è : " + setString.size());
    }


}
