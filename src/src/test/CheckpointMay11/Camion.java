package src.test.CheckpointMay11;

public class Camion extends Veicolo implements Funzionalita{
    public Camion(String nome, Integer annoProduzione, Integer capacitaCarico, Double velocitaMassima) {
        super(nome, annoProduzione, capacitaCarico, velocitaMassima, StatoVeicolo.ATTIVO);
    }

    @Override
    public Double consumoCarburante() {
        return null;
    }

    @Override
    public Double trattaPercorsa(Double chilometri) {
        return null;
    }

    @Override
    public Integer usura() {
        return null;
    }
}
