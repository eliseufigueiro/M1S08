package model.servicos;

import model.enums.Motivacao;

import java.util.Scanner;

public class Interacao {
    Scanner sc = new Scanner(System.in);

    public Motivacao motivacao() {

        boolean loop = true;
        Motivacao motivacao = null;

        while (loop) {

            try {
                System.out.print("- Qual é a sua motivação " + Motivacao.VINGANCA + " ou " + Motivacao.GLORIA + "?\n(Use Letra Maiúscula): ");
                motivacao = Motivacao.valueOf(sc.next());

                loop = false;

            } catch (IllegalArgumentException e) {
                System.err.println("CAMPO INVALIDO: " + e.getMessage());
                sc.nextLine();
            }

            sc = new Scanner(System.in); //Cria um novo objeto scanner, quando o loop é acionado não da erro pulando a linha do nome
        }

        return motivacao;
    }

    public Motivacao segueEmFrenteOuDesiste() {

        System.out.print("- Você segue em " + Motivacao.FRENTE + " ou " + Motivacao.DESISTE + "?\n(Use Letra Maiúscula): ");
        return Motivacao.valueOf(sc.next());
    }

    public Motivacao andandoCorrendoSaltando() {

        System.out.print("- Você deseja passar pela porta ANDANDO cuidadosamente, CORRENDO ou SALTANDO?\n(Escolha 1, 2 ou 3): ");
        return Motivacao.valueOf(sc.next());
    }

    public Motivacao pegarArmadura() {

        System.out.print("- Você deseja pegar as armaduras novas SIM ou NAO? ");
        return Motivacao.valueOf(sc.next());
    }

    public Motivacao pegarGarrafa() {

        System.out.print("- Você deseja beber o conteúdo da garrafa SIM ou NAO? ");
        return Motivacao.valueOf(sc.next());
    }

    public Motivacao iniciaticaDeCombate() {

        System.out.print("- Você deseja " + Motivacao.ATACAR + " ou " + Motivacao.ESPERAR + "? ");
        return Motivacao.valueOf(sc.next());
    }
}
