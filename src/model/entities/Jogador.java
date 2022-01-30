package model.entities;

import model.enums.Arma;
import model.enums.Motivacao;

public abstract class Jogador extends Personagem implements Atacante {

    private String nome;
    private char sexo;
    private Motivacao motivacao;
    private Arma arma;
    private static final Integer MAX_HP = 200;

    public Jogador(Integer pontosDeAtaque, Integer pontosDeDefesa, String nome, char sexo, Arma arma) {
        super(MAX_HP, pontosDeAtaque, pontosDeDefesa);
        if (nome == "") {
            throw new IllegalArgumentException("Seu personagem precisa de um Nome bacana!");
        }
        if (sexo != 'M' && sexo != 'F') {
            throw new IllegalArgumentException("Utilize M ou F, maiúsculos!");
        }
        this.nome = nome;
        this.sexo = sexo;
        this.motivacao = motivacao;
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public Motivacao getMotivacao() {
        return motivacao;
    }

    public void setMotivacao(Motivacao motivacao) {
        this.motivacao = motivacao;
    }

    public Arma getArma() {
        return arma;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", motivacao=" + motivacao +
                ", arma=" + arma +
                '}';
    }
}
