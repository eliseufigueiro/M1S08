package model.servicos;

import model.entities.Inimigo;
import model.entities.Jogador;
import model.enums.Motivacao;

import java.util.Random;

public class Combate {

    private Jogador jogador;
    private Inimigo inimigo;
    private Random iniciativaJogador = new Random(20);
    private Random iniciativaInimigo = new Random(20);

    public Combate(Jogador jogador, Inimigo inimigo) {
        this.jogador = jogador;
        this.inimigo = inimigo;
    }

    public Jogador getJogador() {

        return jogador;
    }

    public Inimigo getInimigo() {

        return inimigo;
    }

    public Random getIniciativaJogador() {

        return iniciativaJogador;
    }

    public Random getIniciativaInimigo() {

        return iniciativaInimigo;
    }

    //Metodo para combate entre Jogador e Inimigo
    public void combate() {

        while (true) {

            try {

                Interacao interacao = new Interacao();

                while (interacao.iniciativaDeCombate() == Motivacao.ATACAR) {

                    System.out.println("OI VOU TENTAR");
                }

                break;

            } catch (IllegalArgumentException e) {

                System.err.println("CAMPO INVALIDO: " + e.getMessage());
                System.out.println("\n");
            }

        }

    }//FIM combate

}
