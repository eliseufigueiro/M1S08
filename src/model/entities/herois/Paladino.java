package model.entities.herois;

import model.entities.Jogador;
import model.entities.Personagem;
import model.enums.Arma;
import model.enums.Motivacao;
import model.exceptions.ArmaIncompativelComClasseException;

public class Paladino extends Jogador {

    public Paladino(String nome, char sexo, Arma arma) throws ArmaIncompativelComClasseException {
        super(13, 18, nome, sexo, arma);
        if (arma != Arma.CLAVA && arma != Arma.MARTELO) {
            throw new ArmaIncompativelComClasseException("Arma incompatível com a classe escolhida!");
        }
    }

    @Override
    public void atacar(Personagem atacado) {

    }
}
