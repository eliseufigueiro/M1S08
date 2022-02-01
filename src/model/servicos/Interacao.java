package model.servicos;

import model.enums.Motivacao;

import java.util.Scanner;

public class Interacao {
    Scanner sc = new Scanner(System.in);

    public Motivacao motivacao() {

        Motivacao motivacao;

        while (true) {

            try {
                System.out.print("- Qual é a sua motivação " + Motivacao.VINGANCA + " ou " + Motivacao.GLORIA + "?\n(Use Letra Maiúscula): ");
                motivacao = Motivacao.valueOf(sc.next());

                break;

            } catch (IllegalArgumentException e) {
                System.err.println("CAMPO INVALIDO: " + e.getMessage());
                System.out.println("\n");
            }
        }
        return motivacao;
    }


    public Motivacao segueEmFrenteOuDesiste() {

        System.out.print("- Você segue em " + Motivacao.FRENTE + " ou " + Motivacao.DESISTE + "?\n(Use Letra Maiúscula): ");
        return Motivacao.valueOf(sc.next());
    }

    public Motivacao andandoCorrendoSaltando() {

        System.out.print("- Você deseja passar pela porta ANDANDO cuidadosamente, CORRENDO ou SALTANDO?\n(Use Letra Maiúscula): ");
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

    public Motivacao iniciativaDeCombate(){

        System.out.print("- Você deseja " + Motivacao.ATACAR + " ou " + Motivacao.FUGIR + "? ");
        return Motivacao.valueOf(sc.next());
    }

    public Motivacao iniciativaAtacarEsperar() {

        System.out.print("- Você deseja " + Motivacao.ATACAR + " ou " + Motivacao.ESPERAR + "? ");
        return Motivacao.valueOf(sc.next());
    }
}
