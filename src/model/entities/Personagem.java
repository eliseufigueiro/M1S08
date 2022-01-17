package model.entities;

public abstract class Personagem {

    private Integer pontosDeSaude;
    private Integer pontosDeAtaque;
    private Integer pontosDeDefesa;

    public Personagem(Integer pontosDeSaude, Integer pontosDeAtaque, Integer pontosDeDefesa) {
        this.pontosDeSaude = pontosDeSaude;
        this.pontosDeAtaque = pontosDeAtaque;
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
