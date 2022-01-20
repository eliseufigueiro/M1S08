package model.entities.inimigos;

import model.entities.Inimigo;
import model.entities.Personagem;
import model.enums.Arma;

public class Lider extends Inimigo {

    private static final Integer MAX_HP = 200;

    public Lider() {
        super(MAX_HP, 15, 15, Arma.MACHADO_DUPLO);
    }

    @Override
    public void atacar(Personagem atacado) {

    }
}
