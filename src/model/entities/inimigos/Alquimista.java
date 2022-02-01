package model.entities.inimigos;

import model.entities.Inimigo;
import model.entities.Personagem;
import model.enums.Arma;

public class Alquimista extends Inimigo {

    private static final Integer MAX_HP = 100;

    public Alquimista() {

        super(MAX_HP, 15, 10, Arma.CAJADO);
    }

    @Override
    public void atacar(Personagem atacado) {

    }
}
