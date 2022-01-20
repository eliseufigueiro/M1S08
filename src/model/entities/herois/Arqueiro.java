package model.entities.herois;

import model.entities.Jogador;
import model.entities.Personagem;
import model.enums.Arma;
import model.enums.Motivacao;
import model.exceptions.ArmaIncompativelComClasseException;

public class Arqueiro extends Jogador {

    public Arqueiro(String nome, String sexo, Arma arma) throws ArmaIncompativelComClasseException {
        super(18, 15, nome, sexo, arma);
        if (arma != Arma.ARCO || arma != Arma.BESTA) {
            throw new ArmaIncompativelComClasseException("Arma incompatível com a classe escolhida!");
        }
    }

    @Override
    public void atacar(Personagem atacado) {

    }
}
