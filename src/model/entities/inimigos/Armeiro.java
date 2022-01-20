package model.entities.inimigos;

import model.entities.Inimigo;
import model.entities.Personagem;
import model.enums.Arma;

public class Armeiro extends Inimigo {

    private static final Integer MAX_HP = 100;

    public Armeiro() {
        super(MAX_HP, 10, 15, Arma.ESPADA);
    }

    @Override
    public void atacar(Personagem atacado) {

    }
}
