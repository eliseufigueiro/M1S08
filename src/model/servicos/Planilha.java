package model.servicos;

import model.entities.Jogador;
import model.entities.herois.Arqueiro;
import model.entities.herois.Guerreiro;
import model.entities.herois.Mago;
import model.entities.herois.Paladino;
import model.enums.Arma;
import model.enums.Classes;
import model.exceptions.ArmaIncompativelComClasseException;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Scanner;

public class Planilha {

    public EnumSet<Classes> classesDisponiveis() {

        return EnumSet.allOf(Classes.class);
    }

    public EnumSet<Arma> armasDisponiveis(Classes classe) {

        EnumSet<Arma> arma = null;
        if (classe == Classes.ARQUEIRO) {
            arma = EnumSet.of(Arma.ARCO, Arma.BESTA);
        } else if (classe == Classes.GUERREIRO) {
            arma = EnumSet.of(Arma.ESPADA, Arma.MACHADO);
        } else if (classe == Classes.MAGO) {
            arma = EnumSet.of(Arma.CAJADO, Arma.GRIMORIO);
        } else if (classe == Classes.PALADINO) {
            arma = EnumSet.of(Arma.CLAVA, Arma.MARTELO);
        }

        return arma;
    }

    public void preencherPlanilha() throws ArmaIncompativelComClasseException, IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá nobre Jogador(a), vamos preencher sua Planilha?\n");

        System.out.println("Escolha um nome bacana para o(a) personagem!");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.println("\nAgora vamos escolher o sexo 'M' ou 'F'?");
        System.out.print("Use Letra Maiúscula: ");
        char sexo = sc.next().charAt(0);

        System.out.println("\nEscolha sua Classes preferida disponíveis: " + classesDisponiveis());
        System.out.print("Use Letra Maiúscula: ");
        Classes classe = Classes.valueOf(sc.next());

        System.out.println("\nAgora falta pouco! Escolha sua arma: " + armasDisponiveis(classe));
        System.out.print("Use Letra Maiúscula: ");
        Arma arma = Arma.valueOf(sc.next());

        Jogador jogador = null;
        switch (classe) {

            case ARQUEIRO -> jogador = new Arqueiro(nome, sexo, arma);
            case GUERREIRO -> jogador = new Guerreiro(nome, sexo, arma);
            case MAGO -> jogador = new Mago(nome, sexo, arma);
            case PALADINO -> jogador = new Paladino(nome, sexo, arma);
        }

        System.out.println("\n******** PLANILHA D&D ********\n" +
                " -CLASSE......: " + classe + "\n" +
                " -NOME........: " + jogador.getNome() + "\n" +
                " -SEXO........: " + jogador.getSexo() + "\n" +
                " -ARMA........: " + jogador.getArma() + "\n" +
                " -ATAQUE......: " + jogador.getPontosDeAtaque() + "\n" +
                " -DEFESA......: " + jogador.getPontosDeDefesa() + "\n" +
                " -MAX HP......: " + jogador.getPontosDeSaude() + "\n" +
                "******************************");

        System.out.print("\nPressione Enter para começar sua Aventura!");
        System.in.read();
    }
}
