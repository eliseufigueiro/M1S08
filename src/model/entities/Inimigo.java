package model.entities;

import model.enums.Arma;

public abstract class Inimigo extends Personagem implements Atacante {

    private Arma arma;

    public Inimigo(Integer pontosDeSaude, Integer pontosDeAtaque, Integer pontosDeDefesa, Arma arma) {
        super(pontosDeSaude, pontosDeAtaque, pontosDeDefesa);
        this.arma = arma;
    }
}
