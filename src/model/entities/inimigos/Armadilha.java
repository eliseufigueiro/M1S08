package model.entities.inimigos;

import model.entities.Atacante;
import model.entities.Personagem;
import model.enums.Arma;

public class Armadilha implements Atacante {

    private Integer pontosDeAtaque;
    private Arma arma;

    public Armadilha() {
        this.pontosDeAtaque = 5;
        this.arma = Arma.ARMADILHA;
    }

    @Override
    public void atacar(Personagem atacado) {

    }
}
