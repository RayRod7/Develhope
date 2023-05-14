package src.test.CheckpointMay11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 /*
    # Azienda di trasporti
    Immagina di dover creare un programma per gestire un'azienda di trasporti che ha diversi tipi di veicoli (ad esempio, camion, autobus, auto, ecc.). Ogni veicolo ha un nome, un'anno di produzione, una capacità di carico e una velocità massima.

    Inoltre, l'azienda ha bisogno di tenere traccia dei veicoli attivi e inattivi e di avere la possibilità di cercare veicoli per nome, anno di produzione o velocità massima.

    Utilizza l'ereditarietà per creare una classe astratta "Veicolo" con i campi comuni a tutti i veicoli (nome, anno di produzione, capacità di carico, velocità massima) e quindi crea una sottoclasse per ogni tipo di veicolo. Ad esempio, potresti avere una classe "Camion" e una classe "Auto".

    Utilizza le interfacce per definire le funzionalità comuni che i veicoli devono avere, ad esempio "consumo di carburante", "chilometri percorsi" e "usura".

    Utilizza le enum per definire lo stato dei veicoli (attivo o inattivo) e per definire i criteri di ricerca (nome, anno di produzione, velocità massima).

    Utilizza le collezioni per tenere traccia dei veicoli, ad esempio una mappa dove la chiave è il nome del veicolo e il valore è il veicolo stesso.

    Utilizza i Java Streams per cercare i veicoli in base ai criteri di ricerca e gestire le eccezioni in caso di input errati o mancanti.

            Infine, crea un'interfaccia utente che consente all'utente di inserire, visualizzare e cercare i veicoli. L'interfaccia utente dovrebbe anche consentire all'utente di modificare lo stato dei veicoli (attivo o inattivo).

    Suggerimenti:

            * Utilizza l'interfaccia Map per contenere i veicoli, dove la chiave è il nome del veicolo e il valore è il veicolo stesso.
            * Utilizza l'interfaccia List per contenere i veicoli attivi o inattivi.
            * Utilizza il metodo filter di Java Streams per cercare i veicoli in base ai criteri di ricerca.

     */

public class Main {
    public static void main(String[] args) {

        List<Veicolo> veicoloList = new ArrayList<>();
        veicoloList.add((new Auto("fiat", 2022, 400, 150.0, 15000.0)));
        veicoloList.add((new Camion("iveco", 1999, 2000, 100.0)));

        Map<String, Veicolo> myMap = new HashMap<>();

        for(Veicolo veicoli : veicoloList){
            myMap.put(veicoli.getNome(), veicoli);
        }


    }
}
