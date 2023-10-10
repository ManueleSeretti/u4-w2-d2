package src;

import java.util.*;

public class Esercizio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("inserisci il numero di valori da generare:");
        int n = Integer.parseInt(input.nextLine());

        System.out.println("CREA LISTA ORDINATA");
        List<Integer> lista = creaLista(n);

        System.out.println(lista);
        System.out.println("CREA LISTA INVERSA");
        List<Integer> lista2 = invertiLista(lista);
        System.out.println(lista2);
        System.out.println("STAMPA PARI O DISPARI");
        pariDispari(lista, true);
    }

    public static List<Integer> creaLista(int n) {
        List<Integer> lista = new ArrayList<>();
        Random rndm = new Random();
        for (int i = 0; i < n; i++) {
            lista.add(rndm.nextInt(0, 100));
        }
        Collections.sort(lista);
        return lista;

    }

    public static List<Integer> invertiLista(List<Integer> list) {
        List<Integer> lista2 = new ArrayList<>(list);
        Collections.sort(lista2, Collections.reverseOrder());
        return lista2;
    }

    public static void pariDispari(List<Integer> list, boolean x) {
        int c;
        if (x) c = 1;
        else c = 0;

        for (int i = c; i < list.size(); i = i + 2) {
            System.out.println(list.get(i));
        }

    }
}
