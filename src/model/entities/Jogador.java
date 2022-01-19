package model.entities;

import model.enums.Arma;
import model.enums.Motivacao;

public abstract class Jogador extends Personagem implements Atacante {

    private String nome;
    private String sexo;
    private Motivacao motivacao;
    private Arma arma;
    private final Integer MAX_HP = 200;

    public Jogador() {

    }

    public Jogador(String nome, String sexo, Arma arma) {
        if (nome == "") {
            throw new IllegalArgumentException("Seu personagem precisa de um Nome bacana!");
        }
        if (sexo != "M" || sexo != "F") {
            throw new IllegalArgumentException("Utilize M ou F, maiúsculos!");
        }
        super.setPontosDeSaude(MAX_HP);
        this.nome = nome;
        this.sexo = sexo;
        this.arma = arma;
    }
}
