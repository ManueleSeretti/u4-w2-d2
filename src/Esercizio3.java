package src;

import java.util.HashMap;
import java.util.Set;

public class Esercizio3 {
    public static void main(String[] args) {
        Utenti u1 = new Utenti("luca", 327000121);
        Utenti u2 = new Utenti("giovanni", 327343521);
        Utenti u3 = new Utenti("marco", 323244421);
        Utenti u4 = new Utenti("anna", 32987621);

        HashMap<String, Integer> rubrica = new HashMap<>();
//INSERIMENTO COPPIA CHIAVE VALORE
        inserisciUtente(rubrica, u1);
        inserisciUtente(rubrica, u2);
        inserisciUtente(rubrica, u3);
        inserisciUtente(rubrica, u4);

        System.out.println(rubrica);
//RIMOZIONE DI UN UTENTE DANDO IL NOME
        rimuoviUtente(rubrica, u1);
        System.out.println(rubrica);

        //CERCA UTENTE TRAMITE NUMERO

        cercaUtenteNumero(rubrica, 32987621);

//CERCA UTENTE TRAMITE NOME
        cercaUtenteNome(rubrica, u3.getName());
    }

    public static void inserisciUtente(HashMap rub, Utenti x) {
        rub.put(x.getName(), x.getNumber());
    }

    public static void rimuoviUtente(HashMap rub, Utenti x) {
        rub.remove(x.getName());
    }

    public static void cercaUtenteNome(HashMap rub, String x) {
        System.out.println(rub.get(x));
    }

    public static void cercaUtenteNumero(HashMap rub, int x) {
        Set<String> keys = rub.keySet();

        for (String key : keys) {
            int num = (int) rub.get(key);


            if (num == x) {
                System.out.println(key);
                break;
            }
        }
    }

}
