package model.servicos;

import model.entities.Personagem;
import model.enums.Arma;
import model.enums.Classes;

import java.util.EnumSet;

public class Planilha {

    private String nome;
    private String sexo;
    private Personagem classe;
    private Arma arma;

    public Planilha() {

    }

    public Planilha(String nome, String sexo, Personagem classe, Arma arma) {
        this.nome = nome;
        this.sexo = sexo;
        this.classe = classe;
        this.arma = arma;
    }

    public EnumSet<Classes> classesDisponiveis() {

        return EnumSet.allOf(Classes.class);
    }

    public EnumSet<Arma> armasDisponiveis(Classes classe) {

        EnumSet<Arma> arma = null;
        if (classe == Classes.ARQUEIRO) {
            arma = EnumSet.of(Arma.ARCO, Arma.CAJADO);
        } else if (classe == Classes.GUERREIRO){
            arma = EnumSet.of(Arma.ESPADA, Arma.MACHADO);
        } else if (classe == Classes.MAGO){
            arma = EnumSet.of(Arma.CAJADO, Arma.GRIMORIO);
        } else if (classe == Classes.PALADINO){
            arma = EnumSet.of(Arma.CLAVA, Arma.MARTELO);
        }

        return arma;
    }
}
