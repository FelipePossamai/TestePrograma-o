package model;

import static modelDAO.Banco.participante;

public class ConsultaP {
    
    private int id;
    private Participante nome;
    private Participante sobrenome;
    private Salas espacoE;
    private Intervalo espacoC;
    private Participante participante;

    public ConsultaP(Participante participante) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.espacoE = espacoE;
        this.espacoC = espacoC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Participante getNome() {
        return nome;
    }

    public void setNome(Participante nome) {
        this.nome = nome;
    }

    public Participante getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(Participante sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Salas getEspacoE() {
        return espacoE;
    }

    public void setEspacoE(Salas espacoE) {
        this.espacoE = espacoE;
    }

    public Intervalo getEspacoC() {
        return espacoC;
    }

    public void setEspacoC(Intervalo espacoC) {
        this.espacoC = espacoC;
    }
    
}
