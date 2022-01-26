package view;

import model.exceptions.ArmaIncompativelComClasseException;
import model.servicos.Historia;
import model.servicos.Planilha;

import java.io.IOException;
import java.util.Scanner;

public class BatalhaFinal {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Planilha planilha = new Planilha();
        Historia historia = new Historia();

        try {
            System.out.println("\nSeja bem vindo(a) à BATALHA FINAL!\n");

            planilha.preencherPlanilha();

            historia.introducao();

            historia.motivacao();

            historia.segueEmFrenteOuDesiste();

        } catch (ArmaIncompativelComClasseException e) {
            e.printStackTrace();

        } finally {
            sc.close();
        }


        //private void combate (/* parâmetros */) {
		/*
		Num combate, cada adversário possui um turno. Quem toma a iniciativa do início do combate possui a vantagem do primeiro turno. O inimigo sempre atacará, e o jogador pode escolher entre atacar e fugir (encerrando o jogo).
		
		Cada ataque leva em consideração os pontos de ataque do personagem + ataque da arma + “rolamento de dado” (valor entre 1-20) para definir o tanto de dano que o atacante irá desferir no defensor. Essa quantidade de dano é subtraída pelos pontos de defesa do defensor. Se o rolamento de dado do atacante for 1, ele erra, e o defensor não sofre nenhum dano. Se o rolamento de dado do atacante for 20, ele conseguirá um acerto crítico, e o seu ataque ignora a defesa do adversário (ou seja, o dano que ele desfere é 100%, sem subtrair pelos pontos de defesa do defensor).
		
		Quando o inimigo ataca, é realizado o cálculo do ataque e o jogo deve atualizar os pontos de vida do jogador, e exibir a mensagem: “O inimigo atacou! Você sofreu X de dano e agora possui Y pontos de vida.” substituindo X pela quantidade de dano do ataque e Y pela quantidade de pontos de vida atual do jogador. Se o inimigo errar, a mensagem exibida deve ser “O inimigo errou o ataque! Você não sofreu dano.”. Se o inimigo acertar um ataque crítico, a mensagem deve ser: "O inimigo acertou um ataque crítico! Você sofreu X de dano e agora possui Y pontos de vida.".
		Caso o ataque do inimigo te leve a 0 pontos de vida, você morre, e a mensagem exibida deve ser “Você não estava preparado para a força do inimigo. {COMPLEMENTO DE ACORDO COM A MOTIVAÇÃO}”, substituindo o conteúdo entre chaves de acordo com a motivação do personagem selecionada no início do jogo. VINGANÇA: “Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.” GLÓRIA: “A glória que buscavas não será sua, e a cidade aguarda por seu(sua) próximo(a) herói(na).” (o gênero deve ser alterado para refletir o sexo do personagem escolhido pelo jogador no início do jogo). O jogo encerra quando o jogador morre.

		Quando é a vez do jogador fazer uma ação, deve ser perguntado a ele se ele deseja atacar ou fugir. Se escolher fugir, o jogo deve exibir a mensagem “Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.”.
		Se escolher atacar, o jogo deve realizar o cálculo do ataque e atualizar os pontos de vida do inimigo. O jogo deve exibir a mensagem “Você atacou {COMPLEMENTO DA ARMA} e causou X de dano no inimigo!”, substituindo o conteúdo entre chaves de acordo com a arma do personagem. Espada, machado, martelo ou clava: “com sua/seu {ARMA}”. Arco+flecha ou besta+virote: “com seu/sua {ARMA}, a/o {MUNIÇÃO} atingiu”. Cajado: “com seu cajado, lançando uma bola de fogo”. Livro: “absorvendo energia do livro com uma mão e liberando com a outra”.
		Se o jogador errar, a mensagem exibida deve ser “Você errou seu ataque! O inimigo não sofreu dano algum.”. Se o jogador acertar um ataque crítico, a mensagem deve ser: "Você acertou um ataque crítico! {COMPLEMENTO}” substituindo o conteúdo entre chaves pela mensagem de ataque normal.
		Caso o inimigo morra com o seu ataque, o jogo deve exibir “O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.”
		*/


    }
}

