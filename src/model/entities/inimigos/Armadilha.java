package model.entities.inimigos;

import model.entities.Atacante;
import model.entities.Jogador;
import model.entities.Personagem;
import model.enums.Arma;
import model.servicos.Historia;

import java.util.Random;

public class Armadilha implements Atacante {

    private Integer pontosDeAtaque;
    private Arma arma;

    public Armadilha() {

        this.pontosDeAtaque = 5;
        this.arma = Arma.ARMADILHA;
    }

    public Integer getPontosDeAtaque() {

        return pontosDeAtaque;
    }

    @Override
    public void atacar(Personagem atacado) {

        String CSI = "\u001B["; //String que recebe as cores
        System.out.print (CSI + "31" + "m");

        Random dadoDe10 = new Random();

        int valorDado = dadoDe10.nextInt(10);
        if (valorDado == 1) {

            System.out.print("\n- O ataque da armadilha pegou de raspão e você não sofreu dano.");

        } else {

            int ataque = atacado.getPontosDeAtaque() + getPontosDeAtaque() + valorDado;
            int dano = atacado.getPontosDeSaude() - ataque;
            atacado.setPontosDeSaude(dano);
            int hp = atacado.getPontosDeSaude();

            System.out.printf("\n- Você sofreu %d de dano e agora possui %d pontos de vida.", ataque, hp);
        }
        System.out.println (CSI + "m");
    }
}
