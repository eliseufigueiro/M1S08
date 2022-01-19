package model.entities;

import model.enums.Arma;
import model.exceptions.ArmaIncompativelComClasseException;

public class Arqueiro extends Jogador {

    public Arqueiro(String nome, String sexo, Arma arma) throws ArmaIncompativelComClasseException {
        super(nome, sexo, arma);
        if (arma != Arma.ARCO || arma != Arma.BESTA) {
            throw new ArmaIncompativelComClasseException("Arma incompatível com a classe escolhida!");
        }
        super.setPontosDeAtaque(18);
        super.setPontosDeDefesa(13);
    }
}
