package model.entities;

import model.enums.Arma;
import model.exceptions.ArmaIncompativelComClasseException;

public class Guerreiro extends Jogador {

    public Guerreiro(String nome, String sexo, Arma arma) throws ArmaIncompativelComClasseException {
        super(pontosDeSaude, pontosDeAtaque, pontosDeDefesa, nome, sexo, arma);
        if (arma != Arma.ESPADA || arma != Arma.MACHADO) {
            throw new ArmaIncompativelComClasseException("Arma incompativél com a classe escolhida!");
        }
    }

}
