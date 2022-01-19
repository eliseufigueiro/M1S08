package model.entities;

import model.enums.Arma;
import model.exceptions.ArmaIncompativelComClasseException;

public class Paladino extends Jogador {

    public Paladino(String nome, String sexo, Arma arma) throws ArmaIncompativelComClasseException {
        super(nome, sexo, arma);
        if (arma != Arma.CLAVA || arma != Arma.MARTELO) {
            throw new ArmaIncompativelComClasseException("Arma incompatível com a classe escolhida!");
        }
        super.setPontosDeAtaque(13);
        super.setPontosDeDefesa(18);
    }
}
