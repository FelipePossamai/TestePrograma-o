package model;

import java.util.ArrayList;

public class Participante {
    
    public int id;
    public String nome;
    public String sobrenome;
    public ArrayList<Salas> salas;
    public ArrayList<Intervalo> intervalos;

    public Participante(int id, String nome, String sobrenome, ArrayList<Salas> salas, ArrayList<Intervalo> intervalos) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salas = salas;
        this.intervalos = intervalos;
    }  
    
    public Participante(int id, String nome, String sobrenome) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salas = new ArrayList<>();
        this.intervalos = new ArrayList<>();
    }  
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public ArrayList<Salas> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Salas> salas) {
        this.salas = salas;
    }
    
    public void addSalas(Salas sala) {
        this.salas.add(sala);
    }

    public ArrayList<Intervalo> getIntervalos() {
        return intervalos;
    }

    public void setIntervalos(ArrayList<Intervalo> intervalos) {
        this.intervalos = intervalos;
    }
    
    public void addIntervalos(Intervalo intervalo) {
        this.intervalos.add(intervalo);
    }
}
