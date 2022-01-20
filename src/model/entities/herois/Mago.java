package model.entities.herois;

import model.entities.Jogador;
import model.entities.Personagem;
import model.enums.Arma;
import model.enums.Motivacao;
import model.exceptions.ArmaIncompativelComClasseException;

public class Mago extends Jogador {

    public Mago(String nome, String sexo, Arma arma) throws ArmaIncompativelComClasseException {
        super(19, 11, nome, sexo, arma);
        if (arma != Arma.CAJADO || arma != Arma.GRIMORIO) {
            throw new ArmaIncompativelComClasseException("Arma incompatível com a classe escolhida!");
        }
    }

    @Override
    public void atacar(Personagem atacado) {

    }
}
