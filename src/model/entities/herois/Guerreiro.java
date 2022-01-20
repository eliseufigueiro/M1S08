package model.entities.herois;

import model.entities.Jogador;
import model.entities.Personagem;
import model.enums.Arma;
import model.enums.Motivacao;
import model.exceptions.ArmaIncompativelComClasseException;

public class Guerreiro extends Jogador {

    public Guerreiro(String nome, String sexo, Arma arma) throws ArmaIncompativelComClasseException {
        super(15, 15, nome, sexo, arma);
        if (arma != Arma.ESPADA || arma != Arma.MACHADO) {
            throw new ArmaIncompativelComClasseException("Arma incompatível com a classe escolhida!");
        }
    }

    @Override
    public void atacar(Personagem atacado) {

    }
}
