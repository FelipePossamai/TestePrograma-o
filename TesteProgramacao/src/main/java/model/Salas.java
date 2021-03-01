package model;

public class Salas {
    
    public int id;
    public float lotacao;
    public String nome;

    public Salas(int id, String nome, float lotacao) {
        this.id = id;
        this.lotacao = lotacao;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getLotacao() {
        return lotacao;
    }

    public void setLotacao(float lotacao) {
        this.lotacao = lotacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    
}
