package src.test.CheckpointMay11;

public abstract class Veicolo {

    private String nome;
    private Integer annoProduzione;
    private Integer capacitaCarico;
    private Double velocitaMassima;
    private StatoVeicolo statoVeicolo;

    public Veicolo(String nome, Integer annoProduzione, Integer capacitaCarico, Double velocitaMassima,StatoVeicolo statoVeicolo) {
        this.nome = nome;
        this.annoProduzione = annoProduzione;
        this.capacitaCarico = capacitaCarico;
        this.velocitaMassima = velocitaMassima;
        this.statoVeicolo = statoVeicolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnnoProduzione() {
        return annoProduzione;
    }

    public void setAnnoProduzione(Integer annoProduzione) {
        this.annoProduzione = annoProduzione;
    }

    public Integer getCapacitaCarico() {
        return capacitaCarico;
    }

    public void setCapacitaCarico(Integer capacitaCarico) {
        this.capacitaCarico = capacitaCarico;
    }

    public Double getVelocitaMassima() {
        return velocitaMassima;
    }

    public void setVelocitaMassima(Double velocitaMassima) {
        this.velocitaMassima = velocitaMassima;
    }

    public StatoVeicolo getStatoVeicolo() {
        return statoVeicolo;
    }

    public void setStatoVeicolo(StatoVeicolo statoVeicolo) {
        this.statoVeicolo = statoVeicolo;
    }
}
