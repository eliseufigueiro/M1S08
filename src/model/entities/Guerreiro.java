package model.entities;

import model.enums.Arma;
import model.exceptions.ArmaIncompativelComClasseException;

public class Guerreiro extends Jogador {

    public Guerreiro(String nome, String sexo, Arma arma) throws ArmaIncompativelComClasseException {
        super(nome, sexo, arma);
        if (arma != Arma.ESPADA || arma != Arma.MACHADO) {
            throw new ArmaIncompativelComClasseException("Arma incompatível com a classe escolhida!");
        }
        super.setPontosDeAtaque(15);
        super.setPontosDeDefesa(15);
    }
}
