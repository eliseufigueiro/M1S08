package model.servicos;

import model.entities.Jogador;
import model.entities.herois.Arqueiro;
import model.entities.herois.Guerreiro;
import model.entities.herois.Mago;
import model.entities.herois.Paladino;
import model.enums.Arma;
import model.enums.Classes;
import model.exceptions.ArmaIncompativelComClasseException;
import model.exceptions.NomeIncompativelComClasseException;

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

    public Jogador preencherPlanilha() {

        Scanner sc = new Scanner(System.in);
        boolean planilhaFinalizada = true;
        String CSI = "\u001B[";
        Jogador jogador = null;

        System.out.println("- Olá nobre Jogador(a), vamos preencher sua Planilha?");

        do {
            try {
                System.out.println("\n- Escolha um nome bacana para o(a) personagem!");
                System.out.print("Nome personagem: ");
                String nome = sc.nextLine();

                System.out.println("\n- Agora vamos escolher o sexo 'M' ou 'F'?");
                System.out.print("Use Letra Maiúscula: ");
                char sexo = sc.next().charAt(0);

                System.out.println("\n- Escolha sua Classes preferida disponíveis: " + classesDisponiveis());
                System.out.print("Use Letra Maiúscula: ");
                Classes classe = Classes.valueOf(sc.next());
                if (!classesDisponiveis().equals(EnumSet.allOf(Classes.class))) {
                    throw new NomeIncompativelComClasseException("BLA");
                }

                System.out.println("\n- Agora falta pouco! Escolha sua arma: " + armasDisponiveis(classe));
                System.out.print("Use Letra Maiúscula: ");
                Arma arma = Arma.valueOf(sc.next());

                switch (classe) {

                    case ARQUEIRO -> jogador = new Arqueiro(nome, sexo, arma);
                    case GUERREIRO -> jogador = new Guerreiro(nome, sexo, arma);
                    case MAGO -> jogador = new Mago(nome, sexo, arma);
                    case PALADINO -> jogador = new Paladino(nome, sexo, arma);
                }

                System.out.print(CSI + "34" + "m");
                System.out.println("<*****||====================>");
                System.out.println("  * PLANILHA D&D\n" +
                        "  - CLASSE......: " + classe + "\n" +
                        "  - NOME........: " + jogador.getNome() + "\n" +
                        "  - SEXO........: " + jogador.getSexo() + "\n" +
                        "  - ARMA........: " + jogador.getArma() + "\n" +
                        "  - ATAQUE......: " + jogador.getPontosDeAtaque() + "\n" +
                        "  - DEFESA......: " + jogador.getPontosDeDefesa() + "\n" +
                        "  - MAX HP......: " + jogador.getPontosDeSaude()
                );
                System.out.println("<====================||*****>");
                System.out.println(CSI + "m");

                planilhaFinalizada = false;
            } catch (ArmaIncompativelComClasseException e) {
                System.err.println("REGRA VIOLADA: " + e.getMessage());
                System.out.println("\nVamos preencher a Planilha novamente!");
            } catch (NomeIncompativelComClasseException | IllegalArgumentException e) {
                System.err.println("CAMPO INVALIDO: " + e.getMessage());
                System.out.println("\nVamos preencher a Planilha novamente!");
            }

            sc = new Scanner(System.in); //Cria um novo objeto scanner, quando o loop é acionado não da erro pulando a linha do nome
        } while (planilhaFinalizada);

        System.out.print("- Pressione Enter para começar sua Aventura!");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jogador;
    }
}