package model.entities.herois;

import model.entities.Jogador;
import model.entities.Personagem;
import model.enums.Arma;
import model.enums.Motivacao;
import model.exceptions.ArmaIncompativelComClasseException;

public class Paladino extends Jogador {

    public Paladino(String nome, String sexo, Motivacao motivacao, Arma arma) throws ArmaIncompativelComClasseException {
        super(13, 18, nome, sexo, motivacao, arma);
        if (arma != Arma.CLAVA || arma != Arma.MARTELO) {
            throw new ArmaIncompativelComClasseException("Arma incompatível com a classe escolhida!");
        }
        super.setPontosDeAtaque(13);
        super.setPontosDeDefesa(18);
    }

    @Override
    public void atacar(Personagem atacado) {

    }
}
