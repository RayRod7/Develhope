package src.test.CheckpointMay11;


public class Auto extends Veicolo implements Funzionalita{
    private Double chilometriPercorsi;

    public Auto(String nome, Integer annoProduzione, Integer capacitaCarico, Double velocitaMassima, Double chilometriPercorsi) {
        super(nome, annoProduzione, capacitaCarico, velocitaMassima, StatoVeicolo.ATTIVO);
        this.chilometriPercorsi = chilometriPercorsi;
    }

    @Override
    public Double consumoCarburante() {
        Double carburanteConsumato;
        carburanteConsumato = getCapacitaCarico() * chilometriPercorsi;
        return carburanteConsumato;
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
