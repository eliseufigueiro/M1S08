package model.entities;

public abstract class Personagem {

    private Integer pontosDeSaude;
    private Integer pontosDeAtaque;
    private Integer pontosDeDefesa;

    public Personagem() {
    }

    public Personagem(Integer pontosDeSaude, Integer pontosDeAtaque, Integer pontosDeDefesa) {
        this.pontosDeSaude = pontosDeSaude;
        this.pontosDeAtaque = pontosDeAtaque;
        this.pontosDeDefesa = pontosDeDefesa;
    }

    public Integer getPontosDeSaude() {

        return pontosDeSaude;
    }

    public void setPontosDeSaude(Integer pontosDeSaude) {

        this.pontosDeSaude = pontosDeSaude;
    }

    public Integer getPontosDeAtaque() {

        return pontosDeAtaque;
    }

    public void setPontosDeAtaque(Integer pontosDeAtaque) {

        this.pontosDeAtaque = pontosDeAtaque;
    }

    public Integer getPontosDeDefesa() {

        return pontosDeDefesa;
    }

    public void setPontosDeDefesa(Integer pontosDeDefesa) {

        this.pontosDeDefesa = pontosDeDefesa;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "pontosDeSaude=" + pontosDeSaude +
                ", pontosDeAtaque=" + pontosDeAtaque +
                ", pontosDeDefesa=" + pontosDeDefesa +
                '}';
    }
}
