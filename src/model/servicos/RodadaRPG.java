package model.servicos;

import model.entities.Jogador;
import model.entities.inimigos.Armeiro;
import model.enums.Motivacao;

public class RodadaRPG {

    private static Jogador jogador;

    public Jogador getJogador() {

        return jogador;
    }

    public void planilha() {

        Planilha planilha = new Planilha();
        jogador = planilha.preencherPlanilha();
    }

    public void rodadaRPG() {

        Combate combate = null;
        Interacao interacao = new Interacao();
        Historia historia = new Historia();

        //Inicio da Aventura
        historia.tituloDaAventura();

        planilha();

        historia.introducao();

        jogador.setMotivacao(interacao.motivacao());
        historia.motivacao(jogador.getMotivacao());

        if (interacao.segueEmFrenteOuDesiste() == Motivacao.DESISTE) {

            historia.desiste();

        } else if (interacao.segueEmFrenteOuDesiste() == Motivacao.FRENTE) {

            historia.segueEmFrente();
            historia.entrarNaSala(interacao.andandoCorrendoSaltando());
            historia.dentroDaSala();
            historia.combateArmeiro(new Combate(jogador, new Armeiro()));
            historia.combateArmeiroPegarArmadura(interacao.pegarArmadura());
            historia.combateAlquimista();
            historia.combateAlquimistaPegarCarrafa(interacao.pegarGarrafa());
            historia.combateLider(interacao.iniciativaAtacarEsperar());
            historia.finalAventura();
        }
    }
}
