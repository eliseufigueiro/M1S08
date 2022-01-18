package model.entities;

import model.enums.Arma;
import model.enums.Motivacao;

public abstract class Jogador extends Personagem implements Atacante {

    private String nome;
    private String sexo;
    private Motivacao motivacao;
    private Arma arma;
    private final Integer maxHP = 200;

    public Jogador() {

    }

    public Jogador(Integer pontosDeSaude, Integer pontosDeAtaque, Integer pontosDeDefesa, String nome, String sexo, Motivacao motivacao, Arma arma) {
        super(pontosDeSaude, pontosDeAtaque, pontosDeDefesa);
        if (nome == "") {
            throw new IllegalArgumentException("Seu personagem precisa de um Nome bacana!");
        }
        if (sexo != "M" || sexo != "F") {
            throw new IllegalArgumentException("Utilize M ou F, maiúsculos!");
        }
        this.nome = nome;
        this.sexo = sexo;
        this.motivacao = motivacao;
        this.arma = arma;
    }

}
