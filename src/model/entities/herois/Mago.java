package model.entities.herois;

import model.entities.Jogador;
import model.enums.Arma;
import model.exceptions.ArmaIncompativelComClasseException;

public class Mago extends Jogador {

    public Mago(String nome, String sexo, Arma arma) throws ArmaIncompativelComClasseException {
        super(nome, sexo, arma);
        if (arma != Arma.CAJADO || arma != Arma.GRIMORIO) {
            throw new ArmaIncompativelComClasseException("Arma incompatível com a classe escolhida!");
        }
        super.setPontosDeAtaque(19);
        super.setPontosDeDefesa(11);
    }
}
